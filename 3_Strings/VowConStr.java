// Question: 3)Counting of Vowels & Consonants in String
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class VowConStr {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         String s1=s.toLowerCase();
         int vow=0;int con=0;
         char[]a=s1.toCharArray();
         for(int i=0;i<s.length();i++){
            if(Character.isLetter(a[i])){
                if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u'){
                    vow++;
                }else{
                    con++;
                }
            }
         }
         System.out.println("vowels "+vow);
         System.out.println("consonants "+con);
    }
}