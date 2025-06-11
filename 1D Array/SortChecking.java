// Question: 14)Check Whether an Array is Sorted or Not
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-11

import java.util.*;
class SortChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0];int sort=0;
        for(int i=1;i<size;i++){
            if(min>a[i]){
                sort++;
                break;
            }
        }
        if(sort==0){
            System.out.println("Sorted");
        }else{
              System.out.println("not Sorted");
        }
    }
}