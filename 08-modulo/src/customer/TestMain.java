package customer;

public class TestMain {

    public static void main(String[] args) {
        

        //definimos dos instancias de Customer
        Customer customer1 = new Customer();
        customer1.name = "Jeffrey A. Suarez";
        customer1.age = 45;

        customer1.PrintCustomerInformation();

        Customer customer2 = new Customer("Pedro", 32);
        customer2.PrintCustomerInformation();

    }
    
}
