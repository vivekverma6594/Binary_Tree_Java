package com.company.searching;

public class BinarySearch {

    public int searchIterative(int[] input, int key){

        int l = 0; int h = input.length-1;
        int mid = (l+h)/ 2;

        while (l<=h){
            if(input[mid] == key)
                return mid;
            if(key < input[mid]){
                h = mid;
                mid = (l+h)/2;
            }
            if(key > input[mid]){
                l = mid;
                mid = (l+h)/2;
            }
        }

        return -1;
    }

    public int searchRecursive(int[] arr,int l , int r, int key){
        if (r>=l)
        {
            int mid = l + (r - l)/2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] > key)
                return searchRecursive(arr, l, mid-1, key);

            return searchRecursive(arr, mid+1, r, key);
        }
        return -1;
    }

}
