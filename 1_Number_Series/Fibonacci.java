// Question: 14)Fibonacci Series
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2;i<n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}