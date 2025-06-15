// Question: 5)Rotating Matrix Clockwise
// Topic: 2D Array
// Author: Anisha
// Date: 2025-06-15

import java.util.*;
class RotateMatrix {
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
        //transpose
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        //reverse each row
        for(int i=0;i<r;i++){
            int start=0;int end=r-1;
            while(start<=end){
                int temp=a[i][start];
                a[i][start]=a[i][end];
                a[i][end]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}