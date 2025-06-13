// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-13
// Pattern 3 
/*    
       1 
       2 3 
       4 5 6 
       7 8 9 10 
       11 12 13 14 15
*/

class PatternD {
    public static void main(String[] args) {
        int n=5;
        int printvalue=1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(printvalue+" ");
                printvalue++;
            }
            System.out.println();
        }    
    }
}