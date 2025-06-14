// Question: 27)Count and Print Count of the Character
// Topic: Strings
// Author: Anisha
// Date: 2025-06-14

import java.util.*;
class CharCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[]a=s.toCharArray();
        int[]count=new int[256];
        for(int i=0;i<s.length();i++){
            count[a[i]]++;
        }
        boolean []isprint=new boolean[256];
        for(int i=0;i<s.length();i++){
            if(!isprint[a[i]]){
            System.out.print(a[i]);
            System.out.print(count[a[i]]);
            isprint[a[i]]=true;
            }
        }
    }
}