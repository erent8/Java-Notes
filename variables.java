public class Main {
    public static void main(String[] args) {
        String name = "Eren";
        System.out.println("Hello " + name);
        String firstname = "Eren";
        String lastname = " Terzi";
        String fullname = firstname + lastname;
        System.out.println(fullname);

        int x = 521;
        int y = 611;
        System.out.println(x + y); // Print the value of x + y

        int a = 53;
        int b = 61;
        int c = 50;
        System.out.println(a + b + c);

        int q = 5, w = 6, e = 50;
        System.out.println(q + w + e);

        int f, d, g;
        f = d = g = 50;
        System.out.println(f + d + g);

        /* Identifiers
        All Java variables must be identified with unique names.

                These unique names are called identifiers.

                Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).

        Note: It is recommended to use descriptive names in order to create understandable and maintainable code: */
        // Good
        int minutesPerHour = 60;

// OK, but not so easy to understand what m actually is
        int m = 60; 

    }
}
