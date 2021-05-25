package com.exersais2;
/**
Tulis algoritma mekanisme antrian menggunakan
-Satu daftar tertaut
– Array alternatif 1
- Alternatif array 2
- Alternatif array 3
Gunakan infotype yang sama seperti sebelumnya
Setiap anggota harus menulis 1 mekanisme
 */
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;
public class QueueHomsteg {
    public void Queuelinglis() {
        LinkedList<Integer> lis = new LinkedList<Integer>(); 
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        System.out.print("Masukan batas data anda:");
        int banyak = input.nextInt();
        // input data
        System.out.println("Silahkan masukan data anda!");
        for (int i = 0; i < banyak; i++) {
            System.out.print("->Data ke-" + (i+1) + " : ");
            int data = input.nextInt();
            lis.add(data);
        }
        //tampilan
        System.out.println("Tampilan data");
        for (int i = 0; i < banyak; i++) {
            System.out.print(lis.get(i) + " ");
        }
        System.out.println();
        //algoritma tambah hapus
        int ulh = 'y';
        while(ulh == 'y'){
        System.out.println("============================");
        System.out.println("Menu : ");
        System.out.println("[1] tambah");
        System.out.println("[2] hapus");
        System.out.print("Silahkan pilih yang mana ? : ");
        int pilih = input2.nextInt();
        switch (pilih) {
            case 1:
                System.out.print("Nilai yang ditambahkan : ");
                int nilai = input3.nextInt(); 
                lis.addFirst(nilai);
                System.out.println("Tampilannya : ");
                //tampilan
                for (int i = 0; i < lis.size(); i++) {
                    System.out.print(lis.get(i)+" ");
                }
                System.out.println();
                break;
            case 2:
                lis.removeFirst();
                System.out.println("Tampilannya");
                for (int i = 0; i < lis.size(); i++) {
                    System.out.print(lis.get(i) + " ");
                }
                System.out.println();
                break;
            default:
                System.out.println("Maaf anda tidak memilih menu");
                break;
        }
        System.out.print("Apakah anda mau mengulang di QueueLinglis : ");
        ulh = input3.next().charAt(0);
        }
    }
    public void QueueArrayALT1() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner masuk = new Scanner(System.in);
        Scanner masuk2 = new Scanner(System.in);
        Scanner masuk3 = new Scanner(System.in);
        Scanner masuk4 = new Scanner(System.in);
        int nilai[] = new int[5];
        System.out.print("Masukan batas <= 5 : ");
        int batas = masuk3.nextInt();
        for (int i = 0; i < batas; i++) {
            System.out.print("Masukan data ke-" + (i+1) + " : ");
            nilai[i] = masuk.nextInt();
        }
        System.out.println("Tampilannya : ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == 0) {
                break;
            }
            array.add(nilai[i]);
        }
        System.out.println();
        char ulh = 'y';
        while(ulh == 'y'){
        System.out.println("=========================");
        System.out.println("Menu : ");
        System.out.println("[1] tambah");
        System.out.println("[2] hapus");
        System.out.print("Silahkan pilih yang mana ? : ");
        int pilih = masuk2.nextInt();
        switch (pilih) {
            case 1:
                if (array.size()>=5) {
                    System.out.print("Maaf Antrian sudah penuh");
                } else {
                    System.out.print("Masukan nilai tambahannya : ");
                    int nTambah = masuk4.nextInt();
                    array.add(0, nTambah);
                }
                System.out.println("Tampilannya : ");
                for (int i = 0; i < array.size(); i++) {
                    System.out.print(array.get(i)+ " ");
                }
                System.out.println();
                break;
            case 2:
                array.remove(0);
                System.out.println("Tampilan : ");
                for (int i = 0; i < array.size(); i++) {
                    System.out.print(array.get(i)+" ");
                }
                System.out.println();
                break;
            default:
                System.out.println("Maaf Anda tidak memilih");
                break;
        }
        System.out.print("Apakah anda ingin mengulang QueueArrayALT1[y/t] : ");
        ulh = masuk4.next().charAt(0);
        }
    }
    public void QueueArrayALT2() {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        ArrayList<Integer> liss = new ArrayList<Integer>();
        int bil[] = new int[7];
        //lakukan penginputan
        System.out.print("Masukan batas antrian <= 7 : ");
        int batas = input.nextInt();
        for (int i = 0; i < batas; i++) {
            System.out.print("Masukan data ke-" + (i+1) + " : ");
            bil[i] = input2.nextInt();
        }
        System.out.println();
        for (int i = 0; i < bil.length; i++) {
            if (bil[i] == 0) {
                break;
            }else{
                liss.add(bil[i]);
            }
        }
        System.out.println("Tampilannya : ");
        for (int i = 0; i < bil.length; i++) {
            System.out.print(bil[i] + " ");
        }
        System.out.println();
        char ulh = 'y';
        while (ulh == 'y'){
        System.out.println("============================");
        System.out.println("Menu : ");
        System.out.println("[1] tambah");
        System.out.println("[2] hapus");
        System.out.print("Silahkan pilih yang mana ? : ");
        int pilih = input3.nextInt();
        switch (pilih) {
            case 1:
                if (liss.size() <= 7) {
                    System.out.print("Masukan nilai tambahan nya : ");
                    int nilai = input4.nextInt(); 
                    liss.add(0, nilai);
                    System.out.println("Tampilan : ");
                    for (int i = 0; i < liss.size(); i++) {
                        System.out.print(liss.get(i)+" ");
                    }
                }else{
                    System.out.println("Maaf nilai antrian sudah penuh");
                }
                System.out.println();
                break;
            case 2:
                liss.remove(0);
                for (int i = 0; i < liss.size(); i++) {
                    System.out.print(liss.get(i)+" ");
                }
                System.out.println();
                break;
            default:
                System.out.println("Maaf anda tidak memilih");
                break;
        }
        System.out.print("apakah anda ingin mengulang di QueueArrayATK2 : ");
        ulh = input4.next().charAt(0);
        }
    }
    public void QueueArrayALT3() {
        ArrayList<Integer> liss = new ArrayList<Integer>();
        int bil[] = new int[7];
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        //Input batas array dan nilainya
        System.out.print("Masukan batasan nilai array nya <= 7 : ");
        int batas = input.nextInt();
        for (int i = 0; i < batas; i++) {
            System.out.print("Masukan nilai ke- " + (i+1) + " : ");
            bil[i] = input2.nextInt();
            liss.add(bil[i]);
        }
        System.out.println();
        System.out.println("Tampilkan : ");
        for (int i = 0; i < bil.length; i++) {
            System.out.print(bil[i] + " ");
        }
        System.out.println();
        int ulh = 'y';
        while(ulh == 'y'){
        System.out.println("============================");
        System.out.println("Menu : ");
        System.out.println("[1] tambah");
        System.out.println("[2] hapus");
        System.out.print("Silahkan pilih yang mana ? : ");
        int pilih = input3.nextInt();
        switch (pilih) {
            case 1:
                if (liss.size() <= 7) {
                    System.out.println("Antrian sudah penuh");
                } else {
                    System.out.println("Masukan angka yang ingin di tambahkan : ");
                    int nilai = input4.nextInt();
                    liss.add(0, nilai);
                    System.out.println("Tampilkan : ");
                    for (int i = 0; i < bil.length; i++) {
                        System.out.print(liss.get(i)+" ");
                    }
                    System.out.println();
                }    
                break;
            case 2:
                liss.remove(0);
                liss.add(0, liss.get(liss.size()));
                System.out.println("Tampilkan : ");
                for (int i = 0; i < bil.length; i++) {
                    System.out.print(liss.get(i)+" ");
                }
                System.out.println();
                break;
            default:
                System.out.println("Maaf anda tidak memilih apapun");
                break;
        }
        System.out.print("Apakah anda ingin mengulang di QueueArrayATK3 [y/t] : ");
        ulh = input4.next().charAt(0);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QueueHomsteg obj = new QueueHomsteg();
        System.out.println("Silahkan pili : ");
        System.out.println("Menu : ");
        System.out.println("[1] QueueLinglis");
        System.out.println("[2] QueueArrayATK1");
        System.out.println("[3] QueueArrayATK2");
        System.out.println("[4] QueueArrayATK3");
        System.out.print("Pilih : ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                obj.Queuelinglis();
                break;
            case 2:
                obj.QueueArrayALT1();
                break;
            case 3:
                obj.QueueArrayALT2();
                break;
            case 4:
                obj.QueueArrayALT3();
                break;
            default:
                System.out.println("Anda tidak memilih nilai");
                break;
        }
    }
}
