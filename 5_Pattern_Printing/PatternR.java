// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-13
// Pattern 14D
/*    
    1
    12
    123
    1234
    12345
*/

class PatternR {
    public static void main(String[] args) {
      int n=5;
      for(int row=1;row<=n;row++){
          int a=1;
          for(int col=1;col<=row;col++){
              System.out.print(a);
              a++;
          }
          System.out.println();
      }
    }
}