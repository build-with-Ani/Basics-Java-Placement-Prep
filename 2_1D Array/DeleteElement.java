// Question: 8)Deleting an element
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class DeleteElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        //elem to delete
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
            for(int i=index;i<size-1;i++){
               a[i]=a[i+1];
            }
            size--;
            System.out.println("Array after deletion");
            for(int i=0;i<size;i++){
                System.out.print(a[i]+" ");
            }
        }
    }
}