/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class HocPhi {

    private String MaHV;
    private String MaLop;
    private Integer Giatien;
    private Integer Phainop;
    private Integer Danop;
    private Integer Conthieu;
    private Date Ngaynop;
    private String Nguoinop;
    private String TenLop;
    private String HoTen;

    public HocPhi() {
    }

    public HocPhi(String MaHV, String MaLop, Integer Giatien, Integer Phainop, Integer Danop, Integer Conthieu, Date Ngaynop, String Nguoinop, String TenLop, String HoTen) {
        this.MaHV = MaHV;
        this.MaLop = MaLop;
        this.Giatien = Giatien;
        this.Phainop = Phainop;
        this.Danop = Danop;
        this.Conthieu = Conthieu;
        this.Ngaynop = Ngaynop;
        this.Nguoinop = Nguoinop;
        this.TenLop = TenLop;
        this.HoTen = HoTen;
    }



    public String getMaHV() {
        return MaHV;
    }

    public void setMaHV(String MaHV) {
        this.MaHV = MaHV;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public Integer getDanop() {
        return Danop;
    }

    public void setDanop(Integer Danop) {
        this.Danop = Danop;
    }

    public Integer getConthieu() {
        return Conthieu;
    }

    public void setConthieu(Integer Conthieu) {
        this.Conthieu = Conthieu;
    }

    public Date getNgaynop() {
        return Ngaynop;
    }

    public void setNgaynop(Date Ngaynop) {
        this.Ngaynop = Ngaynop;
    }


    public String getNguoinop() {
        return Nguoinop;
    }

    public void setNguoinop(String Nguoinop) {
        this.Nguoinop = Nguoinop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Integer getGiatien() {
        return Giatien;
    }

    public void setGiatien(Integer Giatien) {
        this.Giatien = Giatien;
    }

    public Integer getPhainop() {
        return Phainop;
    }

    public void setPhainop(Integer Phainop) {
        this.Phainop = Phainop;
    }

}
