package com.SourceCode.SwalayanNabil;

import java.util.Scanner;

/**
 *
 * @author LENOVO Nabil Ghifari
 */
public class ProjectPratikum {
        static User pembeli = new User();
        static BarangProvider Barang = new BarangProvider();
        static Barang daftarBelanjaan = new Barang();
        static UserProvider user = new UserProvider();
        static Scanner sc = new Scanner(System.in);
        static String ID,pin,kata;
        static int beliBarang;
        static double topUp;
        private static int pilih;
    
    public static void main(String[] args) {
        System.out.println("SELAMAT DATANG DI VIRTUAL MARKET");
        System.out.println("Silahkan Login Terlebih Dahulu");
        int akses = 0;
        int aksesPin = 0;
        do{ 
            System.out.print("Member ID : ");
            ID = sc.nextLine();
            user.login(ID);
            pembeli.setMembership(ID);
            if(user.getBoolean()==false){
            }else{
                System.out.println("Member ID tidak Terdaftar");
            }
             akses++;
        }while(akses!=3&&user.getBoolean()==true);      
    }
     public static void menu(){
        System.out.println("Login Berhasil");
        do{
        System.out.println("Pilihlah Menu yang akan anda Pilih");
        System.out.println("1. Melihat Semua Barang");
        System.out.println("2. Mencari Barang");
        System.out.println("3. Lihat Profil");
        System.out.println("4. Top Up");
        System.out.println("5. Membeli Item");
        System.out.println("6. Keluar");
        System.out.print("Masukkan Nomor(1,2,3,4,5,6) : ");
        int pilihan = sc.nextInt();
            setPilih(pilihan);
            System.out.println(" ");
        switch(getPilih()){
            case 1:
                System.out.println("*****************************");
                System.out.println("    Barang Tersedia VMARKET  ");
                System.out.println("*****************************");
                Barang.display();
                break;
            case 2:
                System.out.println("*********************");
                System.out.println("Mencari Sebuah Barang");
                System.out.println("*********************");
                System.out.print("Masukkan Kata Kunci : ");
                sc.nextLine();
                String kataKunci = sc.nextLine();
                Barang.setKata(kataKunci);
                Barang.mencariBarang(Barang.getKata());
                break;
                
            case 3:
                System.out.println("**********************");
                System.out.println("    PROFIL MEMBER     ");
                System.out.println("**********************");
                user.lihatProfil();
                System.out.println(" ");
                break;
            case 4:
                System.out.println("*************************");
                System.out.println("          TOP UP         ");
                System.out.println("*************************");
                System.out.print("Masukkan Saldo TOP UP : ");
                topUp = sc.nextDouble();
                pembeli.setBalance(user.saldo);
                pembeli.topUp(topUp);
                System.out.println("====TOP UP berhasil====");
                System.out.println("Saldo Saat Ini : "+pembeli.getBalance());
                System.out.println(" ");
                break;
                
            case 5:
                if(user.saldoAkhir()<10000){
                    System.out.println("Saldo Anda tidak cukup silahkan TOP UP");
                }else{
                System.out.println("*******************************");
                System.out.println("        Barang Tersedia");
                System.out.println("*******************************");
                Barang.berbelanja();
        }
                break;
            case 6:
            default :
        }
        }while(pilih!=6);System.err.println("Terima Kasih"); System.exit(pilih);
     }
     public static void setPilih(int p){
         pilih = p;
     }
     public static int getPilih(){
         return pilih;
     }
}
