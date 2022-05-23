package com.SourceCode.ExceptionHandlingTugas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Selamat Datang di Game Defend FILKOM!");
        System.out.print("Silahkan Masukkan Nama Player : ");
        String nama = scan.nextLine();
        System.out.println("Silahkan pilih karakter yang anda inginkan : ");
        System.out.println("1. Magician");
        System.out.println("2. Healer");
        System.out.println("3. Warrior");
        System.out.print("Masukkan Pilihan Anda : ");
        
        Titan titan = new Titan(0, 45, 200);
        Magician magician = new Magician(10, 60, 100);
        Healer healer = new Healer(10, 10, 70);
        Warrior warrior = new Warrior(30, 25, 80);
        
        boolean condition = true;
        int pilih = 0;
        
        while (condition) {
            try {
                pilih = scan.nextInt();
                System.out.println("Selamat Datang, "+nama+" !");
                boolean kondisi = true;
                if (pilih == 1) {
                    Class clMagician = magician.getClass();
                    Class clTitan = titan.getClass();
                    String nameMagician = clMagician.getSimpleName();
                    String nameTitan = clTitan.getSimpleName();
                    
                    System.out.println("-".repeat(12)+" STATUS "+"-".repeat(12));
                    System.out.println("Role        : "+nameMagician);
                    magician.info();
        
                    int i=1;
                    while (kondisi) {
                        System.out.println("=".repeat(12)+" TURN "+(i++)+" "+"=".repeat(12));
                        if (magician.attack() == true) {
                            titan.receiveDamage(magician.getAttack());
                        }
                        if (titan.attack() == true) {
                            magician.receiveDamage(titan.getAttack());
                        }
        
                        System.out.println("Enemy's HP : "+titan.getHP());
                        System.out.println(nama+"'s HP : "+magician.getHP());
        
                        if (titan.getHP() == 0 || magician.getHP() == 0){
                            kondisi = false;
                        }
                    }
                    System.out.println();
                    System.out.println("=".repeat(30));
                    if (titan.getHP() == 0) {
                        System.out.println(nama+" menang");
                    }else {
                        System.out.println("Titan Menang");
                    }
                    System.out.println();
        
                    System.out.println("=".repeat(12)+" PLAYER "+"=".repeat(12));
                    System.out.println("-".repeat(12)+" STATUS "+"-".repeat(12));
                    System.out.println("Role        : "+nameMagician);
                    magician.info();
                    System.out.println("=".repeat(12)+" ENEMY "+"=".repeat(12));
                    System.out.println("-".repeat(12)+" STATUS "+"-".repeat(12));
                    System.out.println("Role        : "+nameTitan);
                    titan.info();
                    System.exit(0);
                }else if(pilih == 2){
                    Class cl = healer.getClass();
                    String nameHealer = cl.getSimpleName();
        
                    System.out.println("-".repeat(12)+" STATUS "+"-".repeat(12));
                    System.out.println("Role        : "+nameHealer);
                    System.out.println("HP          : "+healer.getHP());
                    System.out.println("Attack      : "+healer.getAttack());
                    System.out.println("Defence     : "+healer.getDefence());
                }else if (pilih == 3) {
                    Class cl = warrior.getClass();
                    String nameWarrior = cl.getSimpleName();
        
                    System.out.println("-".repeat(12)+" STATUS "+"-".repeat(12));
                    System.out.println("Role        : "+nameWarrior);
                    System.out.println("HP          : "+warrior.getHP());
                    System.out.println("Attack      : "+warrior.getAttack());
                    System.out.println("Defence     : "+warrior.getDefence());
                }
            } catch (InputMismatchException e) {
                System.out.println("Tolong Masukkan Angka!");
                // scan.nextLine();
                System.out.print("Masukkan Pilihan Anda : ");
                pilih = scan.nextInt();
                // condition = true;
            }
        }

    }
}
