package exercise9_2;

public class Customer {
    private String nombre;
    private int age;
   
    //Add a custom constructor
    public Customer(String nombre, int age){
        this.nombre = nombre;
        this.age = age;
    }
    
    public String getName(){
        return nombre;
    }
    public void setName(String n){
        nombre = n;
    }
    
    public int getAge(){
        return age;
    }
}
