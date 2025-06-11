// Question: 13)Sum Till Single Digit
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class SumTillSingleDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>=10){
            int sum=0;
            while(n!=0){
                int y=n%10;
                sum=sum+y;
                n=n/10;
            }
            n=sum;
        }
            System.out.print("sum "+n);
    }
}