package loops;

public class Loops {
    public static void main(String[] args) {

        int[] numeros = { 2, 5, 7, 8, 2, 3, 5, 7 };
        String[] names = { "george", "jill", "xinyi", "ravi" };
        double[] numDouble = new double[5];

        System.out.println("***********************Exercise with numbers************************");
        int suma = 0;

        for (int numero : numeros) {

            suma = suma + numero;

        }
        System.out.println("La sumatoria es :" + suma);

        System.out.println("**************************Exercise with string*********************");

        for (String name : names) {
            System.out.println("Name is " + name);
        }

        System.out.println("************************Exercise with new double***********************");

        numDouble[0] = 5.25;
        numDouble[1] = 7.23;
        numDouble[2] = 4.2;
        numDouble[3] = 1.0;
        numDouble[4] = 8.3;

        double producto = 1;

        for (double num : numDouble) {
            producto = producto * num;
            System.out.println("Producto: " + producto + " Número: " + num);

            if (producto > 100) {
                break;
            }
        }
        System.out.println("La productoria es: " + producto);

    }
}
