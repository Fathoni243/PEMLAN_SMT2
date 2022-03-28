package com.SourceCode.UTS;

public class Pegawai {
    private String nama, kategori;
    private int umur;

    public Pegawai(String nama, int umur, String kategori) {
        this.nama = nama;
        this.umur = umur;
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
