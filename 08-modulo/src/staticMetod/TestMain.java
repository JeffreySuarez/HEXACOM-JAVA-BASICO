package staticMetod;

public class TestMain {

    public static void main(String[] args) {
        int a = 10, b =5;

        Calculos calculo = new Calculos();

        System.out.println("Suma: " + Calculos.suma(a, b));
        System.out.println("Resta: " + Calculos.resta(a, b));
        System.out.println("Multiplicacion: " + calculo.multiplicacion(a, b));
        System.out.println("Constante: " + calculo.MODULO_SUMA);
        System.out.println("Constante2: " + Calculos.MODULO_SUMA);
        System.out.println("Constante3: " + calculo.getMODULO());


        System.out.println("PI: " + Math.PI);
        System.out.println("Potencia: " + Math.pow(2, 5));
        System.out.println("Raiz: " + Math.sqrt(8));
        System.out.println("Maximo: " + Math.max(30, 50));
        

    }
    
}
