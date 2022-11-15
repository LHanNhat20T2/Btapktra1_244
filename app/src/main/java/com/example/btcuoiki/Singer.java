package com.example.btcuoiki;

public class Singer {
    private int anh;
    private String ten;
    private String nghedanh;
    private String quocgia;
    private String saobinhchon;

    public Singer() {
    }

    public Singer(int anh, String ten, String nghedanh, String quocgia, String saobinhchon) {
        this.anh = anh;
        this.ten = ten;
        this.nghedanh = nghedanh;
        this.quocgia = quocgia;
        this.saobinhchon = saobinhchon;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNghedanh() {
        return nghedanh;
    }

    public void setNghedanh(String nghedanh) {
        this.nghedanh = nghedanh;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getSaobinhchon() {
        return saobinhchon;
    }

    public void setSaobinhchon(String saobinhchon) {
        this.saobinhchon = saobinhchon;
    }
}
