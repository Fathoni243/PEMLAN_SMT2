package com.SourceCode.LatihanUTP;

public class Obat {
    private String nama;
    private String seriObat;
    private String kategori;
    private int stock;

    public Obat(String nama, String seriObat, String kategori, int stock) {
        this.nama = nama;
        this.seriObat = seriObat;
        this.kategori = kategori;
        this.stock = stock;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSeriObat() {
        return seriObat;
    }

    public void setSeriObat(String seriObat) {
        this.seriObat = seriObat;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
