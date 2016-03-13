package examples.super_sub_class;

public class Dog extends Animal {

    //<editor-fold defaultstate="collapsed" desc="Properties (Fiels)">
    int uniqueSrno;
    String property1;
    String property2;
    //int legs=2; (This is valid)
    //String legs="5"; (This is valid)

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
//</editor-fold>

    @Override
    public void makeSound() {
        bark();
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
        System.out.println("I can access field of superclass using (super.legs) : " +
                super.legs + " or just legs (if same field is not ther in subclass) : " + legs);
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
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.uniqueSrno;
        return hash;
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
        return this.uniqueSrno == other.uniqueSrno;
    }

}
