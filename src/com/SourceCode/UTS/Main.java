package com.SourceCode.UTS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama = "", kategori = "";
        int umur = 0, masaKerja = 0;
        double gajiPokok;

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
            }

        }
    }
}
