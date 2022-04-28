/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.HocPhi;
import Model.LopHoc;
import Model.HocSinh;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class HocPhiController {

    Connection conn = JDBCConnection.getJDBCConnection();
    
   public void Add(HocPhi hp) {

        String sql = "INSERT INTO hocphi(MaHV, MaLop, DaNop, ConThieu, NgayNop, NguoiNop) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hp.getMaHV());
            ps.setString(2, hp.getMaLop());
            ps.setInt(3, hp.getDanop());
            ps.setInt(4, hp.getConthieu());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String NgayNop = sdf.format(hp.getNgaynop());
            ps.setString(5, NgayNop);
            ps.setString(6, hp.getNguoinop());

            int rs = ps.executeUpdate(); //thực hiện truy vấn
            if (rs == 1) {
                System.out.println("SUCCESS: Thêm học phí thành công!");
            } else {
                System.out.println("ERROR: Thêm thất bại!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public HocPhi getHocPhiByMaLop(String MaLop) {

        String sql = "SELECT * FROM hocphi WHERE MaLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MaLop);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HocPhi hp = new HocPhi();
                hp.setMaHV(rs.getString("MaHV"));
                hp.setMaLop(rs.getString("MaLop"));
                hp.setGiatien(rs.getInt("Giatien"));
                hp.setPhainop(rs.getInt("Phainop"));
                hp.setDanop(rs.getInt("Danop"));
                hp.setConthieu(rs.getInt("Conthieu"));
                hp.setNgaynop(rs.getDate("Ngaynop"));
                hp.setNguoinop(rs.getString("Nguoinop"));

                return hp;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    public List<HocPhi> getHocPhiByMaHV(String MaHV) {
        List<HocPhi> hocphi = new ArrayList<>();
        
        String sql = "SELECT * FROM hocphi WHERE MaHV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MaHV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HocPhi hp = new HocPhi();
                hp.setMaHV(rs.getString("MaHV"));
                hp.setMaLop(rs.getString("MaLop"));
                hp.setDanop(rs.getInt("Danop"));
                hp.setConthieu(rs.getInt("Conthieu"));
                hp.setNgaynop(rs.getDate("Ngaynop"));
                hp.setNguoinop(rs.getString("Nguoinop"));

                hocphi.add(hp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hocphi;

    }

    public int Update(HocPhi hp) {
        String sql = "UPDATE hocphi SET  MaLop = ?, Danop = ?, Conthieu = ?, Ngaynop = ?, Nguoinop = ? "
                + " WHERE MaHV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, hp.getMaLop());
            ps.setInt(2, hp.getDanop());
            ps.setInt(3, hp.getConthieu());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String NgayNop = sdf.format(hp.getNgaynop());
            ps.setString(4, NgayNop);
            ps.setString(5, hp.getNguoinop());
            ps.setString(6, hp.getMaHV());
            int rs = ps.executeUpdate();
            if (rs == 1) {
                System.out.println("SUCCESS: Sửa thành công!");
            } else {
                System.out.println("ERROR: Sửa thất bại!");
            }
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public List<HocSinh> getListStudentByName(String HoTen) {
        List<HocSinh> hocsinh = new ArrayList<>();

        String sql = "SELECT * FROM hocvien, lop WHERE hocvien.MaLop = lop.MaLop AND "
                + "hocvien.HoTen like ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%"+ HoTen + "%");
            ResultSet rs = ps.executeQuery(); 
            while (rs.next()) {               
                HocSinh hs = new HocSinh();
                hs.setMaHV(rs.getString("MaHV"));
                hs.setHoTen(rs.getString("HoTen"));
                hs.setTenLop(rs.getString("TenLop"));
                
                hocsinh.add(hs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hocsinh;
    }
//   get thông tin học phí của học sinh theo tên
    public HocPhi getStudentByName(String HoTen) {

        String sql = "SELECT * FROM hocphi, hocvien, lop WHERE hocvien.MaHV = hocphi.MaHV AND "
                + "hocphi.MaLop = lop.MaLop AND  "
                + "hocvien.HoTen = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, HoTen );
            ResultSet rs = ps.executeQuery(); 
            while (rs.next()) {               
                HocPhi hp = new HocPhi();
                hp.setMaHV(rs.getString("MaHV"));
                hp.setTenLop(rs.getString("TenLop"));
                hp.setHoTen(rs.getString("HoTen"));
                hp.setGiatien(rs.getInt("Giatien"));
                hp.setPhainop(rs.getInt("Phainop"));
                hp.setDanop(rs.getInt("Danop"));
                hp.setConthieu(rs.getInt("Conthieu"));
                hp.setNguoinop(rs.getString("Nguoinop"));
                hp.setNgaynop(rs.getDate("Ngaynop"));
                
                return hp;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
    
    // get list học sinh theo lớp theo tên lớp 
    public List<HocSinh> getListHocPhiByTenLop(String TenLop) {
        List<HocSinh> hocsinh = new ArrayList<>();

        String sql = "SELECT * FROM hocphi, lop, hocvien WHERE lop.MaLop = hocphi.MaLop AND"
                + " hocphi.MaHV = hocvien.MaHV AND "
                + "lop.TenLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, TenLop);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HocSinh hs = new HocSinh();
                hs.setMaHV(rs.getString("MaHV"));
                hs.setHoTen(rs.getString("HoTen"));
                hs.setPhainop(rs.getInt("Phainop"));
                hs.setDanop(rs.getInt("Danop"));
                hs.setConthieu(rs.getInt("Conthieu"));
                hs.setNgaynop(rs.getDate("Ngaynop"));
                hs.setNguoinop(rs.getString("Nguoinop"));

                hocsinh.add(hs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hocsinh;

    }
    public List<LopHoc> getListClassByName(String TenLop) {
        List<LopHoc> lophoc = new ArrayList<>();

        String sql = "SELECT * FROM lop WHERE TenLop like ? ";
                
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%"+ TenLop + "%");
            ResultSet rs = ps.executeQuery(); 
            while (rs.next()) {               
                LopHoc lop = new LopHoc();
                lop.setMaLop(rs.getString("MaLop"));
                lop.setTenLop(rs.getString("TenLop"));
                lop.setSiSo(rs.getInt("SiSo"));
                lop.setThoiLuong(rs.getInt("ThoiLuong"));
                lop.setGiatien(rs.getInt("Giatien"));
                lop.setPhainop(rs.getInt("Phainop"));
                
                lophoc.add(lop);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lophoc;
    }
    
    public List<HocPhi> getListStudentByMaLop(String MaLop) {
        List<HocPhi> hocphi = new ArrayList<>();
        String sql = "SELECT * FROM hocphi, hocvien, lop WHERE hocvien.MaHV = hocphi.MaHV AND "
                + "hocphi.MaLop = lop.MaLop AND  "
                + "hocvien.MaLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MaLop );
            ResultSet rs = ps.executeQuery(); 
            while (rs.next()) {               
                HocPhi hp = new HocPhi();
                hp.setTenLop(rs.getString("TenLop"));
                hp.setHoTen(rs.getString("HoTen"));
                hp.setGiatien(rs.getInt("Giatien"));
                hp.setPhainop(rs.getInt("Phainop"));
                hp.setDanop(rs.getInt("Danop"));
                hp.setConthieu(rs.getInt("Conthieu"));
                hp.setNguoinop(rs.getString("Nguoinop"));
                hp.setNgaynop(rs.getDate("Ngaynop"));
                
                hocphi.add(hp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hocphi;
    }
}
