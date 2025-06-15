// Question: 9)Printing String in X Format
// Topic: 2D Array
// Author: Anisha
// Date: 2025-06-15

import java.util.*;
class StringXFormat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        char[]a=s.toCharArray();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(a[i]+" ");
                }else if(i+j==n-1){
                    System.out.print(a[i]+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}