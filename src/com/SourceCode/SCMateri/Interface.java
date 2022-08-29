package com.SourceCode.SCMateri;

interface Interface1{
    public String cetakStr1(String x);
    public String cetakStr2(String y);

    //static method bisa memiliki body
    static void start() {
        System.out.println("Static Method : Mulai Mencetak");
    }
}

interface Interface2{
    public String cetakInt1(int x);
    public String cetakInt2(int y);
}

interface Interface3 extends Interface1, Interface2 {
    //default method bisa memiliki body
    default void akhir(){
        System.out.println("Default Method : Semua Sudah Tercetak");
    }
}

class CetakSemua implements Interface3{

    @Override
    public String cetakStr1(String x) {
        return "Cetak String 1 : "+x;
    }
    
    @Override
    public String cetakStr2(String y) {
        return "Cetak String 2 : "+y;
    }

    @Override
    public String cetakInt1(int x) {
        return "Cetak Int 1 : "+x;
    }
    
    @Override
    public String cetakInt2(int y) {
        return "Cetak Int 2 : "+y;
    }

}

public class Interface {

    public static void main(String[] args) {
        CetakSemua cetakSemua = new CetakSemua();

        // Interface1 interface1 = new Interface1();

        Interface1.start();
        System.out.println(cetakSemua.cetakStr1("Toni"));
        System.out.println(cetakSemua.cetakStr2("Tino"));
        System.out.println(cetakSemua.cetakInt1(1));
        System.out.println(cetakSemua.cetakInt2(2));
        cetakSemua.akhir();
    }
}
