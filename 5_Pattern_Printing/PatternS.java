// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-13
// Pattern 15A
/*    
    *****
    ****
    ***
    **
    *
*/

class PatternS {
    public static void main(String[] args) {
      int n=5;
      for(int row=1;row<=n;row++){
          for(int col=1;col<=n-(row-1);col++){
              System.out.print("*");
          }
          System.out.println();
      }
    }
}