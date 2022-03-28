package com.SourceCode.UTS;

public class Security extends PegawaiTetap{
    private int durasiKerja;

    public Security(String nama, int umur, double gajiPokok, int durasiKerja) {
        super(nama, umur, gajiPokok);
        this.durasiKerja = durasiKerja;
    }

    public int getDurasiKerja() {
        return durasiKerja;
    }

    public void setDurasiKerja(int durasiKerja) {
        this.durasiKerja = durasiKerja;
    }

}
