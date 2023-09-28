package exercise8_1;

public class ShoppingCart {

    public static void main(String[] args){
        SetColor item1 = new SetColor();
        
        // Call the setColor method on item1. Print an appropriate message, 
	//  depending upon the return value.

        if (item1.setColor('B')){
            System.out.println("Item1.color = "+item1.color);
        }else System.out.println("Invalid color");
    }
    
}
