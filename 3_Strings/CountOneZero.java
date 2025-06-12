// Question: 13)Count 1 and 0 & Print Accordingly
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class CountOneZero {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         char[]a=s.toCharArray();
         int zero=0;int one=0;
         for(int i=0;i<s.length();i++){
             if(a[i]=='0'){
                 zero++;
             }else{
                 one++;
             }
         }
         for(int i=0;i<zero;i++){
             System.out.print('0');
         }
         for(int i=0;i<one;i++){
             System.out.print('1');
         }
    }
}