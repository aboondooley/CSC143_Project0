package hello;

public class Hello {
    /* YOUR CODE HERE */
    // field
    private String greetMe;

    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.greeting());

        Hello named = new Hello("There");
        System.out.println(named);
        System.out.println("General Kenobi!");
    }

    // Consutructor
    public Hello() {
      String greetMe = "World";
    }

    //Constructor
    public Hello(String inputName) {
        String greetMe = inputName;
    }

    public String greeting() {
        /* YOUR CODE HERE */
        return "Hello, " + greetMe + "!";
    }

    public String toString() {
        return greeting();
    }
}
