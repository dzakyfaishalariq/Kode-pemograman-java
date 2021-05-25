package com.exersais2;
/**
  Buat algoritme untuk Alternatif ke-3
- createEmptyQueue -> buat antrian kosong
- isEmpty -> periksa apakah antriannya 'kosong'
- isFull -> periksa apakah antriannya 'penuh'
–Tambahkan -> tambahkan 1 elemen ke antrian
- Del -> hapus 1 elemen dari antrian
Ingat, di C / Cpp (dan sebagian besar pemrograman
bahasa) array mulai dari 0
 */
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;
public class Queue {
  static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
  static LinkedList<Integer> lis = new LinkedList<Integer>();
  public int bts;
  public void inputNila() {
    String batas = null;
    try {
      System.out.print("Masukan batas array : ");
      batas = masuk.readLine();
    } catch (Exception e) {
      e.printStackTrace();
    }
    int b = Integer.valueOf(batas).intValue();
    this.bts = b;
  }
  public void pengoprasian() {
    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    Scanner scan3 = new Scanner(System.in);
    Scanner scan4 = new Scanner(System.in);
    Scanner scan5 = new Scanner(System.in);
    int bil[] = new int[this.bts];
    for (int i = 0; i < bil.length; i++) {
      System.out.print("-> masukan nilai ke-" + (i+1) + " = ");
      bil[i] = scan.nextInt();
      lis.add(bil[i]);
    }
    if (lis.size() <= this.bts) {
      System.out.println("Maaf nilai penuh dengan data sebanyak " + lis.size());
    } else {
      System.out.println("Maaf nilai masi kosong silahkan input data");
      System.exit(0);
    }
    // sirculer Queue
    System.out.println("Tampilan lis : ");
    for (int i = 0; i < lis.size(); i++) {
      System.out.print(lis.get(i) + " ");
    }
    System.out.println();
    System.out.println();
    char pl = 'y';
    while(pl == 'y'){
    System.out.println("===========================");
    char pil;
    System.out.print("Apakah anda ingin menghapus data : ");
    pil = scan2.next().charAt(0);
    if (pil == 'y') {
      lis.removeFirst();
      lis.addFirst(lis.getLast());
      lis.removeLast();
      char ulh = 'y';
      while(ulh == 'y' && lis.size() <= this.bts){
      System.out.print("Apakah anda ingin menambahkan nilai : ");
      char pil2 = scan3.next().charAt(0);
      if (pil2 == 'y') {
        System.out.print("Masukan nilai yang di tambah : ");
        int bill = scan4.nextInt();
        lis.addFirst(bill);
      }
      System.out.print("Apa mau mengulang nambah : ");
      ulh = scan5.next().charAt(0);
      }
    } else {
      System.out.println("Anda tidak menghapus data ");
    }
    System.out.println("Tampilan");
    for (int i = 0; i < lis.size(); i++) {
      System.out.print(lis.get(i)+" ");
    }
    System.out.println();
    System.out.print("Apakah mau mengulang oprasian : ");
    pl = scan5.next().charAt(0);
  }
    System.out.println();
  }
  public static void main(String[] args) {
      Queue obj = new Queue();
      obj.inputNila();
      obj.pengoprasian();
  }
}
