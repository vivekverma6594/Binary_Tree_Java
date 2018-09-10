package com.company.sorting;

public class QuickSort {

    public int[] sort(int[] input, int left, int right){

        if(left<right){
            int partition = getPartition(input, left, right);
            sort(input, left, partition);
            sort(input, partition+1 , right);
        }
        return input;
    }

    private int getPartition(int[] input, int left, int right){

        int pivot = input[left];
        int i = left;
        int j = right;

        while (i<j){
            while (input[i]<=pivot && i<right){
                i++;
            }
            while (input[j]>=pivot && j>left){
                j--;
            }

            if(i<j){
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }

        int temp2 = input[j];
        input[j] = input[left];
        input[left] = temp2;

        return j;
    }


}





