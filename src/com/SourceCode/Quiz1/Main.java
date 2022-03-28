package com.SourceCode.Quiz1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama = "", kategori = "";
        int umur = 0, masaKerja = 0, durasiKerja = 0, lamaKerja = 0;
        double gajiPokok = 0, honor = 0;

        System.out.print("Masukkan Jumlah Pegawai : ");
        int jmlPegawai = scan.nextInt();
        scan.nextLine();
        Pegawai[] pegawaiArray = new Pegawai[jmlPegawai];

        for (int i = 0; i < pegawaiArray.length; i++) {
            System.out.println("Pegawai ke "+(i+1));
            System.out.print("Nama : ");
            nama = scan.nextLine();
            System.out.print("Umur : ");
            umur = scan.nextInt();
            scan.nextLine();
            System.out.print("Jenis Pegawai :");
            kategori = scan.nextLine();

            if (kategori.equalsIgnoreCase("Admin")) {
                System.out.print("Gaji Pokok : ");
                gajiPokok = scan.nextDouble();
                System.out.print("Masa Kerja : ");
                masaKerja = scan.nextInt();
                scan.nextLine();
                pegawaiArray[i] = new Administrasi(nama, umur, gajiPokok, masaKerja, kategori);
                
            }else if (kategori.equalsIgnoreCase("Security")) {
                System.out.print("Gaji Pokok : ");
                gajiPokok = scan.nextDouble();
                System.out.print("Durasi Kerja : ");
                durasiKerja = scan.nextInt();
                scan.nextLine();
                pegawaiArray[i] = new Security(nama, umur, gajiPokok, durasiKerja, kategori);

            }else if (kategori.equalsIgnoreCase("Honorer")) {
                System.out.print("Honor : ");
                honor = scan.nextDouble();
                System.out.print("Durasi Kerja : ");
                lamaKerja = scan.nextInt();
                scan.nextLine();
                pegawaiArray[i] = new PegawaiHonorer(nama, umur, lamaKerja, kategori, honor);

            }
        }

        for (int i = 0; i < pegawaiArray.length; i++) {
            pegawaiArray[i].getTampil();
        }

    }
}
