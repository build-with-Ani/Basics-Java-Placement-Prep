// Question: 10)Inner Spiral Printing
// Topic: 2D Array
// Author: Anisha
// Date: 2025-06-15

import java.util.*;
class InnerSpiral {
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
        int top=0;int bottom=c-1;
        int left=0;int right=r-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                System.out.print(a[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                 System.out.print(a[i][right]+" ");
            }
            right--;
            if(left<=right){
                for(int i=right;i>=left;i--){
                    System.out.print(a[bottom][i]+" "); 
                }
                bottom--;
            }
            if(top<=bottom){
                for(int i=bottom;i>=top;i--){
                     System.out.print(a[i][left]+" ");
                }
                left++;
            }
        }
    }
}