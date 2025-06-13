// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-13
// Pattern 10
/*    
        R 
       R A 
      R A J 
     R A J A 
    R A J A N   
*/

class PatternK {
    public static void main(String[] args) {
        String s="RAJAN";
        int n=s.length();
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            } 
            for(int col=1;col<=row;col++){
                System.out.print(s.charAt(col-1)+" ");
            }
            System.out.println();
        }
    }
}