// Question: 22)Reversing Each Word
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class RevEachWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s+" ";
        char[]a=s.toCharArray();
        int start=0;
        for(int i=0;i<s.length();i++){
            if(Character.isWhitespace(a[i])){
                int end=i-1;
                while(start<=end){
                    char temp=a[start];
                    a[start]=a[end];
                    a[end]=temp;
                    start++;
                    end--;
                }
                start=i+1;
            }
        }
        for(int i=0;i<s.length();i++){
            System.out.print(a[i]);
        }
    }
}