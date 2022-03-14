package com.SourceCode.SCMateri;

import java.util.*;

class Mahasiswa{
    String nama, nim;
    static int umur;

    Mahasiswa(){

    }

    Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
}

public class PassByReference{
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        // mhs = mhs2;
        
        Mahasiswa.umur = 19;

        String addr1 = Integer.toHexString(System.identityHashCode(mhs));
        System.out.println(addr1);
        String addr2 = Integer.toHexString(System.identityHashCode(mhs2));
        System.out.println(addr2);

        mhs.nama = "Toni";
        System.out.println(mhs.nama);
        System.out.println(mhs2.nama);

    }

}