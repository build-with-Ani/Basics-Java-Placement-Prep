// Question: 2)Sum Of Digits
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-10

import java.util.*;
class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int y=n%10;
            sum=sum+y;
            n=n/10;
        }
        System.out.print("sum "+sum);
    }
}
