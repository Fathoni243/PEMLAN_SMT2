package com.SourceCode.LatihanUTP;

import java.util.ArrayList;

public class DataObat {
    private static ArrayList<Obat> listObat = new ArrayList<Obat>();
    
    public void tambahObat(String nama, String seriObat, String kategori, int stock){
        Obat obat = new Obat(nama, seriObat, kategori, stock);

        listObat.add(obat);
    }
    
    public void tampilObat(){
        for (int i = 0; i < listObat.size(); i++) {
            System.out.println("Nama Obat ke-"+(i+1)+"   : "+listObat.get(i).getNama());
            System.out.println("No. Seri Obat ke-"+(i+1)+"   : "+listObat.get(i).getSeriObat());
            System.out.println("Kategori Obat ke-"+(i+1)+" : "+listObat.get(i).getKategori());
            System.out.println("Stock Obat ke-"+(i+1)+" : "+listObat.get(i).getStock());
        }
    }

    public void stokKosong(){
        for (int i = 0; i < listObat.size(); i++) {
            if (listObat.get(i).getStock() == 0) {
                System.out.println("Nama Obat ke-"+(i+1)+"   : "+listObat.get(i).getNama());
                System.out.println("No. Seri Obat ke-"+(i+1)+"   : "+listObat.get(i).getSeriObat());
                System.out.println("Kategori Obat ke-"+(i+1)+" : "+listObat.get(i).getKategori());
                System.out.println("Stock Obat ke-"+(i+1)+" : "+listObat.get(i).getStock());
            }
        }
    }

    public static ArrayList<Obat> getListObat(){
        return listObat;
    }

}
