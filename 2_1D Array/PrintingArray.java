// Question: 1)Printing an Array
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class PrintingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}