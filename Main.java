package com.company;

import com.company.LinkedList.LinkedList;
import com.company.LinkedList.MergeTwoLinkedList;
import com.company.LinkedList.MergeMultipleLinkedLists;
import com.company.arrays.Problem1;
import com.company.arrays.ArrayRotation;
import com.company.misc.Power;
import com.company.searching.BinarySearch;
import com.company.sorting.BubbleSort;
import com.company.sorting.MergeSort;
import com.company.sorting.QuickSort;
import com.company.stack.BalancedParentheses;
import com.company.strings.ReverseString;
import com.company.tree.BinaryTree;
import com.company.tree.Node;

public class Main {

    public static void main(String[] args) {
        QuickSort();
    }

    private static void PowerCalculation(){
        Power power = new Power();
        double d1= power.Pow(2,0);
        double d2= power.Pow(2,10);
        double d3= power.Pow(2,-10);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }

    private static void MergeMultipleLinkedLists(){
        MergeMultipleLinkedLists mergeLinkedLists = new MergeMultipleLinkedLists();

        LinkedList list1 = new LinkedList(new com.company.LinkedList.Node(2));
        list1.append(4);
        list1.append(6);
        list1.append(8);
        list1.append(10);
        list1.append(12);

        LinkedList list2 = new LinkedList(new com.company.LinkedList.Node(3));
        list2.append(5);
        list2.append(7);
        list2.append(9);
        list2.append(11);
        list2.append(13);

        LinkedList list3 = new LinkedList(new com.company.LinkedList.Node(1));
        list3.append(9);
        list3.append(15);
        list3.append(16);
        list3.append(17);
        list3.append(18);

        LinkedList[] lists = new LinkedList[3];
        lists[0] = list1;
        lists[1] = list2;
        lists[2] = list3;

        mergeLinkedLists.mergeLists(lists).display();
    }

    private static void MergingTwoLinkedList(){
        MergeTwoLinkedList mergeLinkedLists = new MergeTwoLinkedList();

        LinkedList list1 = new LinkedList(new com.company.LinkedList.Node(2));
        list1.append(4);
        list1.append(6);
        list1.append(8);
        list1.append(10);
        list1.append(12);

        LinkedList list2 = new LinkedList(new com.company.LinkedList.Node(3));
        list2.append(5);
        list2.append(7);
        list2.append(9);
        list2.append(11);
        list2.append(13);

        mergeLinkedLists.mergeTwoLists(list1.getHead(),list2.getHead()).display();
    }

    private static void StringReverse(){
        ReverseString reverseString = new ReverseString();
        String output = reverseString.reverse("vivek is good");
        System.out.println(output);
    }

    private static void Problem1(){
        int[] input  = new int[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        Problem1 p = new Problem1();
        int[] output = p.fixWithHashSet(input, input.length);
        System.out.println(output.toString());
    }

    private static void ArrayRotation(){
        int[] input  = new int[]{6,4,2,1,8,3,7,9,5};

        System.out.println("Input");
        for (int i:input) {
            System.out.print(i +" ");
        }

        ArrayRotation p = new ArrayRotation();
        int[] output = p.rotateArray3(input, 2);

        System.out.println("\nOutput");
        for (int i:output) {
            System.out.print(i +" ");
        }
    }

    private static void MergeSort(){
        int[] array = new int[]{6,4,2,1,8,3,7,9,5};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sortRecursive(array,0,array.length-1);
        for (int i :array) {
            System.out.println(i);
        }

    }

    private static void BinarySearch(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};

        BinarySearch binarySearch = new BinarySearch();
        int output1 = binarySearch.searchIterative(array, 7);
        int output2 =  binarySearch.searchRecursive(array, 0 ,array.length-1, 3);

        System.out.println(output1);
        System.out.println(output2);
    }

    private static void StackMethods(){
        BalancedParentheses balancedParentheses = new BalancedParentheses();
        System.out.print(balancedParentheses.CheckBalancedParentheses("{"));

    }

    private static void LinkedList(){

        LinkedList list = new LinkedList();
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(7);
        list.append(8);
        list.append(10);
        list.append(11);
        list.append(16);
//        list.append(6);
        list.display();
        list.printMiddleOneLoop();
        //list.prepend(0);
        //System.out.println();
//        list.display();
//        list.delete(4);
//        System.out.println();
//        list.display();
//        list.insert(9, 10);
//        System.out.println();
//        list.display();
//        list.insert(9, 0);
//        System.out.println();
//        list.display();

    }

    private static void BinaryTree(){
        BinaryTree binaryTree = new BinaryTree(new Node(15));
        binaryTree.insert(new Node(16));
        binaryTree.insert(new Node(17));
        binaryTree.insert(new Node(14));
        binaryTree.insert(new Node(12));
        binaryTree.insert(new Node(18));
        binaryTree.display();
    }

    private static void BubbleSort(){
        int[] array = new int[]{6,4,2,1,8,3,7,9,5,5};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array,array.length);
        for (int i :array) {
            System.out.println(i);
        }
    }

    private static void QuickSort(){
        int[] array = new int[]{6,4,2,1,8,3,7,9,5,5};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, array.length-1);
        for (int i :array) {
            System.out.println(i);
        }
    }
}

