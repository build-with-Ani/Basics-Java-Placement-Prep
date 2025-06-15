// Question: 2)Finding Min Elem in Each Row
// Topic: 2D Array
// Author: Anisha
// Date: 2025-06-15

import java.util.*;
class MinElemRow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            int min=a[i][0];
            for(int j=1;j<c;j++){
              if(a[i][j]<min){
                  min=a[i][j];
              }
            }
            System.out.print(min+" ");
        }
    }
}