package com.SourceCode.SCMateri;

import java.util.*;

public class ExceptionHandling {

    static void checkAge(int age) {
        if (age < 18) {
          throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
          System.out.println("Access granted - You are old enough!");
        }  
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // try {
        //    int[] myNumbers = {1, 2, 3};
        //    System.out.println(myNumbers[2]);
        // } catch (Exception e) {
        //    System.out.println("Something went wrong.");
        // } finally {
        //    System.out.println("The 'try catch' is finished.");
        // }
        
        // checkAge(20);

        try {
            System.out.print("Masukkan pembilang : ");
            int x = scan.nextInt();
            System.out.print("Masukkan penyebut  : ");
            int y = scan.nextInt();
            System.out.println("Hasil Pembagian : "+(x/y));
            
        } catch (ArithmeticException e) {
            System.out.println("Penyebut tidak boleh 0");
            // throw new ArithmeticException("Penyebut tidak boleh 0");
        } catch (InputMismatchException e){
            System.out.println("Input tidak sesuai");
            // throw new InputMismatchException("Inputan harus berupa integer");
        }catch (Exception e){
            // catch jenis Exception berfungsi untuk mengantisipasi 
            // eror yang tidak diketahui jenisnya
            System.out.println("Terdapat eror");
        }   
        
        try {
            scan.nextLine();
            String a = scan.nextLine();
            System.out.println(a);
        
        } catch (Exception e) {
            System.out.println("Eror wes");
            System.out.println(e.getMessage());
        }
    }
}