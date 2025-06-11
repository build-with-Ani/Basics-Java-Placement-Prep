// Question: 9)Inserting an Element
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class InsertElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size+1];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        //asking index from user
        int index=sc.nextInt();
        //asking elem from user
        int elem=sc.nextInt();
        for(int i=size;i>index;i--){
            a[i]=a[i-1];
        }
        a[index]=elem;
        for(int i=0;i<size+1;i++){
            System.out.print(a[i]+" ");
        }
    }
}