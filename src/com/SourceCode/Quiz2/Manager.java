package com.SourceCode.Quiz2;

public class Manager extends PegawaiTetap implements Info{
    private String departemen;
    private int level;

    public Manager(String nama, int id, char jenisKelamin, int gajiPokok, int tunjangan, int anggotaKeluarga, String departemen, int level) {
        super(nama, id, jenisKelamin, gajiPokok, tunjangan, anggotaKeluarga);
        this.departemen = departemen;
        this.level = level;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int gaji() {
        return getGajiPokok() + (getTunjangan() + getLevel());
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
