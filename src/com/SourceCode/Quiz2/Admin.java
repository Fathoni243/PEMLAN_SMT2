package com.SourceCode.Quiz2;

public class Admin extends PegawaiTetap{
    private int lamaKerja;
    
    public Admin(String nama, int id, char jenisKelamin, int gajiPokok, int tunjangan, int anggotaKeluarga, int lamaKerja) {
        super(nama, id, jenisKelamin, gajiPokok, tunjangan, anggotaKeluarga);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public int gaji() {
        return getGajiPokok() + (getTunjangan() * getAnggotaKeluarga());
        // return super.gaji();
    }
}
