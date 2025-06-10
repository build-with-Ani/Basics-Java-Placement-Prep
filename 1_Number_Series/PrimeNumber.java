// Question: 6)Prime Number
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-10

import java.util.*;
class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(prime(n)==0){
            System.out.print("Prime number");
        }else{
            System.out.print("not Prime number");
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
