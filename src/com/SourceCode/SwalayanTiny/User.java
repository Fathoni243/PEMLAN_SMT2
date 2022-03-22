package com.SourceCode.SwalayanTiny;

public class User {
    private String name, membershipId, pin;
    private double balance;
    private boolean isBanned;

    User(String name, String membershipId, String pin, double balance){
        this.name = name;
        this.membershipId = membershipId;
        this.pin = pin;
        this.balance = balance;
    }

    User(){
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getMembershipId(){
        return membershipId;
    }

    public void setMembershipId(String membershipId){
        this.membershipId = membershipId;
    }

    public String getPin(){
        return pin;
    }

    public void setPin(String pin){
        this.pin = pin;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public boolean getIsBanned(){
        return isBanned;
    }

    public void setIsbanned(boolean isBanned){
        this.isBanned = isBanned;
    }

}
