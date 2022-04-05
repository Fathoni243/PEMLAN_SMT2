package com.SourceCode.SCMateri.CobaArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nama MK : ");
        MataKuliah mk = new MataKuliah(scan.nextLine());

        System.out.println("Masukkan Nama Mahasiswa : ");
        mk.addMahasiswa(scan.nextLine());
        mk.addMahasiswa(scan.nextLine());

        System.out.println("Jumlah Mahasiswa Matkul "+mk.getNamaMK()+" adalah "+mk.getJumlahMahasiswa()+ " orang");
        String[] mhs = mk.getMahasiswa();
        System.out.println("Daftar Nama Mahasiswa : ");
        for (String arrMhs : mhs) {
            System.out.println(arrMhs);
        }

        System.out.print("Nama Mahasiswa yang ingin dihapus : ");
        mk.dropMahasiswa(scan.nextLine());
        String[] mhs1 = mk.getMahasiswa();

        for (String arrMhs : mhs1) {
            System.out.println(arrMhs);
        }
    }
}
