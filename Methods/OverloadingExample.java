class OverloadingExample {
    // Method with one parameter
    static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 10));       // Calls method with 2 parameters
        System.out.println(add(5, 10, 15));   // Calls method with 3 parameters
    }
}
