// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-13
// Pattern 5 
/*    
        * 
        * * 
        * * * 
        * * * * 
        * * * * * 
*/

class PatternF {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }   
    }
}