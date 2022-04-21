package com.SourceCode.Quiz2;

public abstract class PegawaiTetap extends Pegawai{
    private int gajiPokok;
    private int tunjangan;
    private int anggotaKeluarga;

    public PegawaiTetap(String nama, int id, char jenisKelamin, int gajiPokok, int tunjangan, int anggotaKeluarga) {
        super(nama, id, jenisKelamin);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.anggotaKeluarga = anggotaKeluarga;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getAnggotaKeluarga() {
        return anggotaKeluarga;
    }

    public void setAnggotaKeluarga(int anggotaKeluarga) {
        this.anggotaKeluarga = anggotaKeluarga;
    }

    @Override
    public int gaji() {
        return 0;
    }
    
}
