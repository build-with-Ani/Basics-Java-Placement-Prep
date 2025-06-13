// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-13
// Pattern 1B
/*    
        0 0 0 0 0 0 0 0 0 
        0 1 1 1 1 1 1 1 0 
        0 1 2 2 2 2 2 1 0 
        0 1 2 3 3 3 2 1 0 
        0 1 2 3 4 3 2 1 0 
        0 1 2 3 3 3 2 1 0 
        0 1 2 2 2 2 2 1 0 
        0 1 1 1 1 1 1 1 0 
        0 0 0 0 0 0 0 0 0 
*/

class PatternB {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<(n*2)-1;row++){
            for(int col=0;col<(n*2)-1;col++){
                int top=row;int left=col;int bottom=(n*2-2)-row;int right=(n*2-2)-col;
                int min=min(min(top,bottom),min(left,right));
                System.out.print(min+" ");
            }
             System.out.println();
        }
    }
    public static int min(int a,int b){
        if(a>b){
            return b;
        }else{
            return a;
        }
    }
}