package com.SourceCode.HR_BCC;

import java.util.*;

public class winnerOfTheWinner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jmlNama = scan.nextInt();
        String[] nama = new String[jmlNama];

        for (int i = 0; i < jmlNama; i++) {
            nama[i] = scan.next();
        }

        int[] cek = new int[jmlNama];
        for (int i = 0; i < jmlNama; i++) {
            for (int j = 0; j < jmlNama; j++) {
                if (nama[i].equals(nama[j])) {
                    cek[i]++;   
                }
              }
        }

        int index = 0;
        for (int i = 0; i < jmlNama; i++) {
            for (int j = 0; j < jmlNama; j++) {
                if (cek[i] > cek[j]) {
                    index = i;
                }
            }
        }

        System.out.println(nama[index]);
    }
}