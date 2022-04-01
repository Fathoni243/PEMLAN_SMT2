package com.SourceCode.UBFood;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        
        boolean kondisi = true;

        while (kondisi) {
            DataMerchant.Menu();
            byte input = scan.nextByte();
            scan.nextLine();
            if (input == 1) {
                DataMerchant.tampilData();
            }else if (input == 2) {
                System.out.print("Masukkan Nama Merchant : ");
                String namaMerchant = scan.nextLine();
                System.out.print("Masukkan Nama Produk   : ");
                String namaProduk = scan.nextLine();
                System.out.print("Masukkan Harga Produk  : ");
                Double Harga = scan.nextDouble();
                DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, Harga));
            }else if(input == 3) {
                System.out.print("Masukkan Nama Merchant : ");
                String cariNama = scan.nextLine();
                DataMerchant.tampilMerchant(DataMerchant.cariMerchant(cariNama));
            }else if (input == 4) {
                System.out.print("Masukkan Nama Merchant : ");
                String cariNama = scan.nextLine();
                DataMerchant.updateMerchant(DataMerchant.cariMerchant(cariNama));
            }else if (input == 5) {
                kondisi = false;
            }
            
        }
        
    }
}
