// Question: 26)Toggling Cases
// Topic: Strings
// Author: Anisha
// Date: 2025-06-14

import java.util.*;
class TogglingCases {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[]a=s.toCharArray();
        for(int i=0;i<s.length();i++){
            int c=(int)a[i];
            if(c>=65 && c<=90){
                 a[i]=(char)(a[i]+32);
            }else if(c>=97 && c<=122){
                a[i]=(char)(a[i]-32);
            }
        }
        for(int i=0;i<s.length();i++){
            System.out.print(a[i]);
        }
    }
}