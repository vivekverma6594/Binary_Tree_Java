package com.company.LinkedList;

public class LinkedList {

    private Node head;

    public LinkedList(){ }

    public LinkedList(Node node){
        head = node;
    }

    public void insert(int data, int position){
        Node current = head;
        for(int i=1; i< position; i++)
        {
            if (current == null){
                System.out.print("\nPosition not available");
                return;
            }
            current = current.next;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    public void append(int data){
        if(head == null){
            head = new Node(data);
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data){
        if(head == null){
            head = new Node(data);
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete(int data){
        if(head == null){
            return;
        }
        if(head.data == data){
            head = head.next;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null)
        {
            if(currentNode.next.data == data) {
                 currentNode.next = currentNode.next.next;
                 return;
            }
            currentNode = currentNode.next;
        }
    }

    public void display() {
        if (head == null) {
            return;
        }
        Node current = head;
        System.out.print(current.data + "->");
        while (current.next != null){
            System.out.print(current.next.data + "->");
            current = current.next;
        }
    }

    public void printMiddle(){
        if(head == null)return;

        int count = 1;
        Node temp1 = head;
        Node temp2 = head;

        while(temp1.next != null)
        {
            temp1 = temp1.next;
            count++;
        }

        System.out.println("\nMiddle Element");
        if(count%2 == 0)
        {
            for (int j = 1; j< count/2 ;j++)
            {
                temp2 = temp2.next;
            }
            System.out.println(temp2.data);
            System.out.println(temp2.next.data);
        }
        else
        {
            for (int j = 1; j< (count/2)+1 ;j++)
            {
                temp2 = temp2.next;
            }
            System.out.println(temp2.data);
        }
    }

    public void printMiddleOneLoop(){
        Node temp1 = head;
        Node temp2 = head;
        if(head == null)return;

        while (temp1 != null && temp1.next!= null){
            temp1=temp1.next.next;
            temp2 = temp2.next;
        }
        System.out.println("MiddleElement");
        System.out.println(temp2.data);
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }
}
