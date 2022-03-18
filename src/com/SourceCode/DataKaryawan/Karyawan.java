package com.SourceCode.DataKaryawan;

public class Karyawan {
    String nama;
    String alamat;
    String noTelp;
    String jk;
    String kategori;
    String keterangan;

    public void KeteranganKaryawan(String kategori){
        this.kategori = kategori;

        if (kategori.equalsIgnoreCase("supir travel")) {
            keterangan = "Cuti";
            System.out.println(keterangan);
            
        }else if(kategori.equalsIgnoreCase("supir rentcar")) {
            keterangan = "Datang Kerja";
            System.out.println(keterangan);
            
        }else if(kategori.equalsIgnoreCase("admin")) {
            keterangan = "Izin Sakit";
            System.out.println(keterangan);

        } 

    } 

}
