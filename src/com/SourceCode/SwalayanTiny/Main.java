package com.SourceCode.SwalayanTiny;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        UserProvider up = new UserProvider();

        System.out.print("Masukkan Member ID : ");
        String inputMember = scan.nextLine();
        System.out.print("Masukkan Password  : ");
        String inputPass = scan.nextLine();

        up.Login(inputMember, inputPass);

    }
}
