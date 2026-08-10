package Lists1;
//Lists is an interface in Java that represents an ordered collection 
//(also known as a sequence) of elements.
import java.util.ArrayList;
import java.util.List;
public class LearnLists {
	public static void main(String[] args) 
    {
        List<Integer> student = new ArrayList<>();
        student.add(1);
        student.add(2);
        System.out.println("Students: " + student);

        student.add(1, 3); // Adding at specific index
        System.out.println("After adding Doe at index 1: " + student);

        //creating new list to store student list
        System.out.println("Creating new list to store student list");
        List<Integer> newStudentList = new ArrayList<>(student);
        newStudentList.add(4);
        newStudentList.add(5);
        System.out.println("New Student List: " + newStudentList);

        //using addall() method to add all elements of student list to newStudentList
        newStudentList.addAll(student);
        System.out.println("After adding all elements of student list to newStudentList: " + newStudentList);

        //get() method to access elements
        System.out.println(newStudentList.get(2));

        //remove() method to remove elements
        newStudentList.remove(2);
        System.out.println(newStudentList);

        newStudentList.remove(Integer.valueOf(3));//removing by value
        System.out.println(newStudentList);

        //size() method to get the size of the list
        System.out.println(newStudentList.size());

        //clear() method to clear the list
        //newStudentList.clear();
        //System.out.println(newStudentList.size());

        //set() method to update elements
        student.set(0, 10);
        System.out.println("After updating index 0 to 10: " + student);

        //contains() method to check if an element is present
        System.out.println("Does student list contain 2? " + student.contains(2));

    }
}
//OUTPUT:
//Students: [1, 2]
//After adding Doe at index 1: [1, 3, 2]
//Creating new list to store student list
//New Student List: [1, 3, 2, 4, 5]
//After adding all elements of student list to newStudentList: [1, 3, 2, 4, 5, 1, 3, 2]
//3
//[1, 2, 4, 5, 1, 3, 2]
//7
