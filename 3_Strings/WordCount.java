// Question: 19)Word Count
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class WordCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[]a=s.toCharArray();
        int count=1;
        for(int i=0;i<s.length();i++){
            if(a[i]==' '){
                count++;
            }
        }
        System.out.print("count "+count);
    }
}