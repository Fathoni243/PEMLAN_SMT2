package com.SourceCode.SCMateri;

import java.util.*;

public class ArrayListDanLinkedList {
    public static void main(String[] args) {
        // buat ArrayList tanpa tipe data 
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("dua");
        arrayList.add(3);
        arrayList.add(4.0);

        //menampilkan isi dalam arraylist
        for (var a : arrayList) {
            System.out.println(a);
        }

        //mengambil nilai dari arraylist
        var ambil = arrayList.get(1);
        System.out.println("Coba Get : "+ambil);

        System.out.println();

        //merubah arraylist
        arrayList.set(0, "satu");
        //menghapus arraylist 1 index
        arrayList.remove(1);
        
        System.out.println("== Setelah dirubah ==");
        for (var a : arrayList) {
            System.out.println(a);
        }

        //menampilkan panjang dari arraylist / sama dengan .length
        var b = arrayList.size();
        System.out.println("Panjang dari arraylist : "+b);  
        
        System.out.println("\nArrayList Dengan Tipe Data");
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars.get(0)); 
        cars.remove("Mazda");
        cars.set(0, "Opel");
        System.out.println(cars);

        // keuntungan LinkedList ada beberapa method yang bisa digunakan untuk 
        // memanipulasi data seperti contoh dibawah ini
        System.out.println("\nLinkedList");
        LinkedList<String> cars2 = new LinkedList<String>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("Mazda");
        
        // Use removeFirst() remove the first item from the list
        cars2.removeFirst();
        System.out.println(cars2);


        // ArrayList untuk menyimpan dan mengakses data, dan LinkedList untuk memanipulasi data.
    }

}
