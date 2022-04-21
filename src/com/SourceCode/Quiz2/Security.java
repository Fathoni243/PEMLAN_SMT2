package com.SourceCode.Quiz2;

public class Security extends PegawaiTidakTetap{
    private int level;
    private int lembur;

    public Security(String nama, int id, char jenisKelamin, int tarif, int bonus, int lamaKerja, int lembur, int level) {
        super(nama, id, jenisKelamin, tarif, bonus, lamaKerja);
        this.level = level;
        this.lembur = lembur;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLembur() {
        return lembur;
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    @Override
    public int getBonus() {
        int bonus = 0;
        if (getLamaKerja() > 8) {
            bonus = (getLamaKerja() - 8) * getBonus();
        }
        
        return bonus;
    }

    @Override
    public int gaji() {
        return getTarif() + this.getBonus();
        // return super.gaji();
    }
}
