// Question: 20)Decimal to Binary
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class DecBin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bin=0;int pow=1;
        while(n!=0){
            int y=n%2;
            bin=bin+(pow*y);
            pow=pow*10;
            n=n/2;
        }
        System.out.print("Binary "+bin);
    }
}