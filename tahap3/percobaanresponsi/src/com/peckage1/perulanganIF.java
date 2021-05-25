package com.peckage1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class perulanganIF {
    public int nilai, bil[] = {1,2,3,4,5,6,7};
    static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    public void proses() {
        String bilangan = null;
        try {
            System.out.print("Masukan nilai yang anda cari : ");
            bilangan = masuk.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        int n = Integer.valueOf(bilangan).intValue();
        this.nilai = n;
    }
    public void tampilan() {
        for (int i = 0; i < bil.length; i++) {
            if (this.nilai == bil[i]) {
                System.out.println("Nilai ditemukan berada di indeks ke : " + i);
                System.out.println("->Nilai sebesar : " + bil[i]);
            }
        }
        System.out.println("Tampilan data : ");
        for (int i = 0; i < bil.length; i++) {
            System.out.print(bil[i] + " ");
        }
    }
    public static void main(String[] args) {
        perulanganIF obj = new perulanganIF();
        obj.proses();
        obj.tampilan();
    }
}
