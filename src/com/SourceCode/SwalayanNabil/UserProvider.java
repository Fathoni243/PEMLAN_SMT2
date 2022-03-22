/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SourceCode.SwalayanNabil;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class UserProvider {
    static Scanner sc = new Scanner(System.in);
    private User[] users;
    private boolean benar = true, benar2 = true;
    static String nama,memberId;
    static double saldo;
    static User us = new User();
    static BarangProvider bp = new BarangProvider();
   
     public UserProvider(){
        this.users = new User[]{
            new User("nabilghifari","385150700005","230803",500000),
            new User("dzakibew","565150701004","123456",400000),
            new User("aalrasyid","745150707009","789012",300000),
            new User("Rijal", "385150700006", "134002", 600000),
            new User("Teni","745150707010","234567",10000)
         };
        
    }
    public User login(String n){
       User cariUser = new User();
       for(User a : users){
           if(n.equals(a.getMembershipId())){
               cariUser = a;
               benar = false;
               int akses = 0;
               do{
               System.out.print("Masukkan Password : ");
               String pass = sc.nextLine();
               if(pass.equals(a.getPin())){
                   benar = false;
                   nama = a.getName();
                   memberId = a.getMembershipId();
                   saldo = a.getBalance();
                   ProjectPratikum.menu();
               }else{
                   System.out.println("Password salah");
                   akses++;
               }
               }while(akses!=3&&benar == false);System.exit(akses);
           }
        }
       return cariUser;
    }
    public boolean getBoolean(){
        return benar;
    }
    public void lihatProfil(){
        System.out.println("NAMA PELANGGAN : "+nama);
        System.out.println("Member ID      : "+memberId);
        us.setBalance(saldo);
        System.out.println("Saldo          : "+saldoAkhir());
        if(memberId.substring(0, 2).equals("38")){
            us.setMember("silver");
        }else if(memberId.substring(0, 2).equals("56")){
            us.setMember("gold");
        }else if(memberId.substring(0, 2).equals("74")){
            us.setMember("platinum");
        }
        System.out.println("Member Keanggotaan : "+us.getMember());
    }
    public void topUp(){
        if(saldo>us.getBalance()){
        benar2 = true;
        }
    }
    public void topDown(){
        if(saldo<us.getBalance()){
        benar2 = false;
        }
    }
    public boolean getBoolean2(){
        return benar2 = true;
    }
    public double saldoAkhir(){
        us.setBalance(saldo);
        us.topUp(ProjectPratikum.topUp);
        us.topDown(bp.totalUang);
        return us.getBalance();
    }
   
}
