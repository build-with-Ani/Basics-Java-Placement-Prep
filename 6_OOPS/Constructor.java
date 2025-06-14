// Question: 2)Constructor
// Topic: OOPS
// Author: Anisha
// Date: 2025-06-13

class Constructor {
    public static void main(String[] args) {
       SecondClass s1=new SecondClass();
       s1.subMethod();
       SecondClass s2=new SecondClass(20,"anisha");
       s2.subMethod();
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
    SecondClass(int idval,String nameval){
        id=idval;
        name=nameval;
        System.out.println("Parameterized Constructor");
    }
    public void subMethod(){
        System.out.println("Id "+id);
        System.out.println("Name "+name);
    }
}