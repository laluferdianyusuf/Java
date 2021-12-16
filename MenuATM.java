package bljr.java;
import java.util.*;

public class MenuATM{
  int pilih, tambah, kurang, hasil, simpan;
  String keluar;
  int saldo = 100000;

  void dec(int plh, int tmbh, int krg, int hsl, int smpn, String klr){
    pilih = plh;
    tambah = tmbh;
    kurang = krg;
    hasil = hsl;
    simpan = smpn;
    keluar = klr;
  }
  void coba(){
    Scanner input = new Scanner (System.in);
    while (true) {
      System.out.println("-----= MENU ATM =-----");
      System.out.println("-1. LIHAT SALDO     =-");
      System.out.println("-2. MENABUNG        =-");
      System.out.println("-3. MENGAMBIL       =-");
      System.out.println("-4. KELUAR          =-");
      System.out.println("---------=  =---------");
      System.out.print("Masukkan Pilihan Anda : ");
      pilih = Integer.parseInt(input.next());
      System.out.println("=------------------------=");

      switch(pilih){
        case 1 :
        System.out.println("Saldo anda adalah : Rp. "+saldo);
        break;
        
        case 2 :
        System.out.print("Masukan Jumlah Uang Yang Ingin Anda Tabung = Rp. ");
        tambah = input.nextInt();
        saldo += tambah;
        System.out.println("Saldo anda adalah Rp." + saldo);
        break;
        
        case 3 :
        System.out.print("Masukan Jumlah Uang Yang Ingin Anda Ambil = Rp. ");
        kurang = input.nextInt(); 
        System.out.println("Saldo anda adalah Rp.");
        System.out.println(saldo-kurang);
        simpan = saldo - kurang;
        if (simpan < 50000) {
          System.out.println("Saldo anda adalah Rp." + saldo + " batas minimal saldo Rp.50000");
          } else {
            System.out.println("Saldo anda adalah Rp." + simpan);
            }
            break;

        case 4 :
        System.out.println("Terima kasih telah menggunakan ATM kami :) \n");
        System.exit(0);
        break;
        
        default:
        System.out.println("Anda Harus memilih menu (1,2,3,4)");
        break;
          }
    }
  }

 public static void main(String[]args){
   MenuATM guna = new MenuATM();
   guna.coba();
 }
} 