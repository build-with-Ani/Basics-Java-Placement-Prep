// Question: 7)Sum Of Natural Numbers
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-10

import java.util.*;
class SumOfNatNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.print("Sum "+sum);
    }
}
