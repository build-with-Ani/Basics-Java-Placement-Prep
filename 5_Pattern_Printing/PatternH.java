// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-13
// Pattern 7 
/*    
        * * * * * 
         * * * * 
          * * * 
           * * 
            *    
*/

class PatternH {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<n;row++){
            for(int space=0;space<=row-1;space++){
                System.out.print(" ");
            }
            for(int star=0;star<=(n-row-1);star++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}