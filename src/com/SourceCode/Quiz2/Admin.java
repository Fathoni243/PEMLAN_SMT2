package com.SourceCode.Quiz2;

public class Admin extends PegawaiTetap implements Info{
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

    @Override
    public void infoPegawai() {
        System.out.println("Nama : "+getNama());
        System.out.println("Id : "+getId());
        System.out.println("JenisKelamin : "+getJenisKelamin());
        System.out.println("Gaji Pokok : "+getGajiPokok());
        System.out.println("Gaji Pokok : "+getGajiPokok());
        System.out.println("Tunjangan : "+getTunjangan());
        System.out.println("Anggota Keluarga : "+getAnggotaKeluarga());
        System.out.println("Lama Kerja : "+getLamaKerja());
        System.out.println("Total Gaji : "+this.gaji());
    }

    @Override
    public void infoRemunerasi() {
        // TODO Auto-generated method stub
        
    }
}
