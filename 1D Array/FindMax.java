// Question: 2)Finding Maximum
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class FindMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=1;i<size;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.print("max elem "+max);
    }
}