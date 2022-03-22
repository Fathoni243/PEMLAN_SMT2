package com.SourceCode.SwalayanNabil;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class BarangProvider {
    private Barang items[];
    private String kata;
    static int banyak, nomor;
    static double totalUang;
    static Scanner sc = new Scanner(System.in);
    static User us = new User();
    static UserProvider up = new UserProvider();
    
    public BarangProvider(){
          this.items = new Barang[]{
              new Barang("Teh Pucuk Harum", "Teh pucuk harum yang diambil dari pucuknya", 4000, 10),
              new Barang("Sari Roti","Sari roti merupakan dagangan roti", 5000, 9),
              new Barang("Sosis Kanzler", "Sosis kanzler merupakan sosis favorit dari Jerman", 9000, 11),
              new Barang("Cimory Yogurt", "Yogurt terbuat dari susu sapi segar", 10000, 6),
              new Barang("Juara Filter", "Rokok filter rasa teh manis", 14000, 5),
              new Barang("Pocky", "Makanan dari Jepang", 8000, 10)
          };
      }
    public Barang[] getItem(){
        return this.items;
    }
    public void setKata(String k){
        this.kata = k;
    } 
    public String getKata(){
        return kata;
    }
    public void mencariBarang(String k){
        setKata(k);
        Barang cariBarang = new Barang();
        for (Barang item : items) {
            cariBarang = item;
            if(getKata().equalsIgnoreCase(item.getNama())==true){
                System.out.println("Nama Barang : "+item.getNama());
                System.out.println("Deskripsi   : "+item.getDeskripsi());
                System.out.println("Harga Satuan : "+item.getPrice());
                System.out.println("Stok Tersedia : "+item.getJumlah());
                System.out.println(" ");
            }
       }
   }
    public int berbelanja(){
        int no = 1;
        display();
        System.out.print("Mau beli apa ?  ");
        nomor  = sc.nextInt();
        System.out.print("Berapa banyak : ");
        banyak = sc.nextInt();
        String total = nomor+" ";
        String[] inputArra = total.split(" ");
        setKurangBarang(inputArra);
        ngeluarinDuit(nomor, banyak);
        return 0;
    }
    public void setKurangBarang(String[]indexArray){
        for(int i = 0; i<indexArray.length;i++){
            items[Integer.parseInt(indexArray[i])-1].penguranganbarang();
        }
    }
    public  void display(){
        for(int i = 0; i<items.length;i++){
             System.out.printf("%-4s | %-16s | %-8.0f | %-6d |\n",(i+1) , items[i].getNama(), items[i].getPrice(),items[i].getJumlah());
        }
    }
    public void ngeluarinDuit(int n, int b){
        us.setBalance(UserProvider.saldo);
        double harga = items[n-1].getPrice();
        double diskon, cashback;
        us.setMember(up.memberId);
        if(up.memberId.substring(0, 2).equals("38")){
            us.setMember("silver");
        }else if(up.memberId.substring(0, 2).equals("56")){
            us.setMember("gold");
        }else if(up.memberId.substring(0, 2).equals("74")){
            us.setMember("platinum");
        }
        totalUang = harga*b;
      if(totalUang > 30000){  
        if(us.getMember().equals("silver")){
            System.out.println("Anda memiliki member silver dan mendapatkan diskon 5% karna belanja diatas 30.000");
            diskon = totalUang*5/100;
            totalUang = totalUang + diskon;
            System.out.println("Total Belanja : "+totalUang);
            System.out.println("Sisa Saldo : "+up.saldoAkhir());
        }else if(us.getMember().equals("gold")){
            System.out.println("Anda memiliki member gold dan mendapatkan diskon 7% karna belanja diatas 30.000");
            diskon = totalUang*7/100;
            cashback = totalUang*2/100;
            totalUang = totalUang + diskon + cashback;
            System.out.println("Total Belanja : "+totalUang);
            System.out.println("Sisa Saldo : "+up.saldoAkhir());
        }else if(us.getMember().equals("platinum")){
            System.out.println("Anda memiliki member gold dan mendapatkan diskon 10% karna belanja diatas 30.000");
            diskon = totalUang*10/100;
            cashback = totalUang*5/100;
            totalUang = totalUang + diskon+cashback;
            System.out.println("Total Belanja : "+totalUang);
            System.out.println("Sisa Saldo : "+up.saldoAkhir());
        }
      }else{
        System.out.println("Total Belanja : "+totalUang);
        System.out.println("Sisa Saldo : "+up.saldoAkhir());
    }
    }
}
