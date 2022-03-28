package com.SourceCode.UTS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama = "", kategori = "";
        int umur = 0, masaKerja = 0, durasiKerja = 0, lamaKerja = 0;
        double gajiPokok = 0, honor = 0;

        System.out.println("Masukkan Jumlah Pegawai : ");
        int jmlPegawai = scan.nextInt();
        scan.nextInt();
        Pegawai[] pegawaiArray = new Pegawai[jmlPegawai];

        for (int i = 0; i < pegawaiArray.length; i++) {
            System.out.println("Pegawai ke "+(i+1));
            System.out.print("Nama : ");
            nama = scan.nextLine();
            System.out.print("Umur : ");
            umur = scan.nextInt();
            System.out.print("Jenis Pegawai :");
            kategori = scan.nextLine();

            if (kategori.equalsIgnoreCase("Admin")) {
                System.out.print("Gaji Pokok : ");
                gajiPokok = scan.nextDouble();
                System.out.print("Masa Kerja : ");
                masaKerja = scan.nextInt();
                pegawaiArray[i] = new Administrasi(nama, umur, gajiPokok, masaKerja, kategori);
                // pegawaiArray[i].hitungGajiAdmin();
                
            }else if (kategori.equalsIgnoreCase("Security")) {
                System.out.print("Gaji Pokok : ");
                gajiPokok = scan.nextDouble();
                System.out.print("Durasi Kerja : ");
                durasiKerja = scan.nextInt();
                pegawaiArray[i] = new Security(nama, umur, gajiPokok, durasiKerja, kategori);

            }else if (kategori.equalsIgnoreCase("Honorer")) {
                System.out.print("Honor : ");
                honor = scan.nextDouble();
                System.out.print("Durasi Kerja : ");
                lamaKerja = scan.nextInt();
                pegawaiArray[i] = new PegawaiHonorer(nama, umur, lamaKerja, kategori);

            }
        }

        

    }
}
