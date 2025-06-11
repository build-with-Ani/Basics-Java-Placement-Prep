// Question: 4)Rotation (Anticlock) - left shift
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class AntiRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int r=sc.nextInt();
        //no of rotations
        while(r!=0){
        int temp=a[0];
        for(int i=0;i<size-1;i++){
            a[i]=a[i+1];
        }
        a[size-1]=temp;
        r--;
        }
         for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}