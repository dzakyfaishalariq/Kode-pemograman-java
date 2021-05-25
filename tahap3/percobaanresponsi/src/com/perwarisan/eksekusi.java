package com.perwarisan;

public class eksekusi {
    public static void main(String[] args) {
        induk obj = new induk();
        obj.judul();
        anak3 obj3 = new anak3("ini metod 3");
        System.out.println(anak3.bil);
        anak2 obj2 = new anak2("ini metod 2");
        System.out.println(anak2.bil);
        anak1 obj1 = new anak1("ini metod 1");
        System.out.println(anak1.bil);
        
    }
}
