package com.SourceCode.Quiz2;

public class CleaningService extends PegawaiTidakTetap implements Info{
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
    
    @Override
    public void infoPegawai() {
        System.out.println("Nama : "+getNama());
        System.out.println("Id : "+getId());
        System.out.println("JenisKelamin : "+getJenisKelamin());
        System.out.println("Tarif : "+getTarif());
        System.out.println("Bonus : "+getBonus());
        System.out.println("Lama Kerja : "+getLamaKerja());
        System.out.println("Masa Mengabdi : "+getMasaMengabdi());
        System.out.println("Total Gaji : "+this.gaji());
    }

    @Override
    public void infoRemunerasi() {
        // TODO Auto-generated method stub
        
    }
}
