// Question: 8)Anagram
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class Anagram {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s1=sc.nextLine();
         String s2=sc.nextLine();
         char[]a1=s1.toCharArray();
         char[]a2=s2.toCharArray();
         int l1=s1.length();
         int l2=s2.length();
         if(l1==l2){
             for(int i=0;i<l1;i++){
                 for(int j=0;j<l2;j++){
                     if(a1[i]==a2[j]){
                         a2[j]='$';
                         break;
                     }
                 }
             }
             boolean an=true;
             for(int i=0;i<l2;i++){
                 if(a2[i]!='$'){
                     an=false;
                 }
             }
             if(an){
                 System.out.println("Anagram");
             }else{
                 System.out.println("Not Anagram");
             }
         }else{
             System.out.println("Not Anagram");
         }
    }
}