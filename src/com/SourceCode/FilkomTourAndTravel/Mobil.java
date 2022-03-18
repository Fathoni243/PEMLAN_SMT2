package com.SourceCode.FilkomTourAndTravel;

public class Mobil {
    private String noPlat, merk, warna, thKeluaran;

    Mobil (String noPlat, String merk, String warna, String thKeluaran){
        this.noPlat = noPlat;
        this.merk = merk;
        this.warna = warna;
        this.thKeluaran = thKeluaran;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getThKeluaran() {
        return thKeluaran;
    }

    public void setThKeluaran(String thKeluaran) {
        this.thKeluaran = thKeluaran;
    }

    void getInfo(){
        System.out.println("=========================================");
        System.err.println("Nomor Plat             : "+getNoPlat());
        System.err.println("Merk Mobil             : "+getMerk());
        System.err.println("Warna Mobil            : "+getWarna());
        System.err.println("Tahun Keluaran         : "+getThKeluaran());
    }

}
