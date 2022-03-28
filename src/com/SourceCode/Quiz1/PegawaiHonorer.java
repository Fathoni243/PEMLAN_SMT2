package com.SourceCode.Quiz1;

public class PegawaiHonorer extends Pegawai{
    private double honor;
    private int lamaKerja;

    public PegawaiHonorer(String nama, int umur, int lamaKerja, String kategori, double honor) {
        super(nama, umur, kategori);
        this.lamaKerja = lamaKerja;
        this.honor = honor;
    }

    public double getHonor() {
        return honor;
    }

    public void setHonor(double honor) {
        this.honor = honor;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setlamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public double hitungGajiHonorer(){
        double Lembur = 0;
        if (getLamaKerja() > 8) {
            Lembur = (getLamaKerja() - 8) * 0.1 * getHonor(); 
        }

        double hasil = getHonor() + Lembur;
        return hasil;
    } 

    @Override
    void getTampil(){
        super.getTampil();
        System.out.println("Durasi Kerja : "+lamaKerja);
        System.out.println("Honor : "+ honor);
        System.out.println("Gaji Total : "+hitungGajiHonorer());
    }
}
