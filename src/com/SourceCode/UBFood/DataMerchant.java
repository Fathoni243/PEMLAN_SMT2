package com.SourceCode.UBFood;

public class DataMerchant {
    static Merchant[] merc = new Merchant[0];

    public static int tambah(int baru){
        return baru;
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
            System.out.println("==== Data Merchant ke "+(i+1)+" ====");
            System.out.println("Nama Merchant   : "+merc[i].getNamaMerchant());
            System.out.println("Nama Produk     : "+merc[i].getNamaProduk());
            System.out.println("Harga           : "+(int)merc[i].getHargaMakanan());    
        }
    }

    static void Menu(){
        System.out.println("==== Selamat Datang di UBFood ====");
        System.out.println("1. Tampil Data");
        System.out.println("2. Tambah Merchant");
        System.out.println("3. Update Merchant");
        System.out.print("Masukkan Inputan Anda : ");
    }

}
