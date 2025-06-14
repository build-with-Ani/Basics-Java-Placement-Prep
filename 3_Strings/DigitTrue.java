// Question: 28)If Digit Print true
// Topic: Strings
// Author: Anisha
// Date: 2025-06-14

import java.util.*;
class DigitTrue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[]a=s.toCharArray();
        boolean found=true;
        for(int i=0;i<s.length();i++){
            if(!(Character.isDigit(a[i]))){
                found=false;
                break;
            }
        }
        if(found){
             System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}