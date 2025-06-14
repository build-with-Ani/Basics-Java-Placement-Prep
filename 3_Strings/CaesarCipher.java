// Question: 25)Caesar Cipher
// Topic: Strings
// Author: Anisha
// Date: 2025-06-14

import java.util.*;
class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[]a=s.toCharArray();
        for(int i=0;i<s.length();i++){
            char c=a[i];
            if(c>='A' && c<='Z'){
                c=(char)((c-'A'+2)%26+'A');
            }else if(c>='a' && c<='z'){
                c=(char)((c-'a'+2)%26+'a');
            }
            a[i]=c;
        }
        for(int i=0;i<s.length();i++){
            System.out.print(a[i]);
        }
    }
}