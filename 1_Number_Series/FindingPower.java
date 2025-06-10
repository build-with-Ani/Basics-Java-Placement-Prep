// Question: 4)Finding Power
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-10

import java.util.*;
class FindingPower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int exp=sc.nextInt();
        int pow=1;
        for(int i=1;i<=exp;i++){
            pow=pow*base;
        }
        System.out.print("Power "+pow);
    }
}
