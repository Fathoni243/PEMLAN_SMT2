package com.SourceCode.Quiz2;

public abstract class Pegawai {
    private String nama;
    private int id;
    private char jenisKelamin;

    public Pegawai(String nama, int id, char jenisKelamin) {
        this.nama = nama;
        this.id = id;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public abstract int gaji();    
}
