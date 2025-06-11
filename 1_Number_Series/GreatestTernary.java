// Question: 18)Greatest of 3 Numbers Using Ternary Operator
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class GreatestTernary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int l=(n1>=n2 && n1>=n3)?n1:(n2>=n3)?n2:n3;
        System.out.print("largest "+l);
    }
}