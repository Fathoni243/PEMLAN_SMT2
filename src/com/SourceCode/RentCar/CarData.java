package com.SourceCode.RentCar;

import java.util.ArrayList;


public class CarData {
    ArrayList<Car> carList = new ArrayList<Car>();

    public void addCar(String carType, String polNum, String merk){
        Car car = new Car(carType, polNum, merk, true);

        carList.add(car);
    }

    public void listOfCar(){
        System.out.println("------------------------------");
        System.out.println("DAFTAR MOBIL");
        System.out.println("------------------------------");
        for (int i = 0; i < carList.size(); i++) {
            System.out.println("TIPE MOBIL : "+carList.get(i).getCarType());
            System.out.println("NO. POLISI : "+carList.get(i).getPolNum());
            System.out.println("MERK MOBIL : "+carList.get(i).getMerk());
            System.out.println("------------------------------");
        }
    }

}
