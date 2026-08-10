package Lists1;
//ArrayList in Java is a resizable array implementation of the List interface.

import java.util.ArrayList;
public class LearnArrayList 
{
    public static void main(String[] args) 
    {
    ArrayList<String> student = new ArrayList<>();
    student.add("John");
    student.add("Jane");

    System.out.println("Students: " + student);
    }
    
}

//OUTPUT:
//Students: [John, Jane]