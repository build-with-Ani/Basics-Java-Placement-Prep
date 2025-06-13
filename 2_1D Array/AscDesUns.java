// Question: 26)To Check Whether the Array is Asc/Des/Unsorted
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class AscDesUns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        boolean asc=true;boolean desc=true;
       for(int i=0;i<size-1;i++){
           if(a[i]<a[i+1]){
               desc=false;
           }else if(a[i]>a[i+1]){
               asc=false;
           }
       }
       if(asc){
           System.out.println("Ascending");
       }else if(desc){
           System.out.println("Descending");
       }else{
           System.out.println("Unsorted");
       }
    }
}