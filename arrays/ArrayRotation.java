package com.company.arrays;

public class ArrayRotation {


    //Program for array rotation
    //Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
    //[1, 2, 3, 4, 5, 6, 7] --> [3, 4, 5, 6, 7, 1, 2] for two rotations

    //does not work for rotation greater than the size of the array
    public int[] rotateArray1(int[] input, int n){

        int inputLength = input.length;
        int[] output = new int[inputLength];

        int[] temp = new int[n];
        for(int i = 0; i<n; i++){
            temp[i] = input[i];
        }

        for(int i = 0; i<inputLength-n ; i++){
            output[i] = input[i+n];
        }

        for (int j=0; j<temp.length; j++){
            output[inputLength-n+j] = temp[j];
        }

        return output;
    }

    public int[] rotateArray2(int[] input, int n){
        for(int i = 0 ; i<n ; i++)
        {
          input = rotate(input);
        }
        return input;
    }

    public int[] rotateArray3(int[] input, int n){
        reverse(input, 0, n-1);
        reverse(input, n, input.length-1);
        reverse(input, 0, input.length-1);
        return input;
    }

    private int[] rotate(int[] input){
        int temp = input[0];
        for(int i = 0; i< input.length-1; i++){
            input[i] =input[i+1];
        }
        input[input.length-1] = temp;
        return input;
    }

    private int[] reverse(int[] input, int start, int end){
        while (start< end)
        {
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
        return input;
    }




}
