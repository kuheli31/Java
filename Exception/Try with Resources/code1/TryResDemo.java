import java.io.*;

public class TryResDemo {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter Name:");
            String name = br.readLine(); // may throw IOException
            System.out.println("Hi " + name);
        } 
        // finally no longer needed
        System.out.println("Rest of the code follows...");
    }
}
