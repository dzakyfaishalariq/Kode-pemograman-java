package com.tesvidio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class rataan {
    static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    static LinkedList<Integer> lis = new LinkedList<Integer>();
    public void InputanAtribut() {
        String bill = null;
        try {
            System.out.print("Masukan data 10 bilangan di sini !!");
            System.out.println();
            for (int i = 0; i < 10; i++) {
                System.out.print("-> nilai ke-" + (i+1) + " : ");
                bill = masuk.readLine();
                int bil = Integer.valueOf(bill).intValue();
                lis.add(bil);
            }
        } catch (Exception e) {
            System.out.println("Maaf kode anda ada yang salah");
            e.printStackTrace();
        }
    }
    public void perosesRataan() {
        System.out.println("Tampilan data anda : ");
        for (int i = 0; i < lis.size(); i++) {
            System.out.print(lis.get(i) + " ");
        }
        System.out.println();
        int bantu = 0;
        for (int i = 0; i < lis.size(); i++) {
            bantu += lis.get(i);
        }
        int rata = bantu/10;
        System.out.println("Nilai rataan nya iya lah : " + rata);
    }
    public static void main(String[] args) {
        rataan obj = new rataan();
        obj.InputanAtribut();
        obj.perosesRataan();
    }
}
