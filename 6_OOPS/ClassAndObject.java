// Question: 1)Class And Object
// Topic: OOPS
// Author: Anisha
// Date: 2025-06-13

class ClassAndObject {
    public static void main(String[] args) {
       SecondClass s=new SecondClass();
       String s1="Class";
       s.subMethod(s1);
    }
}
class SecondClass{
    public void subMethod(String s1){
        System.out.println(s1);
    }
}