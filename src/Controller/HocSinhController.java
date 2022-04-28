/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.HocSinh;
import Model.LopHoc;
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
public class HocSinhController {

    Connection conn = JDBCConnection.getJDBCConnection();

    public List<HocSinh> getAllHocSinhs() {
        List<HocSinh> hocsinh = new ArrayList<>();

        String sql = "SELECT * FROM hocvien";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //thực hiện truy vấn chọn
            while (rs.next()) {     //next() di chuyển tới hàng tiếp theo           
                HocSinh hs = new HocSinh();
                hs.setMaHV(rs.getString("MaHV"));
                hs.setHoTen(rs.getString("HoTen"));
                hs.setGioiTinh(rs.getString("GioiTinh"));
                hs.setNgaySinh(rs.getDate("NgaySinh"));
                hs.setSdtPH(rs.getString("SdtPH"));
                hs.setTenPH(rs.getString("TenPH"));
                hs.setDiaChi(rs.getString("DiaChi"));
                hs.setMaLop(rs.getString("MaLop"));
                hocsinh.add(hs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hocsinh;

    }

    public void Add(HocSinh hs) {

        String sql = "INSERT INTO hocvien(MaHV, HoTen, GioiTinh, NgaySinh, SdtPH, TenPH, DiaChi, MaLop) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hs.getMaHV());
            ps.setString(2, hs.getHoTen());
            ps.setString(3, hs.getGioiTinh());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String NgaySinh = sdf.format(hs.getNgaySinh());
            ps.setString(4, NgaySinh);
            ps.setString(5, hs.getSdtPH());
            ps.setString(6, hs.getTenPH());
            ps.setString(7, hs.getDiaChi());
            ps.setString(8, hs.getMaLop());

            int rs = ps.executeUpdate(); //thực hiện truy vấn
            if (rs == 1) {
                System.out.println("SUCCESS: Thêm học viên thành công!");
            } else {
                System.out.println("ERROR: Thêm thất bại!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Update(HocSinh hs) {
        String sql = "UPDATE hocvien SET HoTen = ?, GioiTinh = ?, NgaySinh = ?, SdtPH = ?, TenPH = ?,"
                + " DiaChi = ?, MaLop = ? WHERE MaHV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, hs.getHoTen());
            ps.setString(2, hs.getGioiTinh());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String NgaySinh = sdf.format(hs.getNgaySinh());
            ps.setString(3, NgaySinh);
            ps.setString(4, hs.getSdtPH());
            ps.setString(5, hs.getTenPH());
            ps.setString(6, hs.getDiaChi());
            ps.setString(7, hs.getMaLop());
            ps.setString(8, hs.getMaHV());

            int rs = ps.executeUpdate();
            if (rs == 1) {
                System.out.println("SUCCESS: Sửa thông tin học sinh thành công!");
            } else {
                System.out.println("ERROR: Sửa thông tin học sinh thất bại!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void Delete(String MaHV) {
        try {
            String sql = "DELETE FROM hocvien WHERE MaHV = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, MaHV);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                System.out.println("SUCCESS: Xóa học sinh thành công!");
            } else {
                System.out.println("ERROR: Xóa học sinh thất bại!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public HocSinh getMaHVbyMaLop(String MaLop) {
        String sql = "SELECT * FROM hocvien WHERE MaLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MaLop);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HocSinh hs = new HocSinh();
                hs.setMaHV(rs.getString("MaHV"));
                hs.setHoTen(rs.getString("HoTen"));
                hs.setGioiTinh(rs.getString("GioiTinh"));
                hs.setNgaySinh(rs.getDate("NgaySinh"));
                hs.setSdtPH(rs.getString("SdtPH"));
                hs.setTenPH(rs.getString("TenPH"));
                hs.setDiaChi(rs.getString("DiaChi"));
                hs.setMaLop(rs.getString("MaLop"));

                return hs;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public HocSinh getHocSinhByMaHV(String MaHV) {

        String sql = "SELECT * FROM hocvien WHERE MaHV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MaHV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HocSinh hs = new HocSinh();
                hs.setMaHV(rs.getString("MaHV"));
                hs.setHoTen(rs.getString("HoTen"));
                hs.setGioiTinh(rs.getString("GioiTinh"));
                hs.setNgaySinh(rs.getDate("NgaySinh"));
                hs.setSdtPH(rs.getString("SdtPH"));
                hs.setTenPH(rs.getString("TenPH"));
                hs.setDiaChi(rs.getString("DiaChi"));
                hs.setMaLop(rs.getString("MaLop"));

                return hs;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    public List<HocSinh> getHocSinhByMaLop(String MaLop) {
        List<HocSinh> hocsinh = new ArrayList<>();
        String sql = "SELECT * FROM hocvien, lop WHERE hocvien.MaLop = lop.MaLop AND "
                + "lop.MaLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MaLop);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HocSinh hs = new HocSinh();
                hs.setMaHV(rs.getString("MaHV"));
                hs.setHoTen(rs.getString("HoTen"));
                hs.setGioiTinh(rs.getString("GioiTinh"));
                hs.setNgaySinh(rs.getDate("NgaySinh"));
                hs.setSdtPH(rs.getString("SdtPH"));
                hs.setTenPH(rs.getString("TenPH"));
                hs.setDiaChi(rs.getString("DiaChi"));

                hocsinh.add(hs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hocsinh;

    }

    public HocSinh getMaLopByMaHV(String MaHV) {

        String sql = "SELECT * FROM  hocvien WHERE MaHV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MaHV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HocSinh hs = new HocSinh();
                hs.setMaLop(rs.getString("MaLop"));

                return hs;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public LopHoc checkMaLop(String MaLop) {
        String sql = "SELECT * FROM lop WHERE MaLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MaLop);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LopHoc lop = new LopHoc();
                lop.setMaLop(rs.getString("MaLop"));

                return lop;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
