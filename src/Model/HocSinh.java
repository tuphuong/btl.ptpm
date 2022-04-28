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
public class HocSinh {
    private String MaHV;
    private String HoTen;
    private String GioiTinh;
    private Date NgaySinh;
    private String SdtPH;
    private String TenPH;
    private String DiaChi;
    private String MaLop;
    private Integer Phainop;
    private Integer Danop;
    private Integer Conthieu;
    private Date Ngaynop;
    private String Nguoinop;   
    private String TenLop;

    public HocSinh() {
    }

    public HocSinh(String MaHV, String HoTen, String GioiTinh, Date NgaySinh, String SdtPH, String TenPH, String DiaChi, String MaLop, Integer Phainop, Integer Danop, Integer Conthieu, Date Ngaynop, String Nguoinop, String TenLop) {
        this.MaHV = MaHV;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.SdtPH = SdtPH;
        this.TenPH = TenPH;
        this.DiaChi = DiaChi;
        this.MaLop = MaLop;
        this.Phainop = Phainop;
        this.Danop = Danop;
        this.Conthieu = Conthieu;
        this.Ngaynop = Ngaynop;
        this.Nguoinop = Nguoinop;
        this.TenLop = TenLop;
    }

    

    public String getMaHV() {
        return MaHV;
    }

    public void setMaHV(String MaHV) {
        this.MaHV = MaHV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }


    public String getSdtPH() {
        return SdtPH;
    }

    public void setSdtPH(String SdtPH) {
        this.SdtPH = SdtPH;
    }

    public String getTenPH() {
        return TenPH;
    }

    public void setTenPH(String TenPH) {
        this.TenPH = TenPH;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public Integer getPhainop() {
        return Phainop;
    }

    public void setPhainop(Integer Phainop) {
        this.Phainop = Phainop;
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

    @Override
    public String toString() {
        return "HocSinh{" + "MaHV=" + MaHV + ", HoTen=" + HoTen + '}';
    }

    
}
