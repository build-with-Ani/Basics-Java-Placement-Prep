// Question: 10)Automorphic Number
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-10

import java.util.*;
class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int temp=sq;int d=10;int y=0;
        while(y<n){
            y=temp%d;
            d=d*10;
        }
        if(y==n){
            System.out.print("Automorphic number");
        }else{
            System.out.print("not Automorphic number");
        }
    }
}
