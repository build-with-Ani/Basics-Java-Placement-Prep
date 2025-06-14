// Question: 10)Method Overriding
// Topic: OOPS
// Author: Anisha
// Date: 2025-06-13

class MethodOverriding {
    public static void main(String[] args) {
       Animal a=new Animal();
       Dog d=new Dog();
       a.sound();
       d.sound();
    }
}
class Animal{
    public void sound(){
        System.out.println("makes sound");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("dog barks");
    }
}