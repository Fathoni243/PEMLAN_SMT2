package com.SourceCode;

import java.util.*;

public class CobaCoba{

   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       int[] array = {1,2,3};

       System.out.println(array[-1]);

       try {
           int a = scan.nextInt();
           int b = scan.nextInt();
           int c = scan.nextInt();
       } catch (InputMismatchException e) {
           System.out.println("Salah input");
       }catch (Exception e){
           System.out.println("Error");
       }
   }
}