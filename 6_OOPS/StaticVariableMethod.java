// Question: 5)Static Variable and Method
// Topic: OOPS
// Author: Anisha
// Date: 2025-06-13

class StaticVariableMethod {
    public static void main(String[] args) {
       SecondClass.name="Anisha";
       SecondClass.collegename();
    }
}
class SecondClass{
    static String name;
    public static void collegename(){
        System.out.print(name);
    }
    
}