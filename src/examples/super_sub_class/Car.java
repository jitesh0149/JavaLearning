package examples.super_sub_class;

public class Car extends Vehicle {

    Integer noOfSheets;

    public Integer getNoOfSheets() {
        return noOfSheets;
    }

    @Override
    public String getDetail() {
        return " Car Name : " + name + ". Weight is : " + weight + ". No of sheets : " + noOfSheets;
    }
 
    public Car() {
    }

    public Car(Integer noOfSheets, String name, String weight) {
        super(name, weight);
        this.noOfSheets = noOfSheets;
    }
}
