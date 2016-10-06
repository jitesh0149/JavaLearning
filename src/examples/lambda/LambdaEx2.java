package examples.lambda;

import java.util.*;

public class LambdaEx2 {

    static public List<Person> roster;

    public static void main(String[] args) {
        roster = new ArrayList<Person>();
        roster.add(new Person("User-1", Person.Sex.MALE, 26));
        roster.add(new Person("User-2", Person.Sex.MALE, 25));
        /*printPersons(roster,
                (Person p) -> p.getGender() == Person.Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25);*/
    }

    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

}
/*
class Person {

    public enum Sex {

        MALE, FEMALE
    }

    String name;
    Sex gender;
    String emailAddress;
    int age;

    public Person(String name, Sex sex, int age) {
        this.name = name;
        this.gender = sex;
        this.age = age;
    }

    public Sex getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public void printPerson() {
        System.out.println("Age of " + this.name + " is " + this.age);
    }
}

interface CheckPerson {

    boolean test(Person p);
}
*/