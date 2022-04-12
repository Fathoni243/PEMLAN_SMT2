package com.SourceCode.FilkomTourPolymorphisme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rute="", nama="", alamat="", noTelp="", jk="", kategori="";
        int tunjangan = 0, pilihMobil = 0;
        String noPlat="", merk="", warna="", thKeluaran="";

        System.out.println("=========================================");
        System.out.print("Masukkan Jumlah Karyawan : ");
        int jmlKaryawan = scan.nextInt();
        scan.nextLine();
        Karyawan[] karyawanArray = new Karyawan[jmlKaryawan];

        System.out.print("Masukkan Jumlah Mobil    : ");
        int jmlMobil = scan.nextInt();
        scan.nextLine();
        Mobil[] mobilArray = new Mobil[jmlMobil];

        Karyawan karyawan = new Admin("nama", "alamat", "noTelp", "jk", "kategori", 100);
        System.out.println(karyawan.getNama());

        for (int i = 0; i < mobilArray.length; i++) {
            System.out.println("=========================================");
            System.out.println("Mobil ke-"+(i+1));
            System.out.print("No Plat Mobil          : ");
            noPlat = scan.nextLine();
            System.out.print("Merek Mobil            : ");
            merk = scan.nextLine();
            System.out.print("Warna Mobil            : ");
            warna = scan.nextLine();
            System.out.print("Tahun Keluaran Mobil   : ");
            thKeluaran = scan.nextLine();

            mobilArray[i] = new Mobil(noPlat, merk, warna, thKeluaran);
        }
        
        for (int i = 0; i < karyawanArray.length; i++) {
            System.out.println("=========================================");
            System.out.println("Karyawan ke-"+(i+1));
            System.out.print("Nama Karyawan          : ");
            nama = scan.nextLine();
            System.out.print("Alamat Karyawan        : ");
            alamat = scan.nextLine();
            System.out.print("No Telfon Karyawan     : ");
            noTelp = scan.nextLine();
            System.out.print("Jenis Kelamin Karyawan : ");
            jk = scan.nextLine();
            System.out.print("Kategori Karyawan      : ");
            kategori = scan.nextLine();            

            if (kategori.equalsIgnoreCase("supir travel")) {
                System.out.print("Masukkan Rute Trayek   : ");
                rute = scan.nextLine();
                karyawanArray[i] = new SupirTravel(nama, alamat, noTelp, jk, kategori, rute);

            }else if(kategori.equalsIgnoreCase("admin")){
                System.out.print("Masukkan Tunjangan     : ");
                tunjangan = scan.nextInt();
                scan.nextLine();
                karyawanArray[i] = new Admin(nama, alamat, noTelp, jk, kategori, tunjangan);

            }else if (kategori.equalsIgnoreCase("supir rentcar")) {
                System.out.println("=========================================");
                System.out.println("=========== Daftar Mobil Sewa ===========");
                System.out.println("=========================================");
                for (int j = 0; j < mobilArray.length; j++) {
                    System.out.println("Mobil ke-"+(j+1));
                    mobilArray[j].getInfo();
                    System.out.println("=========================================");
                }
                System.out.print("Pilih Mobil Sewa       : ");
                pilihMobil = scan.nextInt()-1; 
                scan.nextLine();
                karyawanArray[i] = new SupirRentcar(nama, alamat, noTelp, jk, kategori, mobilArray[pilihMobil]);
            }
            
        }

        TampilMobil(mobilArray);

        System.out.println("============ Daftar Karyawan ============");
        System.out.println("=========================================");
        for (int i = 0; i < karyawanArray.length; i++) {
            System.out.println("Karyawan ke-"+(i+1));
            getInfoKaryawan(karyawanArray[i]);
            System.out.println("=========================================");
        }

    }

    public static void TampilMobil(Mobil[] mobil){
        System.out.println("=========================================");
        System.out.println("=========== Daftar Mobil Sewa ===========");
        System.out.println("=========================================");
        for (int i = 0; i < mobil.length; i++) {
            mobil[i].getInfo();
            System.out.println("=========================================");
        }
    }

    public static void getInfoKaryawan(Karyawan k){
        if (k instanceof Admin) {
            Admin admin = (Admin) k;
            admin.getInfo();
        }else if (k instanceof SupirRentcar) {
            SupirRentcar supirRentcar = (SupirRentcar) k;
            supirRentcar.getInfo();
        }else if (k instanceof SupirTravel) {
            SupirTravel supirTravel = (SupirTravel) k;
            supirTravel.getInfo();
        }
    }
}
