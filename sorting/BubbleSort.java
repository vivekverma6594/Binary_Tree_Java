package com.company.sorting;

public class BubbleSort {

    public int[] sort(int[] array, int length){
        for(int i=0; i<length;i++){
            for(int j=0; j<length; j++){
                if(array[i]<array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
