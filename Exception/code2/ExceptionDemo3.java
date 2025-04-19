import java.io.*;

public class ExceptionDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter your name: ");
            String name = br.readLine(); // it reads a line of text

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(br.readLine());

            System.out.println(name + " " + age);
        } finally {
            // Cleanup or final message
            br.close();  // Optional, but good practice
            System.out.println("Execution completed.");
        }
    }
}
