package customer;

public class Customer {

    //Definiendo las variables
        public String name;
        public int age;
        public boolean isClient;

        public Customer() {

            this.name = "Jeffrey Suarez";
            this.age = 43;
            this.isClient = true;
         
        };


        public Customer(String name, int age) {

            this();//con este metodo llamo a mi constructor por defecto.        
            this.name = name;
            this.age = age;


        }

        public void PrintCustomerInformation(){

            System.out.println("Customer " + this.name + " tiene la edad de: " + this.age );

        }
}
