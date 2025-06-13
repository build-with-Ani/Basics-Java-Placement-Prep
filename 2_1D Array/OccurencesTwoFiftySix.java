// Question: 19)Finding Number Of Occurences Using 256 Method
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class OccurencesTwoFiftySix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int[]count=new int[256];
        for(int i=0;i<size;i++){
             count[a[i]]++;
        }
        boolean[]printed=new boolean[256];
        for(int i=0;i<size;i++){
            if(!printed[a[i]]){
            System.out.println(a[i]+"--"+count[a[i]]);
            printed[a[i]]=true;
            }
        }
    }
}