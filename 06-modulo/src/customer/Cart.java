package customer;

public class Cart {
    public String item[] = { "red", "yellow" };
    public String date;
    public double total;

    public void addItem() {
        System.out.println("agregar item");
    }

    public void checkOut() {
        System.out.println("comprobante de pago");
    }

    public void cancel() {
        System.out.println("Item pagado");
    }
}
