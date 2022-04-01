package com.SourceCode.KumpulanSCgjd.UBFood;

import java.util.ArrayList;

public class DataMerchant {
    static Merchant[] merc = new Merchant[0];
    
    static void Menu(){
        System.out.println("==== Selamat Datang di UBFood ====");
        System.out.println("1. Tampil Data");
        System.out.println("2. Cari Merchant");
        System.out.println("3. Tambah Merchant");
        System.out.println("4. Update Merchant");
        System.out.println("5. Exit");
        System.out.print("Masukkan Inputan Anda : ");
    }

    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant[] temp = new Merchant[DataMerchant.merc.length+1];
        for (int i = 0; i < DataMerchant.merc.length; i++) {
            temp[i] = DataMerchant.merc[i];
        }
        temp[temp.length - 1] = merchant;
        return temp;
    }

    public static void tampilData(){
        System.out.println("==== Tampilan Data Merchant UBFood ====");
        for (int i = 0; i < merc.length; i++) {
            System.out.println("No Produk       : "+(i+1));
            System.out.println("Nama Merchant   : "+merc[i].getNamaMerchant());
            System.out.println("Nama Produk     : "+merc[i].getNamaProduk());
            System.out.println("Harga           : "+(int)merc[i].getHargaMakanan());    
            System.out.println("=======================================");
        }
    }

    public static Merchant[] cariMerchant(String nama){
        Merchant[] temp = new Merchant[DataMerchant.merc.length];
        for (int i = 0; i < merc.length; i++) {
            String[] kata = nama.split(" ");
            String[] kata2 = merc[i].getNamaMerchant().split(" ");
            int sama = 0;
            for (int j = 0; j < kata2.length; j++) {
                if (kata[j].equalsIgnoreCase(kata2[i])) {
                    sama++;
                }
            }
            if (sama == kata.length) {
                temp[i] = DataMerchant.merc[i];
            }         
        }
        return temp;
    }

    public static void tampilMerchant(Merchant[] merchant){
        System.out.println("== Tampilan Cari Data Merchant UBFood ==");
        for (int i = 0; i < merchant.length; i++) {
            System.out.println("Nama Merchant   : "+merchant[i].getNamaMerchant());
            System.out.println("Nama Produk     : "+merchant[i].getNamaProduk());
            System.out.println("Harga           : "+(int)merchant[i].getHargaMakanan());    
            System.out.println("=======================================");
        }
    }

}
