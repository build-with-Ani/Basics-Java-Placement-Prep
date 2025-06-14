// Question: 29)Encoding - Pig latin
// Topic: Strings
// Author: Anisha
// Date: 2025-06-14

import java.util.*;
class Piglatin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[]a=s.toCharArray();
        String p="";
        for(int i=0;i<s.length();i++){
            if(a[i]=='A'|| a[i]=='E'|| a[i]=='I'|| a[i]=='O'|| a[i]=='U'|| a[i]=='a'|| a[i]=='e'|| a[i]=='i'|| a[i]=='o'|| a[i]=='u'){
               if(i==0){
                   p=s+"way";
               }else{
                   p=s.substring(i)+s.substring(0,i)+"ay";
               }
               break;
            }
        }
            System.out.print(p);
    }
}