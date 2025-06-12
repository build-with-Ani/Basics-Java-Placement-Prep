// Question: 23)Panagram
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class Panagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int size=s.length();
        char[]a=s.toCharArray();
        int[]count=new int[256];
        for(int i=0;i<size;i++){
            char ch=a[i];
            if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
            }
            count[ch]++;
        }
        boolean emp=true;
        for(int i=97;i<=122;i++){
            if(count[i]==0){
                emp=false;
                break;
            }
        }
        if(emp){
            System.out.print("panagram");
        }else{
            System.out.print("not panagram");
        }
    }
}

