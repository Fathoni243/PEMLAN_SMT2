package com.SourceCode.FilkomTourPolymorphisme;

public class SupirRentcar extends Karyawan {
    private Mobil mobil_sewa;

    SupirRentcar(String nama, String alamat, String noTelp, String jk, String kategori, Mobil mobil_sewa) {
        super(nama, alamat, noTelp, jk, kategori);
        this.mobil_sewa = mobil_sewa;
    }

    public Mobil getMobilSewa(){
        return mobil_sewa;
    }

    public void setMobilSewa(Mobil mobil_sewa){
        this.mobil_sewa = mobil_sewa;
    }

    @Override
    void getInfo (){
        super.getInfo();
        System.out.println("=========== Mobil Yang Disewa ===========");
        mobil_sewa.getInfo();
    }
    
}
