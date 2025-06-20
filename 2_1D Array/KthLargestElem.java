// Question: 27)kth Largest Element
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class KthLargestElem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        //getting k from user
        int k=sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.print(a[k-1]);
            break;
        }
    }
}