// Question: 1)String into Character
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class StrIntoChar {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         char[]a=s.toCharArray();
         for(int i=0;i<s.length();i++){
             System.out.print(a[i]+" ");
         }
    }
}