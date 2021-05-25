package com.Exersais1;

class Node{
    char kar;
    Node next;
    public Node(char kar){
        this.kar = kar;
    }
}
public class stackInfix {
    Node top;
    boolean inikosong(){
        return top == null;
    }
    void push(char kar){
        Node node = new Node(kar);
        if (inikosong()) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
    }
    void pop(){
        top = top.next;
    }
    char peek(){
        return top.kar;
    }
}
