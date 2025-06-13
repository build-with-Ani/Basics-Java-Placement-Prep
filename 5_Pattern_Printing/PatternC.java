// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-13
// Pattern 2 
/*    
        *   *
         * * 
          *  
         * * 
        *   *
*/

class PatternC {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(row==col){
                    System.out.print("*");
                }
                else if((row+col)==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }    
    }
}