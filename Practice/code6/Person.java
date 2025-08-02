//1. Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

public class Person {
    String pname;
    int page;
    
    // Constructor to set attributes
    public Person(String name, int age) {
        pname = name;
        page = age;
    }
    
    // Method to display person details
    public void getPerson() {
        System.out.println("Name: " + pname + " Age: " + page);
    }
    
    public static void main(String[] args) {
        // Creating instances using constructor
        Person p1 = new Person("Kuheli", 21);
        p1.getPerson();
        
        Person p2 = new Person("Koyel", 14);
        p2.getPerson();
    }
}