// Question: 4a)Palindrome using Array
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class PalinArr {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         String s1=s;
         char[]a=s1.toCharArray();
         int start=0;int end=s1.length()-1;
         boolean palin=true;
         while(start<=end){
             if(a[start]!=a[end]){
                 palin=false;
             }
             start++;
             end--;
         }
         if(palin){
             System.out.println("palindrome");
         }else{
             System.out.println("not palindrome");
         }
    }
}