// Question: 16)Alternate Sorting
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class AlternateSorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("After Alternate Sorting");
        int start=0;int end=size-1;
        while(start<=end){
             System.out.print(a[start]+" ");
             start++;
             if(start<=end){
             System.out.print(a[end]+" ");
             end--;
             }
        }
    }
}