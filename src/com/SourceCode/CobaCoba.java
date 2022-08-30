package com.SourceCode;

import java.util.*;
public class CobaCoba{

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      boolean condition = true;

      while (condition) {
         System.out.print("Masukkan angka : ");
         int angka = scan.nextInt();
         if (angka < 0) {
            System.out.println("bilangan negatif");
         }else if(angka > 0){
            System.out.println("bilangan positif");
         }else{
            System.out.println("angka 0");
         }

         int ulang = 0;
         System.out.println("ulangi ? 1:yes / 2:no");
         System.out.print("input : ");
         ulang = scan.nextInt();
         if (ulang == 2) {
            condition = false;
         }
      }

   }
}