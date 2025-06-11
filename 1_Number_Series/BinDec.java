// Question: 19)Binary to Decimal
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class BinDec{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dec=0;int pow=1;
        while(n!=0){
            int y=n%10;
            dec=dec+(pow*y);
            pow=pow*2;
            n=n/10;
        }
        System.out.print("Decimal "+dec);
    }
}