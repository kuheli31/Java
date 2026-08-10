package Lists1;

import java.util.Stack;

public class nStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Elephant");
        System.out.println("Animals Stack: " + animals);
        System.out.println("Top element: " + animals.peek());
        animals.pop();
        System.out.println("After pop, Animals Stack: " + animals);
        
    }
}

/*
OUTPUT:
Animals Stack: [Dog, Cat, Elephant] 
Top element: Elephant
After pop, Animals Stack: [Dog, Cat]
*/
