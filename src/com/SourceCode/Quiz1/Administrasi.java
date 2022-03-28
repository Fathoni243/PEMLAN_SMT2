package com.SourceCode.Quiz1;

public class Administrasi extends PegawaiTetap{
    private int masaKerja;

    public Administrasi(String nama, int umur, double gajiPokok, int masaKerja, String kategori) {
        super(nama, umur, gajiPokok, kategori);
        this.masaKerja = masaKerja;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public double hitungGajiAdmin(){
        double Tunjangan = 0;
        if (getMasaKerja() > 10) {
            Tunjangan = 0.5 * getGajiPokok();
        }else { 
            Tunjangan = 0.3 * getGajiPokok();
        }

        double hasil = getGajiPokok() + Tunjangan;
        return hasil;
    }

    @Override
    void getTampil(){
        super.getTampil();
        System.out.println("Masa Kerja : "+masaKerja);
        System.out.println("Total Gaji : "+hitungGajiAdmin());
    }

}
