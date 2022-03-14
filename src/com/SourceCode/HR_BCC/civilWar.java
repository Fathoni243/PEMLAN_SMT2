package com.SourceCode.HR_BCC;

import java.util.*;

import com.SourceCode.SCMateri.OOPTeory.main;

public class civilWar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a==1){
            a=14;
        }if(b==1){
            b=14;
        }

        if(a>b){
            System.out.println("Captain America");
        }else if(b>a){
            System.out.println("Iron Man");
        }else{
            System.out.println("Draw");
        }   
    }
}
