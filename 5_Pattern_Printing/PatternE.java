// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-13
// Pattern 4 
/*    
       1 
       2 6 
       3 7 10 
       4 8 11 13 
       5 9 12 14 15 

*/

class PatternE {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row <= n; row++) {
            int printvalue = row;
            int gap = n - 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(printvalue + " ");
                printvalue = printvalue + gap;
                gap--;
            }
            System.out.println();
        }   
    }
}