// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-13
// Pattern 15C
/*    
            1
           212
          32123
         4321234
        543212345
*/

class PatternU {
    public static void main(String[] args) {
     int n=5;
     for(int row=1;row<=n;row++){
         for(int space=1;space<=(n-row);space++){
             System.out.print(" ");
         }
         for(int col=row;col>=1;col--){
             System.out.print(col);
         }
          for(int col=2;col<=row;col++){
             System.out.print(col);
         }
         System.out.println();
     }
    }
}