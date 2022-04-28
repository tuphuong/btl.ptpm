/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.HocPhi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ThongKeController {
    Connection conn = JDBCConnection.getJDBCConnection();
    
    public int soHocVien() {
        String sql = "SELECT count(*) FROM hocvien;";
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
            return count;
        } catch (SQLException ex) {
          Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int SumHocFee() {
        String sql = "SELECT SUM(Phainop*SiSo) FROM lop";
        int sum = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sum = rs.getInt(1);
            }
            return sum;
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int DaNopHocFee() {
        String sql = "SELECT SUM(Danop) FROM hocphi";
        int sum = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sum = rs.getInt(1);
            }
            return sum;
        } catch (SQLException ex) {
           Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int ConThieuHocFee() {
        String sql = "SELECT SUM(Conthieu) FROM hocphi";
        int sum = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sum = rs.getInt(1);
            }
            return sum;
        } catch (SQLException ex) {
           Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public List<HocPhi> getAllHocPhis() {
        List<HocPhi> hocphi = new ArrayList<>();

        String sql = "SELECT * FROM hocphi";

        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
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
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hocphi;

    }
    
    public List<HocPhi> getListHocNopDu() {
        List<HocPhi> hocphi = new ArrayList<>();

        String sql = "SELECT * FROM hocphi, lop, hocvien WHERE lop.MaLop = hocphi.MaLop AND"
                + " hocphi.MaHV = hocvien.MaHV AND "
                + " hocphi.Conthieu = 0 ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HocPhi hp = new HocPhi();
                hp.setMaHV(rs.getString("MaHV"));
                hp.setHoTen(rs.getString("HoTen"));
                hp.setTenLop(rs.getString("TenLop"));
                hp.setPhainop(rs.getInt("Phainop"));
                hp.setDanop(rs.getInt("Danop"));
                hp.setConthieu(rs.getInt("Conthieu"));

                hocphi.add(hp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hocphi;

    }
    
    public List<HocPhi> getListHocNopThieu() {
        List<HocPhi> hocphi = new ArrayList<>();

        String sql = "SELECT * FROM hocphi, lop, hocvien WHERE lop.MaLop = hocphi.MaLop AND"
                + " hocphi.MaHV = hocvien.MaHV AND "
                + " hocphi.Danop < lop.Phainop AND hocphi.Danop > 0   ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HocPhi hp = new HocPhi();
                hp.setMaHV(rs.getString("MaHV"));
                hp.setHoTen(rs.getString("HoTen"));
                hp.setTenLop(rs.getString("TenLop"));
                hp.setPhainop(rs.getInt("Phainop"));
                hp.setDanop(rs.getInt("Danop"));
                hp.setConthieu(rs.getInt("Conthieu"));

                hocphi.add(hp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocPhiController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hocphi;

    }
    
    public List<HocPhi> getListChuaNop() {
        List<HocPhi> hocphi = new ArrayList<>();

        String sql = "SELECT * FROM hocphi, lop, hocvien WHERE lop.MaLop = hocphi.MaLop AND"
                + " hocphi.MaHV = hocvien.MaHV AND "
                + " hocphi.Danop = 0";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HocPhi hp = new HocPhi();
                hp.setMaHV(rs.getString("MaHV"));
                hp.setHoTen(rs.getString("HoTen"));
                hp.setTenLop(rs.getString("TenLop"));
                hp.setPhainop(rs.getInt("Phainop"));
                hp.setDanop(rs.getInt("Danop"));
                hp.setConthieu(rs.getInt("Conthieu"));
                hocphi.add(hp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocPhiController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hocphi;

    }
}
