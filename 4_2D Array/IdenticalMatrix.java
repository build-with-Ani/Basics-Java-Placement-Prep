// Question: 7)Finding Whether Two Matrices Are Identical or Not
// Topic: 2D Array
// Author: Anisha
// Date: 2025-06-15

import java.util.*;
class IdenticalMatrix {
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
        int[][]b=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=sc.nextInt();
            }
        }
        boolean iden=true;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]!=b[i][j]){
                    iden=false;
                    break;
                }
            }
        }
        if(iden){
            System.out.print("Identical");
        }else{
            System.out.print("Not Identical");
        }
    }
}