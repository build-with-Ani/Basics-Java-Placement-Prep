// Question: 9)Hierarchical Inheritance
// Topic: OOPS
// Author: Anisha
// Date: 2025-06-13

class HierarchicalInheritance {
    public static void main(String[] args) {
       Son s=new Son();
       s.parentDetails();
       s.sonDetails();
       Dau d=new Dau();
       d.parentDetails();
       d.dauDetails();
    }
}
class Parents{
    public void parentDetails(){
        System.out.println("Father & Mother");
    }
}
class Son extends Parents{
    public void sonDetails(){
        System.out.println("Son");
    }
}
class Dau extends Parents{
    public void dauDetails(){
        System.out.println("Daughter");
    }
}