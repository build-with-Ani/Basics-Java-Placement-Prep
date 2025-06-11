// Question: 15)Bubble Sorting
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class BubbleSorting {
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
         System.out.println("After Bubble Sorting");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}