// Question: 14)Palindrome (Alternate Way)
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class Palindrome {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         String rev="";
         for(int i=0;i<s.length();i++){
             rev=s.charAt(i)+rev;
         }
         if(rev.equals(s)){
             System.out.println("palindrome");
         }else{
             System.out.println("not palindrome");
         }
         
    }
}