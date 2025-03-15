class Example {

    static int x;

    Example() {

        x = 5;

    }

    public static void main(String[] args) {

        Example obj1 = new Example();

        Example obj2 = new Example();

        System.out.println(obj1.x + " " + obj2.x);

    }

}