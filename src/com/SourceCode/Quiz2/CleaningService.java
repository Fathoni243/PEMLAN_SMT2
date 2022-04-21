package com.SourceCode.Quiz2;

public class CleaningService extends PegawaiTidakTetap{
    private int masaMengabdi;
    
    public CleaningService(String nama, int id, char jenisKelamin, int tarif, int bonus, int lamaKerja, int masaMengabdi) {
        super(nama, id, jenisKelamin, tarif, bonus, lamaKerja);
        this.masaMengabdi = masaMengabdi;
    }

    public int getMasaMengabdi() {
        return masaMengabdi;
    }

    public void setMasaMengabdi(int masaMengabdi) {
        this.masaMengabdi = masaMengabdi;
    }

    @Override
    public int gaji() {
        return getTarif() + getBonus();
        // return super.gaji();
    }
}
