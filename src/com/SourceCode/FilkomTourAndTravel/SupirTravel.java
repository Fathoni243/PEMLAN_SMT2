package com.SourceCode.FilkomTourAndTravel;

public class SupirTravel extends Karyawan {
    private String rute_trayek;

    
    SupirTravel(String nama, String alamat, String noTelp, String jk, String kategori, String rute_trayek) {
        super(nama, alamat, noTelp, jk, kategori);
        this.rute_trayek = rute_trayek;
    }
    
    public String getRute_trayek() {
        return rute_trayek;
    }

    public void setRute_trayek(String rute_trayek) {
        this.rute_trayek = rute_trayek;
    }
    
    @Override
    void getInfo() {
        super.getInfo();
        System.out.println("Rute Trayek            : "+ rute_trayek);
        System.out.println("=========================================");   
    }

    
    
}
