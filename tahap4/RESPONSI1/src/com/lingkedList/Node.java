package com.lingkedList;

public class Node {
    public int data;
    public Node next;
    public Node pref;

    public Node(int data){
        this.data = data;
    }
    public int gedInfo() {
        return data;
    }
}
