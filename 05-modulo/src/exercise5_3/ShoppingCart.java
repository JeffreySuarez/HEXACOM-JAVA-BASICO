package exercise5_3;

public class ShoppingCart {
    public static void main(String[] args) {
        // local variables
        String nombreCliente = "Jeffrey Suárez";
        String message;
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        String items[];
        items = new String[4];
        items[0] = "mouse";
        items[1] = "teclado";
        items[2] = "monitor";
        items[3] = "tablet";
        message = nombreCliente + " quiere adquirir la cantidad de:  " + items.length + " articulos.";
        System.out.println(message);
        // Iterate through and print out the items from the items array
        System.out.println("Articulos comprados: ");
        for (String item : items) {
            System.out.print(item + ", ");
        }
    }
}