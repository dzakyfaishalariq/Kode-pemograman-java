package com.peckage1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class else_if {
    public int bilangan1,bilangan2,bilangan3;
    static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    public void inputdata() {
        String nilai1 = null,nilai2 = null,nilai3 = null;
        try {
            System.out.print("Masukan nilai pertama anda : ");
            nilai1 = masuk.readLine();            
            System.out.print("Masukan nilai kedua anda   : ");
            nilai2 = masuk.readLine();
            System.out.print("Masukan nilai ketiga anda  : ");
            nilai3 = masuk.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            //TODO: handle exception
        }
        int n1 = Integer.valueOf(nilai1).intValue(),
            n2 = Integer.valueOf(nilai2).intValue(),
            n3 = Integer.valueOf(nilai3).intValue();
        this.bilangan1=n1;
        this.bilangan2=n2;
        this.bilangan3=n3;
    }
    public void proses() {
        int rata_rata = (this.bilangan1 + this.bilangan2 + this.bilangan3)/3;
        if (rata_rata >= 90) {
            System.out.println("Nilai anda mendapatkan nilai A");
            System.out.println("Besar nilai : " + rata_rata);
        } else if (rata_rata >= 80) {
            System.out.println("Nilai anda mendapatkan nilai B");
            System.out.println("Besar nilai : " + rata_rata);
        }else if (rata_rata >= 60) {
            System.out.println("Nilai anda mendapatkan nilai C");
            System.out.println("Besar nilai : " + rata_rata);
        }else if (rata_rata >= 50) {
            System.out.println("Nilai anda mendapatkan nilai D");
            System.out.println("Besar nilai : " + rata_rata);
        }else{
            System.out.println("Anda mendapatkan nilai E ");
            System.out.println("!!!!!Anda harus mengulang mataluliah!!!!!");
        }
    }
    public static void main(String[] args) {
        else_if obj = new else_if();
        obj.inputdata();
        obj.proses();
        System.out.println("===================POGRAM SUKSES====================");
    }
}
