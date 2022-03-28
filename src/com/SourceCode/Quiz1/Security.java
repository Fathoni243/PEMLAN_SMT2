package com.SourceCode.Quiz1;

public class Security extends PegawaiTetap{
    private int durasiKerja;

    public Security(String nama, int umur, double gajiPokok, int durasiKerja, String kategori) {
        super(nama, umur, gajiPokok, kategori);
        this.durasiKerja = durasiKerja;
    }

    public int getDurasiKerja() {
        return durasiKerja;
    }

    public void setDurasiKerja(int durasiKerja) {
        this.durasiKerja = durasiKerja;
    }

    public double hitungGajiSecurity(){
        double Lembur = 0;
        if (getDurasiKerja() > 8) {
            Lembur = (getDurasiKerja() - 8) * 0.1 * getGajiPokok(); 
        }

        double hasil = getGajiPokok() + Lembur;
        return hasil;
    }

    @Override
    void getTampil(){
        super.getTampil();
        System.out.println("Durasi Kerja : "+durasiKerja);
        System.out.println("Total Gaji : "+hitungGajiSecurity());
    }

}
