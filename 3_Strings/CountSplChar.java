// Question: 7)Counting Special Characters
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class CountSplChar {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         char[]a=s.toCharArray();
         int count=0;
         for(int i=0;i<s.length();i++){
             if(!(Character.isLetterOrDigit(a[i]))){
                 if(!(Character.isWhitespace(a[i]))){
                     count++;
                 }
             }
         }
         System.out.print("Count "+count);
    }
}