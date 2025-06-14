// Question: 4)'this' Keyword Usage
// Topic: OOPS
// Author: Anisha
// Date: 2025-06-13

class ThisKeyword {
    public static void main(String[] args) {
       SecondClass s1=new SecondClass();
       s1.showDetails();
       SecondClass s2=new SecondClass(30,"Anisha");
       s2.showDetails();
    }
}
class SecondClass{
    int id;
    String name;
    SecondClass(){
        this(10,"ani");
        System.out.println("Default Constructor");
    }
    SecondClass(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("Parameterized Constructor");
    }
    public void showDetails(){
        this.subMethod();
    }
    public void subMethod(){
        System.out.println("Id "+id);
        System.out.println("Name "+name);
    }
}