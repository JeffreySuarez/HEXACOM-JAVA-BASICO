package staticMetod;

public class Calculos {

    public static final int MODULO_SUMA = 1;

     //Vamos a definir dos metodos estaticos

        public static int suma (int x, int y){
            int suma = x + y;
            return suma;
        };

        public static int resta (int x, int y){
            return x - y;
        }

        public int multiplicacion(int x, int y){
            return x * y;
        }

        public int getMODULO(){
            suma(1, 3);
            return MODULO_SUMA;
        }

    public static void main(String[] args) {
        
    }
    
}
