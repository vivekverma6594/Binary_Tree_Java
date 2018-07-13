package com.company;

public class Main {

    public static void main(String[] args) {

        Node root;
        root = new Node(20);
        root.insert(new Node(15));
        root.insert(new Node(21));
        root.insert(new Node(17));
        root.insert(new Node(14));
        root.insert(new Node(16));
        System.out.print("Printing");
        root.display();
        System.out.print("Deleting");
        root.delete(20);
        System.out.print("Printing");
        root.display();
    }
}

