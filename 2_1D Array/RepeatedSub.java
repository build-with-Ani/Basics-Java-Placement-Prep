// Question: 28)Counting of Digits with Repeated Subtraction
// Topic: 1D Array
// Author: Anisha
// Date: 2025-06-14

import java.util.*;
class RepeatedSub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        //get value from user
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<size;i++){
            while(a[i]>k){
                a[i]=a[i]-k;
                count++;
            }
            count++;
        }
        System.out.print(count);
    }
}