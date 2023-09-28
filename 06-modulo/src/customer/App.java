package customer;

public class App {

    public static void main(String[] args) {
        Customer customer01 = new Customer();
       // customer01.mostrarCustomer();
       // customer01.cart01.addItem();

        Customer[] customers = new Customer[3];

        for (Customer c : customers) {
            System.out.println(c);
        }

        customers[0] = new Customer();
        customers[1] = new Customer();
        customers[2] = new Customer();

        for (Customer c : customers) {
            System.out.println(c);
        }

       // customers[0].nameCustomer = "Diego";
       // customers[0].mostrarCustomer();

    }
}
