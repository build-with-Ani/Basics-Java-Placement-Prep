// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-13
// Pattern 14B
/*    
    12345
      1234
        123
          12
            1
*/

class PatternP {
    public static void main(String[] args) {
      int n=5;
      for(int row=1;row<=n;row++){
          for(int space=1;space<=(row-1);space++){
              System.out.print(" ");
          }
          int a=1;
          for(int col=1;col<=n-(row-1);col++){
              System.out.print(a);
              a++;
          }
          System.out.println();
      }
    }
}