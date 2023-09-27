package exercise6_2;

public class Item {

    public String nameCustomer = "Jeffrey Suarez";
    public String message;
    public int custID = 1205;
    public String address;
    public int orderNum;
    public int age;

    public void mostrarCustomer() {
        System.out.println("Este es el Item: " + nameCustomer);
    }

    public void mostrarMensaje() {
        System.out.println(message);
    }

}
