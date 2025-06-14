// Question: 25)Time Conversion
// Topic: Strings
// Author: Anisha
// Date: 2025-06-14

import java.util.*;
class TimeConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[]a=s.toCharArray();
        int hour=(a[0]-'0')*10+(a[1]-'0');
        int min=(a[3]-'0')*10+(a[4]-'0');
        int sec=(a[6]-'0')*10+(a[7]-'0');
        if(a[8]=='P'){
            if(hour!=12){
                hour=hour+12;
            }
        }else if(a[8]=='A'){
            if(hour==12){
                hour=0;
            }
        }
        if (hour < 10) {
            System.out.print("0" + hour + ":");
        } else {
            System.out.print(hour + ":");
        }
        if (min < 10) {
            System.out.print("0" + min + ":");
        } else {
            System.out.print(min + ":");
        }
        if (sec < 10) {
            System.out.print("0" + sec);
        } else {
            System.out.print(sec);
        }
    }
}