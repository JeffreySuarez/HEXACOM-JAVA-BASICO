package customer;

public class Customer {

    public String nameCustomer = "Jeffrey Suarez";
    public int custID = 1205;
    public String address;
    public int orderNum;
    public int age;
    public boolean isClient;

    Cart cart01 = new Cart();

    public void mostrarCustomer() {
        System.out.println("Customer: " + nameCustomer + " - " + age + " - " + isClient);
    }
}
