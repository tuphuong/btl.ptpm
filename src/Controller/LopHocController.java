/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.List;
import java.sql.Connection;
import Model.LopHoc;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import Model.HocSinh;

/**
 *
 * @author Administrator
 */
public class LopHocController {

    Connection conn = JDBCConnection.getJDBCConnection();

    public List<LopHoc> getAllLopHocs() {
        List<LopHoc> lop = new ArrayList<>();

        String sql = "SELECT * FROM lop";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LopHoc lop1 = new LopHoc();
                lop1.setMaLop(rs.getString("MaLop"));
                lop1.setTenLop(rs.getString("TenLop"));
                lop1.setSiSo(rs.getInt("SiSo"));
                lop1.setThoiLuong(rs.getInt("ThoiLuong"));
                lop1.setGiatien(rs.getInt("Giatien"));
                lop1.setPhainop(rs.getInt("Phainop"));
                lop.add(lop1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LopHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lop;
    }

    public void AddClass(LopHoc lopHoc) {
        String sql = "INSERT INTO lop(MaLop, TenLop, SiSo, ThoiLuong, Giatien, Phainop) "
                + "VALUES(?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, lopHoc.getMaLop());
            ps.setString(2, lopHoc.getTenLop());
            ps.setInt(3, lopHoc.getSiSo());
            ps.setInt(4, lopHoc.getThoiLuong());
            ps.setInt(5, lopHoc.getGiatien());
            ps.setInt(6, lopHoc.getPhainop());

            int rs = ps.executeUpdate();
            if (rs == 1) {
                System.out.println("SUCCESS: Thêm lớp học thành công!");
            } else {
                System.out.println("ERROR: Thêm thất bại!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LopHocController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public LopHoc getLopHocByMaLop(String MaLop) {

        String sql = "SELECT * FROM lop WHERE MaLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MaLop);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LopHoc lop = new LopHoc();
                lop.setMaLop(rs.getString("MaLop"));
                lop.setTenLop(rs.getString("TenLop"));
                lop.setSiSo(rs.getInt("SiSo"));
                lop.setThoiLuong(rs.getInt("ThoiLuong"));
                lop.setGiatien(rs.getInt("Giatien"));
                lop.setPhainop(rs.getInt("Phainop"));

                return lop;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    public LopHoc getClassByName(String TenLop) {

        String sql = "SELECT * FROM  lop WHERE TenLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, TenLop);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LopHoc lop = new LopHoc();
                lop.setMaLop(rs.getString("MaLop"));
                lop.setTenLop(rs.getString("TenLop"));
                lop.setSiSo(rs.getInt("SiSo"));
                lop.setThoiLuong(rs.getInt("ThoiLuong"));
                lop.setGiatien(rs.getInt("Giatien"));
                lop.setPhainop(rs.getInt("Phainop"));

                return lop;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public void Delete(String MaLop) {
        String sql = "DELETE FROM lop WHERE MaLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, MaLop);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                System.out.println("SUCCESS: Xóa thành công!");
            } else {
                System.out.println("ERROR: Xóa thất bại!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void UpdateClass(LopHoc lop) {
        String sql = "UPDATE lop SET TenLop = ?, SiSo = ?, ThoiLuong = ?, Giatien = ?, Phainop = ?  WHERE MaLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, lop.getTenLop());
            ps.setInt(2, lop.getSiSo());
            ps.setInt(3, lop.getThoiLuong());
            ps.setInt(4, lop.getGiatien());
            ps.setInt(5, lop.getPhainop());
            ps.setString(6, lop.getMaLop());

            int rs = ps.executeUpdate();
            if (rs == 1) {
                System.out.println("SUCCESS: Sửa thành công!");
            } else {
                System.out.println("ERROR: Sửa thất bại!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int getNumberOfClass(String MaLop) {
        String sql = "SELECT SiSo FROM lop WHERE MaLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, MaLop);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt("SiSo");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int updateNumberOfClass(String MaLop, String option) {
        int SiSo = getNumberOfClass(MaLop);
        String sql = "UPDATE lop SET SiSo = ? WHERE MaLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            if (option.equalsIgnoreCase("Thêm")) {
                ps.setInt(1, SiSo + 1);
            } else {
                ps.setInt(1, SiSo - 1);
            }
            ps.setString(2, MaLop);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                System.out.println("SUCCESS: Sửa thành công!");
            } else {
                System.out.println("ERROR: Sửa thất bại!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void updateSiSoNew(String MaLop) {
        int SiSoNew = getNumberOfClass(MaLop);
        String sql = "UPDATE lop SET SiSo = ? WHERE MaLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, SiSoNew + 1);
            ps.setString(2, MaLop);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                System.out.println("SUCCESS: Sửa sĩ số thành công!");
            } else {
                System.out.println("ERROR: Sửa sĩ số thất bại!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateSiSoOld(String MaLop) {
        int SiSoOld = getNumberOfClass(MaLop);
        String sql = "UPDATE lop SET SiSo = ? WHERE MaLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, SiSoOld - 1);
            ps.setString(2, MaLop);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                System.out.println("SUCCESS: Sửa sĩ số thành công!");
            } else {
                System.out.println("ERROR: Sửa sĩ số thất bại!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
