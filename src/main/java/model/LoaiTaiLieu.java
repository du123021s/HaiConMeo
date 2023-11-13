package model;

public class LoaiTaiLieu {
    private String maLoaiTL;
    private String ten;

    public LoaiTaiLieu() {
    }

    public LoaiTaiLieu(String maLoaiTL, String tenTL) {
        this.maLoaiTL = maLoaiTL;
        this.ten = tenTL;
    }

    public String getMaLoaiTL() {
        return maLoaiTL;
    }

    public void setMaLoaiTL(String maLoaiTL) {
        this.maLoaiTL = maLoaiTL;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
