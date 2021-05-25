package com.graphs2;

public class mulai {
    public static void main(String[] args) {
        grabphs iniGrabps = new grabphs();
        iniGrabps.addVertex('A');
        iniGrabps.addVertex('B');
        iniGrabps.addVertex('C');
        iniGrabps.addVertex('D');
        iniGrabps.addVertex('E');
        iniGrabps.addEdge(0, 3);
        System.out.println();
        System.out.println("===============");
        iniGrabps.display();
        iniGrabps.connect();
    }
}
