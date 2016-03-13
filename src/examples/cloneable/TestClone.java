package examples.cloneable;

class TestClone implements Cloneable {
//if Cloneable is not implemented then it will throw the Exception

    int a;
    double b;
// This method calls Object's clone(). 

    TestClone cloneTest() {
        try {
// call clone in Object. 
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not allowed.");
            return new TestClone();
        }
    }
}
