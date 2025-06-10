// Question: 8)List Of Prime Numbers in a Range
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-10

import java.util.*;
class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++){
            if(prime(i)==0){
                System.out.print(i+" ");
            }
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
