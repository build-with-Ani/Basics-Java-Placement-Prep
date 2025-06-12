// Question: 20)Swapping Vowels in a Word
// Topic: Strings
// Author: Anisha
// Date: 2025-06-12

import java.util.*;
class SwappingVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[]a=s.toCharArray();
        int start=0;int end=s.length()-1;
        while(start<=end){
            if(!(a[start]=='a' || a[start]=='e' || a[start]=='i' || a[start]=='o' || a[start]=='u' || a[start]=='A' || a[start]=='E' || a[start]=='I' || a[start]=='O' || a[start]=='U')){
                start++;
            }else if(!(a[end]=='a' || a[end]=='e' || a[end]=='i' || a[end]=='o' || a[end]=='u' || a[end]=='A' || a[end]=='E' || a[end]=='I' || a[end]=='O' || a[end]=='U')){
                end--;
            }else{
                char temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<s.length();i++){
            System.out.print(a[i]);
        }
    }
}