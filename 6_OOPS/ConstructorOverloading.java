// Question: 3)Constructor Overloading
// Topic: OOPS
// Author: Anisha
// Date: 2025-06-13

class ConstructorOverloading {
    public static void main(String[] args) {
       SecondClass s1=new SecondClass();
       s1.subMethod();
       SecondClass s2=new SecondClass(20);
       s2.subMethod();
       SecondClass s3=new SecondClass("anisha");
       s3.subMethod();
       SecondClass s4=new SecondClass(30,"Anisha");
       s4.subMethod();
    }
}
class SecondClass{
    int id;
    String name;
    SecondClass(){
        id=10;
        name="Anisha";
        System.out.println("Default Constructor");
    }
    SecondClass(int idval){
        id=idval;
        System.out.println("Id Constructor");
    }
    SecondClass(String nameval){
        name=nameval;
        System.out.println("Name Constructor");
    }
    SecondClass(int idval,String nameval){
        id=idval;
        name=nameval;
        System.out.println("Both id and name constructor");
    }
    public void subMethod(){
        System.out.println("Id "+id);
        System.out.println("Name "+name);
    }
}