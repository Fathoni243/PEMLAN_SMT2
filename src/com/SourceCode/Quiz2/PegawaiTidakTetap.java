package com.SourceCode.Quiz2;

public abstract class PegawaiTidakTetap extends Pegawai{
    private int tarif;
    private int bonus;
    private int lamaKerja;

    public PegawaiTidakTetap(String nama, int id, char jenisKelamin) {
        super(nama, id, jenisKelamin);
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public int gaji() {
        return 0;
    }
    
}
