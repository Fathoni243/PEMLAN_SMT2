package com.SourceCode.StudiKasus3;

public class Admin extends Karyawan{
    private int tunjangan;

    Admin(String nama, String alamat, String noTelp, String jk, String kategori, int tunjangan) {
        super(nama, alamat, noTelp, jk, kategori);
        this.tunjangan = tunjangan;
    }

    public int getTunjangan(){
        return tunjangan;
    }

    public void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }


    @Override
    void getInfo() {
        super.getInfo();
        System.out.println("Tunjangan Karyawan     : "+getTunjangan());
        System.out.println("=========================================");
    }
}
