// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-13
// Pattern 9
/*    
        A 
       A B 
      A B C 
     A B C D 
    A B C D E   
*/

class PatternJ {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            char c='A';
            for(int col=1;col<=row;col++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}