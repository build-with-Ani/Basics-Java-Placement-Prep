// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-13
// Pattern 15D
/*    
             1
           212
          32123
         4321234
        543212345
         4321234
          32123
           212
            1
*/

class PatternV {
    public static void main(String[] args) {
     int n=5;
     for(int row=1;row<=(n*2)-1;row++){
         int rowchange=(row>n)?(n*2)-row:row;
         for(int space=1;space<=(n-rowchange);space++){
             System.out.print(" ");
         }
         for(int col=rowchange;col>=1;col--){
             System.out.print(col);
         }
          for(int col=2;col<=rowchange;col++){
             System.out.print(col);
         }
         System.out.println();
     }
    }
}