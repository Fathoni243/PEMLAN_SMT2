package com.SourceCode.HR_BCC;

import java.util.*;

public class Semut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int iterasi = scan.nextInt();
        int jmlSemut = scan.nextInt();

        String[][] Semut = new String[jmlSemut][2];
        scan.nextLine();

        for(int i=0; i<Semut.length ;i++){
            for (int j = 0; j < 2; j++) {
                Semut[i][j] = scan.nextLine();
            }
        }

        int[][] Semut2 = new int[jmlSemut][2];
        for (int i = 0; i < Semut.length; i++) {
            for (int j = 0; j < 2; j++) {
                if(Semut[i][1].equals("Ratu")){
                    Semut2[i][1] = 4;
                }else if(Semut[i][j].equals("Pejantan")){
                    Semut2[i][1] = 3;
                }else if(Semut[i][j].equals("Pekerja")){
                    Semut2[i][1] = 2;
                }else if(Semut[i][j].equals("Preman")){
                    Semut2[i][1] = 1;
                }
                Semut2[i][0] = i;
            }
        }
        
        
        System.out.println(Arrays.deepToString(Semut));
        System.out.println(Arrays.deepToString(Semut2));

    }
}
