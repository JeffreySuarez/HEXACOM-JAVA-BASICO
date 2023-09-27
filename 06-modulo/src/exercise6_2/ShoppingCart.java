package exercise6_2;

public class ShoppingCart {
    public static void main(String[] args) {

        Item item01 = new Item();
        Item item02 = new Item();

        item01.message = "Este es el mensaje de la primera instancia";
        item02.message = "Este es el mensaje de la segunda instancia";

        item01.mostrarMensaje();
        item02.mostrarMensaje();

    }
}
