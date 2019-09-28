package hello;

public class Hello {
    /* YOUR CODE HERE */
    // field
    private String name;

    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.greeting());

        Hello named = new Hello("There");
        System.out.println(named);
        System.out.println("General Kenobi!");
    }

    // Consutructor
    public Hello() {
        // I am not sure about this one
    }

    //Constructor
    public Hello(String inputName) {
        String name = inputName;
    }

    public String greeting() {
        /* YOUR CODE HERE */
    }

    public String toString() {
        /* YOUR CODE HERE */
    }
}
