package com.SourceCode.UTP;

public class Helper {
    // Helper to initialize
    static void initialize(){
        // Initilaize admin
        Main.admins[0] = new Admin("Joko", "ini_password_joko");
        Main.admins[1] = new Admin("Dengklek", "ini_password_dengklek");
        
        // Initialize Layanan
        Main.layanans[0] = new Layanan("Ganti Oli", 500000, "Layanan ganti oli adalah layanan standar untuk mengganti oli \n"+
        "pada mesin. Layanan ini tidak membutuhkan waktu yang lama.");
        Main.layanans[1] = new Layanan("Operasi Mobil", 2000000, "“Mobil Anda mengalami mogok mendadak? Tidak bisa \n"+
        "dinyalakan? Tenang, kami memiliki tenaga ahli untuk mengoperasi mobil Anda.");
        Main.layanans[2] = new Layanan("Ketok Magic", 3000000, "Ketok Magic adalah layanan sulap untuk menghilangkan penyok\n"+
        "pada body mobil.");
        Main.layanans[3] = new Layanan("Modifikasi Mobil Racing", 5000000, "Bagi kalian jiwa muda yang ingin balapan, kami bisa modifikasi\n"+
        "mobil kalian dengan tambahan NOS, serta body standar untuk balapan");
        Main.layanans[4] = new Layanan("Modifikasi Mobil Elektrik", 5500000, "Modifikasi ini adalah modifikasi baru pada layanan bengkel kami,\n"+
        "dimana Anda dapat mengubah mesin yang bertenagakan fosil menjadi bertenaga listrik");
        // Masukkan daftar-daftar layanan bersesuaian dengan dokumen
    }

    // Helper function to authentication
    // Fungsi yang digunakan untuk "melakukan loop" pada iterasi admins
    static boolean authentication(String username, String password) {
        // Rubah Kode di sini
        for (int i = 0; i < Main.admins.length; i++) {
            if (Main.admins[i].getName().equals(username)) {
                if (Main.admins[i].getPassword().equals(password)) {
                    return true;
                }
            }
        }
        
        return false;
    }

    // Helper to format price to rupiah
    static String getFormattedPrice(int price){
        return String.format("Rp. %,d", price);
    }
}
