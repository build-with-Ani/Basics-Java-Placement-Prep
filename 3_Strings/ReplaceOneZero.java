// Question: 12)Replace 1 as 0 and 0 as 1
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class ReplaceOneZero {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         char[]a=s.toCharArray();
         for(int i=0;i<s.length();i++){
             if(a[i]=='0'){
                 a[i]='1';
             }else{
                 a[i]='0';
             }
         }
         for(int i=0;i<s.length();i++){
             System.out.print(a[i]);
         }
    }
}