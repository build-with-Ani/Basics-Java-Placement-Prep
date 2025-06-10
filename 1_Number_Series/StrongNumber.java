// Question: 5)Strong Number
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-10

import java.util.*;
class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp!=0){
            int y=temp%10;
            sum=sum+fact(y);
            temp=temp/10;
        }
        if(sum==n){
            System.out.print("Strong number");
        }else{
            System.out.print("not Strong number");
        }
    }
    public static int fact(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
}
