package com.SourceCode.SCMateri;

import java.util.*;;

public class ExceptionTeory {

   public static void coba1() {
    // coba2();
    try {
       coba2();
    } catch (ArithmeticException e) {
       e.printStackTrace();
       System.out.println("Arithmetic coba ditangani di coba1");
    }
 }

 public static void coba2() throws ArithmeticException{
    System.out.println(23/0);
 }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      try {
         coba1();
      } catch (ArithmeticException e) {
         // e.printStackTrace();
         System.out.println("Arithmetic coba ditangani di main");
      }
    }
}
