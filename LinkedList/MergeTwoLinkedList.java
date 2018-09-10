package com.company.LinkedList;

public class MergeTwoLinkedList {

    public LinkedList mergeTwoLists(Node first, Node second){
        Node head = null;
        Node outputNode = null;
        while (first != null && second != null){
            if(first.data<second.data){
                if(outputNode == null){
                    outputNode = first;
                    head = first;
                }
                else {
                    outputNode.next = first;
                    outputNode = outputNode.next;
                }
                first = first.next;
            }
            else if(first.data>second.data) {
                if(outputNode == null){
                    outputNode = second;
                    head = second;
                }
                else {
                    outputNode.next = second;
                    outputNode = outputNode.next;
                }
                second = second.next;
            }
            else {
                if(outputNode == null) {
                    outputNode = first;
                    outputNode.next = first;
                    outputNode = outputNode.next;
                }
                else {
                    outputNode.next=first;
                    outputNode.next.next = first;
                    outputNode = outputNode.next.next;
                }
                first = first.next;
                second = second.next;
            }
        }
        while (first != null){
            if (outputNode==null){
                outputNode= first;
                head = first;
                first = first.next;
            }
            else{
                outputNode.next = first;
                first = first.next;
                outputNode = outputNode.next;
            }

        }
        while (second != null){
            if(outputNode == null){
                outputNode = second;
                head = second;
                second = second.next;
            }
            else{
                outputNode.next = second;
                second = second.next;
                outputNode = outputNode.next;
            }

        }
        return new LinkedList(head);
    }
}
