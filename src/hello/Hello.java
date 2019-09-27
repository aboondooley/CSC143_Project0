package hello;

public class Hello {
    /* YOUR CODE HERE */
    String name = name;

    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.greeting());

        Hello named = new Hello("There");
        System.out.println(named);
        System.out.println("General Kenobi!");
    }

    // Consutructor
    public Hello() {
        return ("Hello, World!");
    }

    //Constructor
    public Hello(String name) {
        return ("Hello, " + name + "!");
    }

    public String greeting() {
        /* YOUR CODE HERE */
    }

    public String toString() {
        /* YOUR CODE HERE */
    }
}
