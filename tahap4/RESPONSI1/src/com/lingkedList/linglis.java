package com.lingkedList;

public class linglis {
    Node pertama = null;
    public void addData(int nilai) {
        Node node = new Node(nilai);
        node.next = pertama;
        node.pref = null;
        if (pertama != null) {
            pertama.pref = node;
        }
        pertama = node;
    }
    public void tampilkan() {
        Node node = pertama;
        Node terakhir = null;
        System.out.println("urutannya : ");
        while (node != null) {
            System.out.print(node.data + " ");
            terakhir = node;
            node = node.next;
        }
    }
    public static void main(String[] args) {
        linglis lis = new linglis();
        lis.addData(1);
        lis.addData(6);
        lis.addData(5);
        lis.addData(7);
        lis.addData(2);
        lis.tampilkan();
    }
}
