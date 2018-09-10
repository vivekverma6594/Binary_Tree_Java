package com.company.LinkedList;


public class MergeMultipleLinkedLists {
    public  LinkedList mergeLists(LinkedList[] lists){
        LinkedList output = new LinkedList();
        for (LinkedList l: lists) {
            output = new MergeTwoLinkedList().mergeTwoLists(output.getHead(), l.getHead());
        }
        return output;
    }
}
