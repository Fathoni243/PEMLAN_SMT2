package com.SourceCode.FilkomTourTravel;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Karyawan[] karyawanArray = new Karyawan[3];

        for (int i = 0; i < karyawanArray.length; i++) {
            karyawanArray[i] = new Karyawan();
        }

        for (int i = 0; i < karyawanArray.length; i++) {
            System.out.println("Karyawan ke-"+(i+1));
            System.out.print("Nama Karyawan          : ");
            karyawanArray[i].nama = scan.nextLine();
            System.out.print("Alamat Karyawan        : ");
            karyawanArray[i].alamat = scan.nextLine();
            System.out.print("No Telfon Karyawan     : ");
            karyawanArray[i].noTelp = scan.nextLine();
            System.out.print("Jenis Kelamin Karyawan : ");
            karyawanArray[i].jk = scan.nextLine();
            System.out.print("Kategori Karyawan      : ");  
            karyawanArray[i].kategori = scan.nextLine();
            System.out.println();
        }

        for (Karyawan karyawan : karyawanArray) {
            System.out.println("===========================");
            System.out.print("Nama Karyawan          : ");
            System.out.println(karyawan.nama);
            System.out.print("Alamat Karyawan        : ");
            System.out.println(karyawan.alamat);
            System.out.print("No Telfon Karyawan     : ");
            System.out.println(karyawan.noTelp);
            System.out.print("Jenis Kelamin Karyawan : ");
            System.out.println(karyawan.jk);
            System.out.print("Kategori Karyawan      : ");
            System.out.println(karyawan.kategori);
            System.out.print("Keterangan Karyawan    : ");
            karyawan.KeteranganKaryawan(karyawan.kategori);
        }

    }
}