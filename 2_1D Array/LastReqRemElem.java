// Question: 23)Last Req Elements + Remaining Part in the Beginning
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class LastReqRemElem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        //no of elem to req
        int r=sc.nextInt();
        for(int i=size-r;i<size;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<=r+1;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}