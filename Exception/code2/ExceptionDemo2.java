//Declaring IO Exception
import java.io.*;

public class ExceptionDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter your name: ");
        String name = br.readLine(); // it reads a line of text

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.println(name + " " + age);
    }
}
