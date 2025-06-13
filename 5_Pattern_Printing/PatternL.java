// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-13
// Pattern 11
/*    
    *
    * * 
    * * * 
    * * * * 
    * * * * * 
    * * * * 
    * * * 
    * * 
    *   
*/

class PatternL {
    public static void main(String[] args) {
      int n=5;
      for(int row=1;row<=(n*2)-1;row++){
           int rowchange=(row>n)? (n*2)-row:row;
          for(int col=1;col<=rowchange;col++){
              System.out.print("*"+" ");
          }
          System.out.println();
      }
    }
}