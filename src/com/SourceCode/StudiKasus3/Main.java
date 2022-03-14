package com.SourceCode.StudiKasus3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Karyawan[] karyawanArray = new Karyawan[3];
        
        for (int i = 0; i < karyawanArray.length; i++) {
            System.out.println("Karyawan ke-"+(i+1));
            System.out.print("Nama Karyawan          : ");
            String nama = scan.nextLine();
            System.out.print("Alamat Karyawan        : ");
            String alamat = scan.nextLine();
            System.out.print("No Telfon Karyawan     : ");
            String noTelp = scan.nextLine();
            System.out.print("Jenis Kelamin Karyawan : ");
            String jk = scan.nextLine();
            System.out.print("Kategori Karyawan      : ");
            String kategori = scan.nextLine();
            System.out.println();
            
            karyawanArray[i] = new Karyawan(nama, alamat, noTelp, jk, kategori);
        }

    }
}
