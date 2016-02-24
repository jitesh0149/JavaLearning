package examples.super_sub_class;

public class Execution {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        Animal d2 = new Dog();
        //Dog d3 = new Animal(); //Does not work gives compile time error incompitible type
        d1.bark();
        d2.eat();
        d1.staticMethod();
        d2.staticMethod();

        //d2.bark(); //Give error as bark() method does not exist in Animal
        //Checkout following................
        //1
        Object obj = new Animal(3);
        Animal a = (Animal) obj;
        System.out.println("" + a.legs);
        //2        
        Animal a1 = new Dog(4);
        System.out.println("" + a1.legs);
    }
}
