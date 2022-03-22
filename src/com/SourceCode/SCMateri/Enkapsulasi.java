package com.SourceCode.SCMateri;

import java.util.*;

class Person {
    private String nama;

    //mutator = setter
    public void setNama(String nama){
        this.nama = nama;
    }

    //assesor = getter
    public String getNama(){
        return this.nama;
    }
}

public class Enkapsulasi {
    public static void main(String[] args) {
        Person p = new Person();
        
        p.setNama("Toni");

        System.out.println(p.getNama());
    }
}