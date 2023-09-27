package exercise2;

public class ExerciseOperator {
    public static void main(String[] args) {
        String name = "Jeffrey Suárez";
        String description = "PC gamer";
        String message = name + " adquiriste el siguiente item:  " + description;
        // Declare and initialize numeric fields: price, tax, quantity, and total
        // Do not initialize total.
        double price = 29.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        // Modify message to include quantity.
        message = name + " compro la cantidad de:  " + quantity + " " + description;
        System.out.println(message);
        // Calculate total and then print the total cost.
        total = quantity * price * tax;
        System.out.println("El costo total con tax fue de: " + total);

        int c = 25 - 5 * 4 / 2 - 10 + 4;
        System.out.println(c);

        int a = (((25 - 5) * 4) / (2 - 10)) + 4;
        int b = ((20 * 4) / (2 - 10)) + 4;
        int d = (80 / (2 - 10)) + 4;
        int e = (80 / -8) + 4;
        int f = -10 + 4;
        int g = -6;
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }
}
