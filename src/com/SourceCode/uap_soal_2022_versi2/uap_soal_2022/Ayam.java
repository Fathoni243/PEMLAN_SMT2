package com.SourceCode.uap_soal_2022_versi2.uap_soal_2022;

public class Ayam extends Hewan implements TreatmentInterface {
    private int eggPerDay; // Telur yang dihasilkan oleh satu ayam
    private double eggPrice; // Harga satu butir telur
    private Medicine medicine;

    public Ayam(){

    }

    public Ayam(int quantitiy, double expensePerDay, int eggPerDay, double eggPrice, double pricePerUnit){
        super("Ayam", quantitiy, expensePerDay, pricePerUnit);
        setEggPerDay(eggPerDay);
        setEggPrice(eggPrice);
    }


    public void setEggPerDay(int eggPerDay){
        this.eggPerDay = eggPerDay;
    }

    public void setEggPrice(double eggPrice){
        this.eggPrice = eggPrice;
    }

    public void setMedicine(Medicine medicine){
        // Roundabout way to clone
        Medicine newMedicine = medicine;
        this.medicine = newMedicine;
    }

    public int getEggPerDay(){
        return isBoosted()? 2 * eggPerDay : eggPerDay;
    }

    public double getEggPrice(){
        return eggPrice;
    }

    public Medicine getMedicine(){
        return medicine;
    }

    // Method to return total of daily sell
    // For "Ayam" instance, it can be written as following:
    // the total of egg per day (of all chickens) * the price of per egg
    public double dailySell(){
        // Code here
        return 0.0;
    }

    // Method to return total of profit for "Ayam" instance
    // It can be written as following:
    // the total of daily sell - the total of expense
    public double dailyProfit(){
        // Code here
        return 0.0;
    }

    // Method to return if "Ayam" instance in drug effect (booster)
    // PS: If medicine is null, return false. If it exist, return the status from medicine instances
    public boolean isBoosted(){
        // Code here
        return false;
    }

    // Method to return string if it boosted
    // In this case, if this instance is boosted return "Booster"
    // If not, return "Normal"
    public String getStatus(){
        // Code here
        return "";
    }

    // Method to apply drug to this instance
    public void treatment(Medicine medicine){
        setMedicine(medicine);
    }

    // Method to apply reduce duration
    public void reduceDrugDuration(){
        if (isBoosted()) {
            this.medicine.reduceDuration();
        }
    }

    // To String return a formatted string of ayam consisted of
    // Its name, quantitiy, and expese per day (you can get this with "super")
    // Ex:
    //  Nama        : Ayam
    //  Jumlah      : 500 ekor
    //  Pengeluaran : Rp. 500,000 (per hari)
    //  Telur/hari  : 3 butir (per ekor)
    //  Harga telur : Rp. 3,000 (per butir)
    //  Penjualan   : Rp. 4,500,000 (per hari)
    //  Profit      : Rp. 4,000,000 (per hari)
    //  Status      : Boosted / Normal
    //  (Status depends whether the instance got medicine or not)
    @Override public String toString(){
        System.out.println(super.toString());
        return String.format(
        " Telur/hari  : "+getEggPerDay()+
        " butir (per ekor)\nHarga telur : Rp. "+getEggPrice()+
        " (per butir)\nPenjualan   : Rp. "+dailySell()+
        " (per hari)\nProfit      : Rp. "+dailyProfit()+
        " (per haari)\nStatus      : "+getStatus());
    }
}
