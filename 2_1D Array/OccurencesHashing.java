// Question: 17)Finding Number of Occurences Using Hashing Technique
// Topic: 1D Arrays
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class OccurencesHashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int max=max(size,a);
        int y=max+1;
        int[]count=new int[y];
        for(int i=0;i<size;i++){
           count[a[i]]++;
        }
        boolean[]printed=new boolean[y];
        for(int i=0;i<size;i++){
            if(!printed[a[i]]){
                System.out.println(a[i]+"--"+count[a[i]]);
                printed[a[i]]=true;
            }
        }
    }
    public static int max(int size,int[]a){
        int max=a[0];
        for(int i=1;i<size;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
}