// Question: 13)Mid Half and Reverse then Add Swapped Elements
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class MidHalfRevAdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int start=0;int end=size-1;int mid=(start+end)/2;int mid1=mid;
        while(start<mid){
            int temp=a[start];
            a[start]=a[mid];
            a[mid]=temp;
            start++;
            mid--;
        }
        int sum=0;
        for(int i=0;i<=mid1;i++){
            sum=sum+a[i];
        }
        System.out.println("sum of swapped elements "+sum);
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}