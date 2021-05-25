package com.Exersais1;
/***
Buat algoritme untuk mendorong nilai menjadi diurutkan
susun agar tumpukan tetap tersortir
- Hanya gunakan push and pop(tambah dan hapus)
- Anda dapat menggunakan banyak tumpukan untuk melakukannya
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.LinkedList;
public class stack {
    static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    public int batas;
    public void inputDatabatasStek() {
        String bts = null;
        try {
            System.out.print("Masukan batas steck : ");
            bts = masuk.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int b = Integer.valueOf(bts).intValue();
        this.batas = b;
    }
    public void pushDanpop_steck() {
        LinkedList<Integer> data = new LinkedList<Integer>();
        int push,index;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String bilangan[] = new String[this.batas];
        int bil[] = new int[this.batas];
        for (int i = 0; i < this.batas; i++) {
            try {
                System.out.print("Nilai stack : ");
                bilangan[i] = masuk.readLine();                
            } catch (Exception e) {
                e.printStackTrace();
            }
            bil[i] = Integer.valueOf(bilangan[i]).intValue();
        }
        //persortian
        for (int i = 0; i < bil.length-1; i++) {
            for (int j = i+1; j < bil.length; j++) {
                if (bil[i]>bil[j]) {
                    int bantu = bil[i];
                    bil[i] = bil[j];
                    bil[j] = bantu;
                }
            }
        }
        System.out.println("Menampilkan nilainya : ");
        for (int i = 0; i < bil.length; i++) {
            System.out.print(bil[i]+" ");
        }
        System.out.println();
        System.out.print("Apakah anda ingin menghapus salah satu nilai stac yang di buat[y/t]: ");
        char pilih = input.next().charAt(0);
        if (pilih == 'y') {
            System.out.println("Silahkan hapus data ");
            for (int i = 0; i < bil.length; i++) {
                data.add(bil[i]);
            }
            for (int i = 0; i < data.size(); i++) {
                System.out.print(data.get(i) + " ");
            }
            System.out.println();
            //fungsi pop
            char ulang = 'y';
            while (ulang == 'y') {
            data.removeLast();
            //fungsi push
            System.out.print("tambah index [y/t] : ");
            char plh = input.next().charAt(0);
            if (plh == 'y') {
                System.out.print("masukan nilai bilangan yang ditambah : ");
                int nil = input2.nextInt();
                data.addLast(nil);
            } 
            System.out.print("Apakah ingin menghapus dan mengulang lagi stacknya[y/t] : ");
            ulang = input.next().charAt(0);
            }
        } else {
            System.out.println("Anda tidak mengubah dan menghapus data di stack");
        }
        System.out.println();
        for (int i = 0; i < data.size(); i++) {
            System.out.print(data.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stack obj = new stack();
        obj.inputDatabatasStek();
        obj.pushDanpop_steck();
    }
}
