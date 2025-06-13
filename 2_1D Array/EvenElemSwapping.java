// Question: 25)Even Elements Swapping
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class EvenElemSwapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int start=0;int end=size-1;
        while(start<=end){
            if(a[start]%2==0 && a[end]%2==0){
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }else if(a[start]%2!=0){
                start++;
            }else if(a[end]%2!=0){
                end--;
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}