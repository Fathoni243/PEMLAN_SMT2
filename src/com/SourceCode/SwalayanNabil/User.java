/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SourceCode.SwalayanNabil;

public class User {
    private String name, membershipId, pin, member;
    private double balance;
    private boolean isBanned;
    User(String n, String m, String p, double b){
        this.name = n; this.membershipId = m; this.pin = p;
        this.balance = b;
    }
    User(){
        this.name = name;
        this.membershipId = membershipId;
        this.pin = pin;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setMembership(String m){
        this.membershipId = m;
    }
    public void setPin(String p){
        this.pin = p;
    }
    public void setBalance(double b){
        this.balance = b;
    }
    public void setMember(String m){
        this.member = m;
    } 
    public String getMember(){
        return member;
    }
    public String getName(){
        return name;
    }
    public String getMembershipId(){
        return membershipId;
    }
    public String getPin(){
        return pin;
    }
    public double getBalance(){
        return balance;
    }
    public void topUp(double Penambahan){
        this.balance += Penambahan;
    }
    public void topDown(double pengurangan){
        this.balance -= pengurangan;
    }
}
