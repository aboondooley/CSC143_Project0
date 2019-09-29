package hello;

public class Hello {
    // This class creates a Hello object which can store a name and then greet this name or the world.

    // There is only one field, the name to be greeted.
    private String greetMe;

    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.greeting());

        Hello named = new Hello("There");
        System.out.println(named);
        System.out.println("General Kenobi!");
    }

    public Hello() {
        // Here is our first constructor, used if no name is given
      greetMe = "World";
    }

    public Hello(String inputName) {
        // Second constructor, overrides the first when a name is given
        greetMe = inputName;
    }

    // instance methods
    public String greeting() {
        // This instance method prints a greeting using the either the input name or the world
        return ("Hello, " + greetMe + "!");
    }

    @Override
  public String toString() {
        // This instance method prints the same greeting as the greetings function for the custom toString() method
        return greeting();
    }
}
