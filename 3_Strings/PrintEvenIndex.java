// Question: 16)Printing Even Index Elements
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class PrintEvenIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[]a=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                System.out.print(a[i]);
            }
        }
    }
}