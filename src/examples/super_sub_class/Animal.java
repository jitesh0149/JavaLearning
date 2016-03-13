package examples.super_sub_class;

public class Animal {

    int legs;

    public void eat() {        
        System.out.println("I'm eating.....");
    }

    public void makeSound() {
        System.out.println("Common Animal Sound");
    }

    public static void staticMethod() {
        System.out.println("Static method of Animal");
    }

    public Animal(int legs) {
        this.legs = legs;
    }

    public Animal() {
    }
}
