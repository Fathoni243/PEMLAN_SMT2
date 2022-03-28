package com.SourceCode.UTS;

public class PegawaiHonorer extends Pegawai{
    private double honor;
    private int lamaKerja;

    public PegawaiHonorer(String nama, int umur, int lamaKerja) {
        super(nama, umur);
        this.lamaKerja = lamaKerja;
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
}
