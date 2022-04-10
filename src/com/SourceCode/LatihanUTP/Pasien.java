package com.SourceCode.LatihanUTP;

public class Pasien {
    private String nama;
    private int usia;
    private String alamat;
    private String jk;
    private Obat obat;

    public Pasien(String nama, int usia, String alamat, String jk, Obat obat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.jk = jk;
        this.obat = obat;
    }   

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public Obat getObat() {
        return obat;
    }

    public void setObat(Obat obat) {
        this.obat = obat;
    }
}
