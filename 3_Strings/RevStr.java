// Question: 11)Reversing String Using Single Pointer
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class RevStr {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         String rev="";
         for(int i=0;i<s.length();i++){
             rev=s.charAt(i)+rev;
         }
         System.out.print(rev);
    }
}