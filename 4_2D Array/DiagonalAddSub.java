// Question: 8)Add Diagonal Elements and Subtract It
// Topic: 2D Array
// Author: Anisha
// Date: 2025-06-15

import java.util.*;
class DiagonalAddSub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[][]a=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int sum1=0;int sum2=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j){
                    sum1=sum1+a[i][j];
                }
                else if(i+j==size-1){
                    sum2=sum2+a[i][j];
                }
            }
        }
        if(sum1>=sum2){
            System.out.print(sum1-sum2);
        }else if(sum2>=sum1){
            System.out.print(sum2-sum1);
        }
    }
}