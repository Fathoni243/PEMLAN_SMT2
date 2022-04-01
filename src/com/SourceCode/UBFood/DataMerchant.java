package com.SourceCode.UBFood;

import java.util.Scanner;

public class DataMerchant {
    static Merchant[] merc = new Merchant[0];
    static Scanner scan = new Scanner(System.in);
    
    static void Menu(){
        System.out.println("==== Selamat Datang di UBFood ====");
        System.out.println("1. Tampil Data");
        System.out.println("2. Tambah Merchant");
        System.out.println("3. Cari Merchant");
        System.out.println("4. Update Merchant");
        System.out.println("5. Exit");
        System.out.print("Masukkan Inputan Anda  : ");
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

    public static Merchant cariMerchant(String nama){
        Merchant save = merc[0];
        for (int i = 0; i < merc.length; i++) {
            if (nama.equalsIgnoreCase(merc[i].getNamaMerchant())) {
                save = merc[i];
            }         
        }
        return save;
    }

    public static void tampilMerchant(Merchant merchant){
        System.out.println("== Tampilan Cari Data Merchant UBFood ==");
        System.out.println("Nama Merchant   : "+merchant.getNamaMerchant());
        System.out.println("Nama Produk     : "+merchant.getNamaProduk());
        System.out.println("Harga           : "+(int)merchant.getHargaMakanan());    
        System.out.println("=======================================");
        
    }

    public static Merchant updateMerchant(Merchant merchant){
        System.out.println("Pilih yang ingin diupdate");
        System.out.println("1. Nama Merchant");
        System.out.println("2. Nama Produk");
        System.out.println("3. Harga");
        System.out.print("Masukkan Inputan Anda : ");
        int input = scan.nextInt();
        scan.nextLine();
        if (input == 1) {
            System.out.print("Masukkan Update Nama Merhant  : ");
            String inputNamaMerchant = scan.nextLine();
            merchant.setNamaMerchant(inputNamaMerchant);
        }else if (input == 2) {
            System.out.print("Masukkan Update Nama Produk  : ");
            String inputNamaProduk = scan.nextLine();
            merchant.setNamaProduk(inputNamaProduk);
        }else if (input == 3) {
            System.out.print("Masukkan Update Harga  : ");
            Double inputHarga = scan.nextDouble();
            merchant.setHargaMakanan(inputHarga);
        }
        return merchant;
    }

}
