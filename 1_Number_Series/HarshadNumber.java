// Question: 24)Harshad Number
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class HarshadNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;int temp=n;
        while(temp!=0){
            int y=temp%10;
            sum=sum+y;
            temp=temp/10;
        }
        int dig=n%sum;
        if(dig==0){
            System.out.print("Harshad number");
        }else{
            System.out.print("not Harshad number");
        }
    }
}