/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Administrator
 */
public class LopHoc {
    private String MaLop;
    private String TenLop;
    private Integer SiSo;
    private Integer  ThoiLuong;
    private Integer Giatien;
    private Integer Phainop;

    public LopHoc() {
    }

    public LopHoc(String MaLop, String TenLop, Integer SiSo, Integer ThoiLuong, Integer Giatien, Integer Phainop) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
        this.SiSo = SiSo;
        this.ThoiLuong = ThoiLuong;
        this.Giatien = Giatien;
        this.Phainop = Phainop;
    }



    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    public Integer getSiSo() {
        return SiSo;
    }

    public void setSiSo(Integer SiSo) {
        this.SiSo = SiSo;
    }

    public Integer getThoiLuong() {
        return ThoiLuong;
    }

    public void setThoiLuong(Integer ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
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
