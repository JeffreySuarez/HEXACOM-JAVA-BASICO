package exercise5_2;

public class Arreglos {

    public static void main(String[] args) {
        // Variables locales
        String nombreCliente = "Jeffrey Suárez";
        String message = nombreCliente + " quieres comprar varios articulos.";

        // Declarar y initializar los articulos del String array
        String[] items = { "mouse", "teclado", "motherBoard", "panel" };

        // cambiar el mensaje.
        message = nombreCliente + " ha comprado " + items.length + " articulos.";
        System.out.println(message);

        // Imprimir un elemento.

        System.out.println(items[2]);
        System.out.println(items[3]);
    }
}
