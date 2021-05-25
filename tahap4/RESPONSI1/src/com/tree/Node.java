package com.tree;
public class Node {
    private int value;
    public Node leftchild;
    public Node rightchild;
    //memasukan nilai
    Node(int value){
        this.value = value;
    }
    //menjalankan nilai atau menampilkan
    public int getvalue() {
        return value;
    }
}
