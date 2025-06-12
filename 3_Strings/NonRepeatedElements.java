// Question: 15)Printing Non Repeated Elements
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class NonRepeatedElements {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         char[]a=s.toCharArray();
         int[]count=new int[256];
         for(int i=0;i<s.length();i++){
             count[a[i]]++;
         }
         for(int i=0;i<s.length();i++){
             if(count[a[i]]==1){
                 System.out.print(a[i]);
             }
         }
    }
}