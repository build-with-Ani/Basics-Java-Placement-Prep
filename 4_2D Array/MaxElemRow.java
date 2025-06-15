// Question: 3)Finding Max Elem in Each Row
// Topic: 2D Array
// Author: Anisha
// Date: 2025-06-15

import java.util.*;
class MaxElemRow {
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
            int max=a[i][0];
            for(int j=1;j<c;j++){
              if(a[i][j]>max){
                  max=a[i][j];
              }
            }
            System.out.print(max+" ");
        }
    }
}