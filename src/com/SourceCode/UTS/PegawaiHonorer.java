package com.SourceCode.UTS;

public class PegawaiHonorer extends Pegawai{
    private double honor;
    private int lembur;

    public PegawaiHonorer(String nama, int umur) {
        super(nama, umur);
    }

    public double getHonor() {
        return honor;
    }

    public void setHonor(double honor) {
        this.honor = honor;
    }

    public int getLembur() {
        return lembur;
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }
}
