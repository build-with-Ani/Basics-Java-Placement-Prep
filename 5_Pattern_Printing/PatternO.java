// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-13
// Pattern 14A
/*    
    5 4 3 2 1 
    5 4 3 2 
    5 4 3 
    5 4 
    5 
*/

class PatternO {
    public static void main(String[] args) {
      int n=5;
      for(int row=1;row<=n;row++){
          int a=n;
          for(int col=1;col<=n-(row-1);col++){
              System.out.print(a+" ");
              a--;
          }
          System.out.println();
      }
    }
}