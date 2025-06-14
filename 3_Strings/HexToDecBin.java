// Question: 24)Hexadecimal to Decimal & Binary
// Topic: Strings
// Author: Anisha
// Date: 2025-06-14

import java.util.*;
class HexToDecBin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=s.toLowerCase();
        char[]a=s1.toCharArray();
        int dec=0;int pow=1;
        for(int i=s1.length()-1;i>=0;i--){
            char ch=a[i];
            int y=0;
            if(ch>='0' && ch<='9'){
                y=ch-'0';
            }else if(ch>='a' && ch<='f'){
                y=ch-'a'+10;
            }
            dec=dec+(pow*y);
            pow=pow*16;
        }
        System.out.println(dec);
        int bin=0;int pow1=1;
        while(dec!=0){
            int y1=dec%2;
            bin=bin+(pow1*y1);
            pow1=pow1*10;
            dec=dec/2;
        }
        System.out.print(bin);
    }
}