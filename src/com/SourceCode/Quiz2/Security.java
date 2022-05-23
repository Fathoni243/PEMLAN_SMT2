package com.SourceCode.Quiz2;

public class Security extends PegawaiTidakTetap implements Info{
    private int level;

    public Security(String nama, int id, char jenisKelamin, int tarif, int bonus, int lamaKerja, int level) {
        super(nama, id, jenisKelamin, tarif, bonus, lamaKerja);
        this.level = level;
    }

    public int getLevel() {
        return level > 4 ? 0 : level;
    }

    public void setLevel(int level) {
        this.level = level;
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

    @Override
    public void infoPegawai() {
        System.out.println("Nama : "+getNama());
        System.out.println("Id : "+getId());
        System.out.println("JenisKelamin : "+getJenisKelamin());
        System.out.println("Tarif : "+getTarif());
        System.out.println("Bonus : "+getBonus());
        System.out.println("Lama Kerja : "+getLamaKerja());
        System.out.println("Level : "+getLevel());
        System.out.println("Total Gaji : "+this.gaji());
    }

    @Override
    public void infoRemunerasi() {
        // TODO Auto-generated method stub
        
    }
}
