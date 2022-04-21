package com.SourceCode.SCMateri;

interface interface1{
    String a = "a";

    default void methodDefault(){
       System.out.println("ini method default");
    }
 
    static void start(){
       System.out.println("ini method static");
    }
 }

 interface interface2{
    public String cetakStr1(String a);
 }
 
 class Coba implements interface1, interface2{
    private String nama;
 
    @Override
    public void methodDefault() {
        interface1.super.methodDefault();
        System.out.println("ini method default override");
    }

    @Override
    public String cetakStr1(String a) {
        return a;
    }
 
 }

public class Interface {
    public static void main(String[] args) {
        Coba coba = new Coba();

        coba.methodDefault();
        interface1.start();
        System.out.println(coba.cetakStr1("ini method abstract"));
    }
}
