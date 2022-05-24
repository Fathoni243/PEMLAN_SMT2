package com.SourceCode;

import java.util.*;

public class CobaCoba{

   public static void main(String[] args) {
        int[] array = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        boolean condition = true;

        while (condition) {
            System.out.print("nilai array ke: ");
            
            // System.out.println("Handling out of bound");
            int index = userInput.nextInt();
            try {
                System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.err.println(e);
            }
            
        }

        System.out.println("Akhir");
   }
}