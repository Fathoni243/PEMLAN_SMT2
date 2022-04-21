package com.SourceCode;



public class CobaCoba {

   public static void main(String[] args) {
      int num = 0;
      int minggu = 0;
      for(int i = 1; i <= 22; i++){
         if((i - minggu) % 6 == 0){
            num++;
         }
         if(i % 7 == 0){
            num++;
            minggu++;
         }
      }

      System.out.println(num);

   }
}