package com.SourceCode.FilkomTourAndTravel;

public class Karyawan {
    private String nama, alamat, noTelp, jk, kategori;
    
    Karyawan (String nama, String alamat, String noTelp, String jk, String kategori){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.jk = jk;
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    void getInfo(){
        System.out.println("Nama Karyawan          : "+getNama());
        System.out.println("Alamat Karyawan        : "+getAlamat());
        System.out.println("noTelp Karyawan        : "+getNoTelp());
        System.out.println("Jenis Kelamin Karyawan : "+getJk());
        System.out.println("Kategori Karyawan      : "+getKategori());
    }

}
