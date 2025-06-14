// Question: 6)Method Overloading
// Topic: OOPS
// Author: Anisha
// Date: 2025-06-13

class MethodOverloading {
    public static void main(String[] args) {
       SecondClass s=new SecondClass();
       s.add();
       s.add(10);
       s.add(10,20);
       s.add(10.0,20.0);
    }
}
class SecondClass{
    public void add(){
        System.out.println("no values passed");
    }
    public void add(int a){
        System.out.println("value "+a);
    }
    public void add(int a,int b){
        System.out.println("sum "+(a+b));
    }
    public void add(double a,double b){
        System.out.println("sum "+(a+b));
    }
}