package com.SourceCode.LatihanUTP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean kondisi= true;
        DataPasien dataPasien = new DataPasien();
        DataObat dataObat = new DataObat();

        while (kondisi) {
            System.out.println("Pilihan : ");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Daftar Pasien");
            System.out.println("3. Tambah Obat");
            System.out.println("4. Daftar Obat");
            System.out.println("5. Obat yang akan diberikan ke pasien");
            System.out.println("6. Daftar Obat yang telah diberikan ke pasien");
            System.out.println("7. Obat yang stocknya telah habis");
            System.out.println("8. keluar");
            System.out.print("Masukkan Pilihan Menu : ");
            byte pilih = scan.nextByte(); scan.nextLine();
    
            if (pilih == 1) {
                System.out.println("Masukkan Nama Pasien : ");
                String nama = scan.nextLine();
                System.out.println("Masukkan Umur Pasien : ");
                int umur = scan.nextInt(); scan.nextLine();
                System.out.println("Masukkan Alamat Pasien : ");
                String alamat = scan.nextLine();
                System.out.println("Masukkan Jenis Kelamin Pasien : ");
                String jk = scan.nextLine();
                dataPasien.tambahPasien(nama, umur, alamat, jk, null);
            }else if (pilih == 2) {
                dataPasien.tampilPasien();
            }else if (pilih == 3) {
                System.out.println("Masukkan Nama Obat : ");
                String nama = scan.nextLine();
                System.out.println("Masukkan No. Seri Obat : ");
                String seriObat = scan.nextLine();
                System.out.println("Masukkan Kategori Obat : ");
                String kategori = scan.nextLine();
                System.out.println("Masukkan Stock Obat : ");
                int stock = scan.nextInt(); scan.nextLine();
                dataObat.tambahObat(nama, seriObat, kategori, stock);
            }else if (pilih == 4) {
                dataObat.tampilObat();
            }else if (pilih == 5) {
                System.out.println("Nama Pasien yang ingin diberi obat : ");
                String nama = scan.nextLine();
                System.out.println("Nomor Seri obat yang ingin diberikan : ");
                String noSeri = scan.nextLine();
                dataPasien.tambahObatPasien(nama, noSeri);
            }else if (pilih == 6) {
                
            }else if (pilih == 7) {
                dataObat.stokKosong();
            }else if (pilih == 8) {
                kondisi = false;
            }else {
                System.out.println("Inputan Salah");
            }
        }

    }   
}
