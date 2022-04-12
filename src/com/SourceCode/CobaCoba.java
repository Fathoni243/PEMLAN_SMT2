package com.SourceCode;

import java.util.Scanner;

public class CobaCoba {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int angka1 = (int)(Math.random()*11);
      int angka2 = (int)(Math.random()*11);
      boolean kondisi = true;

      while (kondisi) {
         System.out.println("Berapakah hasil dari "+angka1+" + "+angka2+" ?");
         System.out.print("Jawab : ");
         int jawab = scan.nextInt();
         
         if (angka1 + angka2 != jawab) {
            System.out.println("Jawaban kamu salah, coba lagi");
         }else{
            System.out.println("Jawaban kamu benar");
            kondisi = false;
         }
      }
   }
}