package com.peckage1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class if_else {
    static BufferedReader masuk =  new BufferedReader(new InputStreamReader(System.in));
    public int bilangan;
    public void inputDta() {
        String nilai = null;
        try {
            System.out.print("Masukan nilai anda : ");
            nilai = masuk.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        int n = Integer.valueOf(nilai).intValue();
        this.bilangan = n;
    }
    public void proses() {
        if (this.bilangan %2 == 0) {
            System.out.println("Ini merupakan bilangan Genab");
        } else {
            System.out.println("Ini merupakan bilangan Ganjil");
        }
    }
    public static void main(String[] args) {
        if_else obj = new if_else();
        obj.inputDta();
        obj.proses();
    }
}
