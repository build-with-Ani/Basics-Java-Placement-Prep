// Question: 4b)Palindrome using Package
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class PalinPack {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         StringBuffer sb=new StringBuffer(s);
         sb.reverse();
         String s1=new String(sb);
         if(s1.equals(s)){
             System.out.println("palindrome");
         }else{
             System.out.println("not palindrome");
         }
    }
}