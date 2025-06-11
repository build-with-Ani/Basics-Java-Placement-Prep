// Question: 16)Armstrong Number
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;int sum=0;
        int res=digcount(n);
        while(temp!=0){
            int y=temp%10;
            sum=sum+power(y,res);
            temp=temp/10;
        }
       if(sum==n){
           System.out.print("Armstrong number");
       }else{
           System.out.print("not Armstrong number");
       }
    }
    public static int power(int base,int exp){
        int pow=1;
        for(int i=1;i<=exp;i++){
            pow=pow*base;
        }
        return pow;
    }
    public static int digcount(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        return count;
    }
}