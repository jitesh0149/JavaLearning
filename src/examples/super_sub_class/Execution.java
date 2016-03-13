package examples.super_sub_class;

public class Execution {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        Animal d2 = new Dog();
        //Dog d3 = new Animal(); //Does not work gives compile time error incompitible type
        //new Dog();   //This statement is also a valid statement
        d1.bark();
        d2.eat();
        d1.staticMethod();
        d2.staticMethod();
        
        //d2.bark(); //Give error as bark() method does not exist in Animal
        //Checkout following................
        //1
        Object obj = new Animal(3);
        Animal a1 = (Animal) obj;
        System.out.println("" + a1.legs);
        //2        
        Animal a2 = new Dog(4);
        System.out.println("" + a2.legs);
        //3
        Animal a3 = new Dog();
        a3.makeSound();
        //4
        Animal a4 = new Animal();
        a4.makeSound();
    }
}
/*Output 
I'm barking.....  
I can access field of superclass using (super.legs) : 0 or just legs (if same field is not ther in subclass) : 0
I'm eating.....
Static method of Dog
Static method of Animal
3
4
I'm barking.....  
I can access field of superclass using (super.legs) : 0 or just legs (if same field is not ther in subclass) : 0
Common Animal Sound
*/