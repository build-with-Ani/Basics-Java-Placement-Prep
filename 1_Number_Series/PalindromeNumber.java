// Question: 23)Palindrome Number
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class PalindromeNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;int temp=n;
        while(temp!=0){
            int y=temp%10;
            rev=(rev*10)+y;
            temp=temp/10;
        }
        if(n==rev){
            System.out.print("Palindrome number");
        }else{
            System.out.print("not Palindrome number");
        }
    }
}