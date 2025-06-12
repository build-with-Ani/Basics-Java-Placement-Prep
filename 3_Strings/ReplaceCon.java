// Question: 6)Replacing Consonants With '$'
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class ReplaceCon {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         char[]a=s.toCharArray();
         for(int i=0;i<s.length();i++){
             if(Character.isLetter(a[i])){
                if(!(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' || a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U')){
                       a[i]='$';
                }
             }
         }
        for(int i=0;i<s.length();i++){
             System.out.print(a[i]);
        }
    }
}