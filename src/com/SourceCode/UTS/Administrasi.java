package com.SourceCode.UTS;

public class Administrasi extends PegawaiTetap{
    private int masaKerja;

    public Administrasi(String nama, int umur, double gajiPokok, int masaKerja) {
        super(nama, umur, gajiPokok);
        this.masaKerja = masaKerja;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    void hitungGajiAdmin(){
        double Tunjangan = 0;
        if (getMasaKerja() > 10) {
            Tunjangan = 0.5 * getGajiPokok();
        }else if(){
            
        }
        getGajiPokok();
    }
}
