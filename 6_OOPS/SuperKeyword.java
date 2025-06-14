// Question: 11)'Super' Keyword
// Topic: OOPS
// Author: Anisha
// Date: 2025-06-13

class SuperKeyword {
    public static void main(String[] args) {
       Child c=new Child();
       c.details();
    }
}
class Parent{
    Parent(){
        System.out.println("Parent Constructor");
    }
    public void m1(){
        System.out.println("Parent Method");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Child Constructor");
    }
    public void m1(){
        System.out.println("Child Method");
    }
    public void details(){
      super.m1();
      m1();
    }   
}