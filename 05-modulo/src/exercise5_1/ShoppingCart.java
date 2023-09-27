package exercise5_1;

public class ShoppingCart {
    public static void main(String[] args) {
        String nombreCliente = "Jeffrey Suárez";
        String description = "PC Gamer";
        // numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        String message = nombreCliente + " wants to purchase " + quantity + " " + description;
        // Calculating total cost
        total = (price * quantity) * tax;
        // Declare outOfStock variable and initialize it
        boolean outOfStock = true;
        // Test quantity and modify message if quantity > 1.
        if (quantity > 1) {
            message = message + "s";
        }
        // Test outOfStock and notify user in either case.
        if (outOfStock) {
            System.out.println(description + " no se encuentra en el stock.");
        } else {
            System.out.println(message);
            System.out.println("Costo Total con tax es de: " + total);
        }
    }
}
