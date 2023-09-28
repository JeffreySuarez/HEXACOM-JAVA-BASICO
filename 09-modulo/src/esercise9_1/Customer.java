package esercise9_1;

public class Customer {

    private String nombre;
    private int age;
   
    // Encapsulate this class.  Make ssn read only.
    
    public String getName(){
        return nombre;
    }
    public void setName(String n){
        nombre = n;
    }
    
    public int getAge(){
        return age;
    } 

    public void setAge(int a){
        age = a;
    }
    
}
