package com.SourceCode;

import java.util.*;

class Hewan {
    String nama;
    String jenisHewan;
    int jumlahKaki;

    Hewan(String nama, String jenisHewan, int jumlahKaki){
        this.nama = nama;
        this.jenisHewan = jenisHewan;
        this.jumlahKaki = jumlahKaki;
    }

    Hewan(String nama, String jenisHewan){
        this.nama = nama;
        this.jenisHewan = jenisHewan;
    }

    void tampil(){
        System.out.println("Nama Hewan : "+ nama);
        System.out.println("Jenis Hewan : "+ jenisHewan);
        System.out.println("Jumlah Kaki : "+ jumlahKaki);
    }
}

public class CobaCoba {
    public static void main(String[] args) {
        Hewan kelinci = new Hewan("Kelinci", "Mamalia", 4);
        Hewan bekicot = new Hewan("Bekicot", "Mollusca");
        
        // System.out.println(kelinci.nama);
        // System.out.println(kelinci.jenisHewan);
        // System.out.println(kelinci.jumlahKaki);

        // System.out.println(bekicot.nama);
        // System.out.println(bekicot.jenisHewan);

        kelinci.tampil();
        bekicot.tampil();
    }
}