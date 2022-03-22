/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SourceCode.SwalayanNabil;

/**
 *
 * @author LENOVO
 */
public class Barang {
    private String name, description;
    private double price;
    private int qty;
    static BarangProvider bp = new BarangProvider();
    Barang(String n, String d, double p, int q){
        this.name = n; this.description = d; this.price = p;
        this.qty = q;
        
    }
    Barang(){}
    public void setNama(String n){
        this.name = n;
    }
    public void setDescription(String d){
        this.description = d;
    }
    public void setPrice (double p){
        this.price = p;
    }
    public void setJumlah(int q){
        this.qty = q;
    }
    public String getNama(){
        return name;
    }
    public String getDeskripsi(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public int getJumlah(){
        return qty;
    }
    public int penguranganbarang(){
         return qty-=BarangProvider.banyak;
    }
}

