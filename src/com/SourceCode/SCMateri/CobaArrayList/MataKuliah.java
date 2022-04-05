package com.SourceCode.SCMateri.CobaArrayList;

import java.util.ArrayList;

public class MataKuliah {
    private String namaMk;
    private ArrayList <String> mahasiswas;

    public MataKuliah(String namaMK){
        this.namaMk = namaMK;
        this.mahasiswas = new ArrayList<String>();
    }

    public void addMahasiswa(String mhs){
        mahasiswas.add(mhs);
    }

    public String[] getMahasiswa(){
        String[] a = new String[mahasiswas.size()];
        return mahasiswas.toArray(a);
    }

    public int getJumlahMahasiswa(){
        return mahasiswas.size();
    }

    public String getNamaMK(){
        return namaMk;
    }

    public void dropMahasiswa(String mhs){
        mahasiswas.remove(mhs);
    }
}
