// Question: 17)ASCII Value
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class AsciiValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[]a=s.toCharArray();
        int sum=0;
        for(int i=0;i<s.length();i++){
            int r=(int)a[i];
            sum=sum+r;
        }
        System.out.print("sum "+sum);
    }
}