// Question: 11)Binary Search
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int e=sc.nextInt();
        int index=-1;
        int start=0;int end=size-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(e==a[mid]){
                index=mid;
                break;
            }
            else if(e<a[mid]){
                end=mid-1;
            }
            else if(e>a[mid]){
                start=mid+1;
            }
        }
        if(index==-1){
             System.out.print("elem not found");
        }else{
            System.out.print("elem found at "+index);
        }
    }
}