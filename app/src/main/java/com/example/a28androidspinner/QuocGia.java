package com.example.a28androidspinner;

public class QuocGia
{
    public Integer hinhAnh;
    public String ten;
    public int toaDo;

    public QuocGia() {
    }

    public QuocGia(Integer hinhAnh, String ten, int toaDo) {
        this.hinhAnh = hinhAnh;
        this.ten = ten;
        this.toaDo = toaDo;
    }

    public Integer getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(Integer hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getToaDo() {
        return toaDo;
    }

    public void setToaDo(int toaDo) {
        this.toaDo = toaDo;
    }
}
