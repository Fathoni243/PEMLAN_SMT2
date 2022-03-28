package com.SourceCode.UTS;

public class PegawaiTetap extends Pegawai{
    private double gajiPokok;

    public PegawaiTetap(String nama, int umur, double gajiPokok) {
        super(nama, umur);
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
}
