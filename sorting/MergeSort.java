package com.company.sorting;

public class MergeSort {

    public void sortRecursive(int[] input, int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            sortRecursive(input, l, mid);
            sortRecursive(input, mid+1, r);
            merge(input,l,mid,r);
        }
    }

    private void merge(int[] array, int l, int mid, int r){
        try {
            int n1 = mid-l+1;
            int n2 = r-mid;
            int[] first  = new int[n1];
            int[] second = new int[n2];
            int i = 0, j=0;
            while (i<n1){
                first[i] = array[l+i];
                i++;
            }
            while (j<n2){
                second[j] = array[mid+j+1];
                j++;
            }
            int p=0,q=0,k=l;
            while (p<n1 && q<n2){
                if(first[p] < second[q]){
                    array[k] = first[p];
                    p++;
                }
                else {
                    array[k] = second[q];
                    q++;
                }
                k++;
            }
            while (p<n1){
                array[k] = first[p];
                k++;
                p++;
            }
            while (q<n2){
                array[k] = second[q];
                k++;
                q++;
            }
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}
