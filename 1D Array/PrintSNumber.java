// Question: 21)Print if 2nd Number < 1st Number
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class PrintSNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.print(a[0]+" ");
        for(int i=0;i<size-1;i++){
           if(a[i+1]<a[i]){
               System.out.print(a[i+1]+" ");
           }
        }
    }
}