// Question: 17)Printing Reversed Odd Index 
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class PrintRevOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[]a=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            if(i%2!=0){
                System.out.print(a[i]);
            }
        }
    }
}