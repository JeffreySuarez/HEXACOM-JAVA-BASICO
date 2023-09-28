package exercise9_2;

public class ShoppingCart {
    public static void main(String args[]){

        // Declare, instantiate, and initialize a Customer object
        Customer cust1 = new Customer("Jeffrey Suarez", 43);

	// Print the customer object name
        System.out.println("Customer name: "+cust1.getName() + " Tienes la edad de: " + cust1.getAge());
    }   
}
