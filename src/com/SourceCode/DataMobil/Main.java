package com.SourceCode.DataMobil;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Jumlah mobil yang ingin dimasukkan : ");
        int jml = scan.nextInt();
        
        Mobil[] mobilArray = new Mobil[jml];
        
        for (int i = 0; i < mobilArray.length; i++) {
            mobilArray[i] = new Mobil();
        }
        scan.nextLine();
        for (int i = 0; i < mobilArray.length; i++) {
            System.out.println("Mobil ke-"+(i+1));
            System.out.print("Merek      : ");
            mobilArray[i].merk = scan.nextLine();
            System.out.print("Warna      : ");
            mobilArray[i].warna = scan.nextLine();
            System.out.print("No Plat    : ");
            mobilArray[i].noPlat = scan.nextLine();
            System.out.print("ThKeluaran : ");
            mobilArray[i].thKeluaran = scan.nextLine();
            System.out.println();
        }

        System.out.println("==== DATA MOBIL ====");
        for (int i = 0; i < mobilArray.length; i++) {
            System.out.println("Mobil ke-"+(i+1));
            mobilArray[i].getDataMobil(mobilArray[i].noPlat, mobilArray[i].merk, 
            mobilArray[i].warna, mobilArray[i].thKeluaran);
        }

    }
}
