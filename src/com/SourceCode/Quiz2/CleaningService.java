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
    public int getBonus() {
        int bonus = 0;
        if (getLamaKerja() > 5) {
            bonus = (getLamaKerja() - 5) * getBonus();
        }
        
        return bonus;
    }

    @Override
    public int gaji() {
        return getTarif() + this.getBonus();
        // return super.gaji();
    }
}
