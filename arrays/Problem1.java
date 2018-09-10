package com.company.arrays;

import java.util.HashSet;
import java.util.Set;

public class Problem1 {


    /**
     *Rearrange an array such that arr[i] = i
     *Given an array of elements of length N, ranging from 1 to N.
     *All elements may not be present in the array.
     *If element is not present then there will be -1 present in the array.
     *Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
     */
    public int[] fix(int[] input, int n){  //{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
        for(int i = 0; i<n; i++)
        {
            if(input[i] != i){
                for(int j = 0; j<n; j++){
                    if(input[j] == i){
                        int temp1 = input[j];
                        int temp2 = input[i];
                        input[i] = temp1;
                        input[j] = temp2;
                        break;
                    }
                }
            }
        }

        return input;
    }

    public int[] fixWithHashSet(int[] input, int n){  //{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
        Set<Integer> set = new HashSet<Integer>();
        for (int i : input) {
            set.add(i);
        }

        for (int i = 0 ; i<n ;i++){
            if(set.contains(i))
                input[i] = i;
            else
                input[i] = -1;
        }
        return input;
    }

}
