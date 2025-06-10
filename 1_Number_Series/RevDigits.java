// Question: 3)Reversing Digits
// Topic: Number Series
// Author: Anisha
// Date: 2025-06-10

import java.util.*;
class RevDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            int y=n%10;
            rev=(rev*10)+y;
            n=n/10;
        }
        System.out.print("after reversing "+rev);
    }
}
