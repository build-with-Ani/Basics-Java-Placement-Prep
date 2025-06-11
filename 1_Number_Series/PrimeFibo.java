// Question: 15)Adding Prime Numbers in Fibo Series
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class PrimeFibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;int b=1;int sum=0;
        for(int i=2;i<n;i++){
            int c=a+b;
            if(prime(c)==0){
                sum=sum+c;
            }
            a=b;
            b=c;
        }
        System.out.print("sum "+sum);
    }
    public static int prime(int num){
        int flag=0;
        if(num<=1){
            flag=1;
        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    flag=1;
                    break;
                }
            }
        }
        return flag;
    }
}