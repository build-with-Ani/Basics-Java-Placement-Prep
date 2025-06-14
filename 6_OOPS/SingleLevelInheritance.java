// Question: 7)Single Level Inheritance
// Topic: OOPS
// Author: Anisha
// Date: 2025-06-13

class SingleLevelInheritance {
    public static void main(String[] args) {
       Child s=new Child();
       s.parentDetails();
       s.childrenDetails();
    }
}
class Parents{
    public void parentDetails(){
        System.out.println("Father & Mother");
    }
}
class Child extends Parents{
    public void childrenDetails(){
        System.out.println("Children");
    }
}