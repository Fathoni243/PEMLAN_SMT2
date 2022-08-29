package com.SourceCode.uap_soal_2022_versi2.uap_soal_2022;

public abstract class Hewan implements BuyableInterface {
    private String name;
    private int quantity;
    private double expensePerDay; // Harga pengeluaran untuk satu ekor per harinya
    private double pricePerUnit; // Harga per ekor

    // Zero Constructor
    public Hewan(){

    }

    // Constructor
    public Hewan(String name, int quantity, double expensePerDay, double pricePerUnit){
        setName(name);
        setQuantity(quantity);
        setExpensePerDay(expensePerDay);
        setPricePerUnit(pricePerUnit);
    }


    // Setter Getter
    public void setName(String name){
        this.name = name;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setExpensePerDay(double expensePerDay){
        this.expensePerDay = expensePerDay;
    }

    public void setPricePerUnit(double pricePerUnit){
        this.pricePerUnit = pricePerUnit;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getExpensePerDay(){
        return expensePerDay;
    }

    public double getPricePerUnit(){
        return pricePerUnit;
    }

    // Method to return the total expense for an animal instance
    // It can be written as following:
    // quantity * expensePerDay
    public double getTotalExpense(){
        // Code in here
        return 0.0;
    }

    // Method to add resource to existing
    // Example, if you buy 1 chicken, then you add it to "quantity" attribute
    public void addResource(int quantityAdd){
        // Code here
    }

    // To String return a formatted string of hewan consisted of
    // Its name, quantitiy, and expese per day
    // Ex:
    //  Nama        : Ayam
    //  Jumlah      : 500 ekor
    //  Pengeluaran : Rp. 500,000 (per hari)
    // Take Note: "Pengeluaran" is the value of total expense of the day, you can use getTotalExpense() method for this
    @Override public String toString(){
        // Code here
        return String.format("Nama        : "+getName()+
                "\nJumlah      : "+getQuantity()+
                " ekor\nPengeluaran : Rp. "+getExpensePerDay());
    }


    // Abstract Methods
    public abstract double dailySell();
    public abstract double dailyProfit();
}
