// Question: 10)Printing Alphabets With Ascii Values
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class AlphabetsAscii {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         char ch;
         for(ch='a';ch<='z';ch++){
             System.out.print(ch);
             System.out.print((int)ch+" ");
         }
    }
}