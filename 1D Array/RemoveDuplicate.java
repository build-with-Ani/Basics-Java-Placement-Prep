// Question: 20)Remove Duplicate Elements From an Array
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        boolean[]seen=new boolean[256];
        for(int i=0;i<size;i++){
            if(!seen[a[i]]){
                System.out.print(a[i]+" ");
                seen[a[i]]=true;
            }
        }
    }
}