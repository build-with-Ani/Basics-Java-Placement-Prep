// Question: 1)Count Of Digits
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-10

import java.util.*;
class CountOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        System.out.print("count "+count);
    }
}
