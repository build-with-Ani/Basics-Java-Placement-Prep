// Question: 21)Evil Number
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class EvilNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        decBin(n);
    }
    public static void decBin(int n){
        int bin=0;int pow=1;
        while(n!=0){
            int y=n%2;
            bin=bin+(pow*y);
            pow=pow*10;
            n=n/2;
        }
        counteven(bin);
    }
    public static void counteven(int n){
        int count=0;
        while(n!=0){
            int y=n%10;
            if(y==1){
                count++;
            }
            n=n/10;
        }
        if(count%2==0){
            System.out.print("Evil Number");
        }else{
            System.out.print("not Evil Number");
        }
    }
}