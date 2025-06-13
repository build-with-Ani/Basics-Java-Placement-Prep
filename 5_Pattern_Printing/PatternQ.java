// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-13
// Pattern 14C
/*    
           1
         12
       123
     1234
   12345
*/

class PatternQ {
    public static void main(String[] args) {
      int n=5;
      for(int row=1;row<=n;row++){
          for(int space=1;space<=n-row;space++){
              System.out.print(" ");
          }
          int a=1;
          for(int col=1;col<=row;col++){
              System.out.print(a);
              a++;
          }
          System.out.println();
      }
    }
}