// Question: Finding Largest Number
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-10

import java.util.*;
class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(n1>=n2 && n1>=n3){
            System.out.print(n1);
        }else if(n2>=n1 && n2>=n3){
            System.out.print(n2);
        }else{
            System.out.print(n3);
        }
    }
}