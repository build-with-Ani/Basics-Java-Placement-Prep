// Question: 16)Outer Spiral Printing
// Topic: 2D Array
// Author: Anisha
// Date: 2025-06-15

import java.util.*;
class OuterSpiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][]a=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int size=row*col;
        int[]res=new int[size];
        int index=0;
        int top=0;int left=0;int right=col-1;int bottom=row-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                res[index]=a[top][i];
                index++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
               res[index]=a[i][right];
               index++;
            }
            right--;
            if(left<=right){
                for(int i=right;i>=left;i--){
                res[index]=a[bottom][i];
                index++;
                }
                bottom--;
            }
            if(top<=bottom){
                for(int i=bottom;i>=top;i--){
                res[index]=a[i][left];
                index++;
                }
                left++;
            }
        }
        for(int i=size-1;i>=0;i--){
            System.out.print(res[i]+" ");
        }
    }
}