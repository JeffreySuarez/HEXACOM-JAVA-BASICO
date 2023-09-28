package encapsulamiento;

public class Customer {
    
    private String name;
    private int age;
    private boolean isClient;


    public Customer(){

        this.name = null;
        this.age = 34;
        this.isClient = false;
    }

    public Customer(String name, int age){
        this();
        this.name = name;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isClient() {
        return isClient;
    }

    public void setClient(boolean isClient) {
        this.isClient = isClient;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    public void PrintCustomer() {
        System.out.println("The Customer " + this.getName() + " " + this.getAge() + " " + this.isClient());
    }




}
