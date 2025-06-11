// Question: 17)Reverse the Digits and add/sub based on primality
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class RevDigitsPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int rev=0;int n3=0;
        while(n1!=0){
            int y=n1%10;
            rev=(rev*10)+y;
            n1=n1/10;
        }
       if(prime(n2)==0){
           n3=rev+n2;
           System.out.print("sum "+n3);
       }else{
           n3=rev-n2;
           System.out.print("sum "+n3);
       }
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