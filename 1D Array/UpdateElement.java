// Question: 10)Updating an Element
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class UpdateElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        //old elem
        int elem1=sc.nextInt();
        //new elem
        int elem2=sc.nextInt();
        int index=-1;
        for(int i=0;i<size;i++){
            if(a[i]==elem1){
                index=i;
            }
        }
        if(index==-1){
            System.out.println("elem not found");
        }else{
            a[index]=elem2;
            for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        }
    }
}