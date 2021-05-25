package com.soalkedua;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class soal2 {
    static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    public String user, pass;
    public void inputan() {
        String username = null,pasword = null;
        try {
            System.out.println("Jalankan pogram masukan user dan pasword");
            System.out.print("-> Username : ");
            username = masuk.readLine();
            System.out.print("-> pasword  : ");
            pasword = masuk.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.user = username;
        this.pass = pasword;
    }
    public void proses() {
        if (this.user.equals("HIMATIF")&& this.pass.equals("CHROME_6")) {
            System.out.println("====================Conekcted pogram sukses==============");
            huruf_H objH = new huruf_H();
            huruf_I objI = new huruf_I();
            huruf_M objM = new huruf_M();
            huruf_A objA = new huruf_A();
            huruf_T objT = new huruf_T();
            huruf_F objF = new huruf_F();
            objH.proses_H();
            System.out.println();
            objI.proses();
            System.out.println();
            objM.proses();
            System.out.println();
            objA.proses();
            System.out.println();
            objT.proses();
            System.out.println();
            objI.proses();
            System.out.println();
            objF.proses();
            System.out.println("======================Pogram sukses========================");
        } else {
            System.out.println("Maaf periksa kembali username dan pasword");
        }
    }
    public static void main(String[] args) {
        soal2 obj = new soal2();
        obj.inputan();
        obj.proses();
    }
}
