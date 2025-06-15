// Topic: Pattern Printing
// Author: Anisha
// Date: 2025-06-15
// Pattern 13
/*    
       R
      A A
     C   C
    E     E
     C   C
      A A
       R
*/

class PatternN {
    public static void main(String[] args) {
        String s="RACECAR";
        int n=(s.length()/2)+1;
        for(int row=1;row<=(n*2)-1;row++){
            int rowchange=(row>n)?(n*2)-row:row;
            int index=row-1;
            for(int space=1;space<=n-rowchange;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=(rowchange*2)-1;star++){
                    if(star==1 || star==(rowchange*2)-1){
                       System.out.print(s.charAt(index)); 
                    }else{
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
        
    }
}