package examples.super_sub_class;

public class Dog extends Animal {

    int uniqueSrno;
    String property1;
    String property2;

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public String getProperty2() {
        return property2;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }

    public int getUniqueSrno() {
        return uniqueSrno;
    }

    public void setUniqueSrno(int uniqueSrno) {
        this.uniqueSrno = uniqueSrno;
    }

    // If staticMethod() from superClass is public and subclass is private
    // then it will give following compile time error
    // staticMethod() in example.super.super_sub_class.Dog
    // cannot override staticMethod() in example.super_sub_class.Animal
    // attempting to assign weaker access privilleges; was public
    public static void staticMethod() {
        System.out.println("Static method of Dog");
    }

    public void bark() {
        System.out.println("I'm barking.....  ");
        System.out.println("I can access field of superclass : " + super.legs);
    }

    public Dog() {
    }

    public Dog(int legs) {
        // This super keyword will work as the class is extends Animal
        // otherwise it will give error with parameterized contstructor
        // and will work with default constructor 
        // like super()

        //Invocation of a superclass constructor must be the first 
        // line in the subclass constructor.

        super(legs);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;
        if (this.uniqueSrno != other.uniqueSrno) {
            return false;
        }
        if ((this.property1 == null) ? (other.property1 != null) : !this.property1.equals(other.property1)) {
            return false;
        }
        if ((this.property2 == null) ? (other.property2 != null) : !this.property2.equals(other.property2)) {
            return false;
        }
        return true;
    }
}
