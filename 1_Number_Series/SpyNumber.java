// Question: 11)Spy Number
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-10

import java.util.*;
class SpyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prod=1;int sum=0;
        while(n!=0){
            int y=n%10;
            prod=prod*y;
            sum=sum+y;
            n=n/10;
        }
        if(sum==prod){
            System.out.print("Spy number");
        }else{
            System.out.print("not Spy number");
        }
    }
}