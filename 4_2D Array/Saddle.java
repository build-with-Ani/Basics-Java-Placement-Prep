// Question: 13)Saddle Point
// Topic: 2D Array
// Author: Anisha
// Date: 2025-06-15

import java.util.*;
class Saddle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        boolean found=true;
        for(int i=0;i<n;i++){
            int min=a[i][0];
            int colindex=0;
            for(int j=1;j<n;j++){
                if(a[i][j]<min){
                    min=a[i][j];
                    colindex=j;
                }
            }
                boolean saddle=true;
                for(int k=0;k<n;k++){
                    if(a[k][colindex]>min){
                        saddle=false;
                        break;
                    }
                }
                if(saddle){
                    System.out.print(min);
                    found=true;
                    break;
                }
                
            }
            if(!found){
                System.out.print("not found");
            }
    }
}