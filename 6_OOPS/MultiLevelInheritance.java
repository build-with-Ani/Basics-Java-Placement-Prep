// Question: 8)Multilevel Inheritance
// Topic: OOPS
// Author: Anisha
// Date: 2025-06-13

class MultiLevelInheritance {
    public static void main(String[] args) {
       Children s=new Children();
       s.grandparentDetails();
       s.parentDetails();
       s.childDetails();
    }
}
class GrandParents{
    public void grandparentDetails(){
        System.out.println("GrandFather & GrandMother");
    }
}
class Parents extends GrandParents{
    public void parentDetails(){
        System.out.println("Father & Mother");
    }
}
class Children extends Parents{
    public void childDetails(){
        System.out.println("Children");
    }
}