// Question: 7)Linear Search
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        //elem to search
        int r=sc.nextInt();
        int index=-1;
        for(int i=0;i<size;i++){
            if(r==a[i]){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at index "+index);
        }
    }
}