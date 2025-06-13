// Question: 12)Mid Half and Reverse
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class MidHalfRev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int start=0;int end=size-1;int mid=(start+end)/2;
        while(start<mid){
            int temp=a[start];
            a[start]=a[mid];
            a[mid]=temp;
            start++;
            mid--;
        }
        int mid1=(size+1)/2;
        while(mid1<end){
            int temp=a[mid1];
            a[mid1]=a[end];
            a[end]=temp;
            mid1++;
            end--;
        }
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}