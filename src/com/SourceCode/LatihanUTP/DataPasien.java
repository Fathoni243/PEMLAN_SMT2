package com.SourceCode.LatihanUTP;

import java.util.ArrayList;

public class DataPasien {
    private ArrayList<Pasien> listPasien = new ArrayList<Pasien>();
    
    public void tambahPasien(String nama, int usia, String alamat, String jk, Obat obat){
        Pasien pasien = new Pasien(nama, usia, alamat, jk, obat);

        listPasien.add(pasien);
    }

    public void tambahObatPasien(String nama, String noSeri){
        for (int i = 0; i < listPasien.size(); i++) {
            if (nama.equalsIgnoreCase(listPasien.get(i).getNama())) {
                for (int j = 0; j < DataObat.getListObat().size(); j++) {
                    if (noSeri.equals(DataObat.getListObat().get(j).getSeriObat())) {
                        listPasien.get(i).setObat(DataObat.getListObat().get(j));
                        DataObat.getListObat().get(j).setStock(DataObat.getListObat().get(j).getStock()-1);
                    }
                }
            }
        }
    }

    public void tampilPasien(){
        for (int i = 0; i < listPasien.size(); i++) {
            if (listPasien.get(i).getObat() != null) {
                System.out.println("Nama Pasien ke-"+(i+1)+"   : "+listPasien.get(i).getNama());
                System.out.println("Umur Pasien ke-"+(i+1)+"   : "+listPasien.get(i).getUsia());
                System.out.println("Alamat Pasien ke-"+(i+1)+" : "+listPasien.get(i).getAlamat());
                System.out.println("Jenis Kelamin Pasien ke-"+(i+1)+" : "+listPasien.get(i).getJk());
                System.out.println("Nama Obat ke-"+(i+1)+"   : "+listPasien.get(i).getObat().getNama());
                System.out.println("No. Seri Obat ke-"+(i+1)+"   : "+listPasien.get(i).getObat().getSeriObat());
                System.out.println("Kategori Obat ke-"+(i+1)+" : "+listPasien.get(i).getObat().getKategori());
                System.out.println("Stock Obat ke-"+(i+1)+" : "+listPasien.get(i).getObat().getStock());
            }else{
                System.out.println("Nama Pasien ke-"+(i+1)+"   : "+listPasien.get(i).getNama());
                System.out.println("Umur Pasien ke-"+(i+1)+"   : "+listPasien.get(i).getUsia());
                System.out.println("Alamat Pasien ke-"+(i+1)+" : "+listPasien.get(i).getAlamat());
                System.out.println("Jenis Kelamin Pasien ke-"+(i+1)+" : "+listPasien.get(i).getJk());
                System.out.println("Pasien tidak memiliki obat");
            }
        }
    }

}