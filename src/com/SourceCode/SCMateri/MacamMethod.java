package com.SourceCode.SCMateri;

import java.util.*;

public class MacamMethod{
    
    //method overloading
    static void Hello(){
        System.out.println("Hello World");
    }

    static String Hello(String nama){
        return nama;
    }
    
    // method rekursif
    static int factorialRecursive(int value){
        if (value == 1) {
            return 1;
        }else{
            return value *factorialRecursive(value-1);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        Hello();
        System.out.println(Hello("HALLO"));

        int a = factorialRecursive(5);
        System.out.println(a);
    }
}