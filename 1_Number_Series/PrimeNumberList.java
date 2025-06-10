// Question: 9)Sum of Prime Numbers in a Given Number
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-10

import java.util.*;
class PrimeNumberList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int y=n%10;
            if(prime(y)==0){
                sum=sum+y;
            }
            n=n/10;
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
