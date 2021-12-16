package bljr.java;
import java.util.*;

public class Main {
    int nilai,jumlah;

    void hasil(int nl, int jmlh){
        nilai = nl;
        jumlah = jmlh;
    }
    void jadi(){
        Scanner hasil = new Scanner(System.in);
        System.out.println("Nilai yang ingin di jumlahkan :");
        System.out.println("+----+");
        nilai = hasil.nextInt();
        System.out.println("+----+");

        jumlah = nilai * 2 * 8;

        System.out.println("Jadi hasil perhitungannya adalah :" + jumlah);
    }

    public static void main(String[] args) {
        Main akhir = new Main();
        akhir.jadi();
        System.out.println("\n+--------------------+");
        System.out.println("Sekian dan Terimakasih");
        System.out.println("+--------------------+");
    
    }
}