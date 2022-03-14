package com.SourceCode.DataMobil;

public class Mobil {
    String noPlat;
    String merk;
    String warna;
    String thKeluaran;

    void getDataMobil(String noPlat, String merk, String warna, String thKeluaran){
        this.noPlat = noPlat;
        this.merk = merk;
        this.warna = warna;
        this.thKeluaran = thKeluaran;

        System.out.println("Merk           : "+merk);
        System.out.println("Warna          : "+warna);
        System.out.println("No Plat        : "+noPlat);
        System.out.println("Tahun Keluaran : "+thKeluaran);
        System.out.println();
    }

}
