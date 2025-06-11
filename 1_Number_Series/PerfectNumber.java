// Question: 22)Perfect Number
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class PerfectNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factor(n);
    }
    public static void factor(int n){
        int sum=0;int temp=n;
        for(int i=1;i<temp;i++){
            if(temp%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.print("Perfect number");
        }else{
            System.out.print("not Perfect number");
        }
    }
}