package com.SourceCode.SCMateri.OOPTeory;

public class car {
    public String color;
    public int power;
    public int speed;
    
    public void drive() {
        speed += 5;
        System.out.println("Mobil Jalan");
        System.out.println("Speed : "+speed);
    }

    public void stop() {
        speed = 0;
        System.out.println("Mobil berhenti"); 
        System.out.println("Speed : "+speed);
    }

    public void turnLeft() {
        System.out.println("Mobil belok kiri");
    }

    public void turnRight() {
        System.out.println("Mobil belok kanan");
    }
}
