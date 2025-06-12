// Question: 21)Longest Word in a Sentence
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class LongestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s+" ";
        char[]a=s.toCharArray();
        int currlen=0;int maxlen=0;
        int currstart=0;int maxstart=0;
        for(int i=0;i<s.length();i++){
            if(!(Character.isWhitespace(a[i]))){
                if(currlen==0){
                    currstart=i;
                }
                currlen++;
            }else{
               if(currlen>maxlen){
                   maxlen=currlen;
                   maxstart=currstart;
               } 
               currlen=0;
               currstart=0;
            }
        }
        for(int i=maxstart;i<maxstart+maxlen;i++){
            System.out.print(a[i]);
        }
        
    }
}