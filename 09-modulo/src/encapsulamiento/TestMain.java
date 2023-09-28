package encapsulamiento;

public class TestMain {
    

    public static void main(String[] args) {
        Customer client1 = new Customer();
        client1.setName("Gustavo");
        client1.setAge(45);
        client1.setClient(true);
    
        client1.PrintCustomer();

    }


}
