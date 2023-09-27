package text;

public class textMain {

    public static void main(String args[]) {

        String texto = "Texto de prueba ";

        System.out.println("Longitud: " + texto.length());
        System.out.println("Concatenación:  " + texto.concat(" otra cadena de texto"));
        System.out.println("SubCadena: " + texto.substring(1, 5));
        System.out.println("Minúscula: " + texto.toLowerCase());
        System.out.println("Mayúscula: " + texto.toUpperCase());
        System.out.println("Carácter 7: " + texto.charAt(7));
        System.out.println("Esta vacío: " + texto.isEmpty());

        String phoneNum = "404-543-2345";
        int idx1 = phoneNum.indexOf('-');
        System.out.println("index of first dash: " + idx1);

        int idx2 = phoneNum.indexOf('-', idx1 + 1);
        System.out.println("second dash idx: " + idx2);

        // Ejercicio 7.1
        String cliente = "Fernando Herrera";

        int buscandoEspacio = cliente.indexOf(" ");
        String primerNombre = cliente.substring(0, buscandoEspacio);
        System.out.println("******************  Exercise 7 - 1 ******************");
        System.out.println(primerNombre);
        System.out.println("************************************");

        // Ejercicio 7.2

        System.out.println("******************  Exercise 7 - 2 ******************");
        StringBuilder firstName = new StringBuilder("Jeffrey");
        // OR
        StringBuilder otherFirstName = new StringBuilder(primerNombre);
        System.out.println(otherFirstName);

        System.out.println("************************************");

        // valores primitivos
        byte myByte = 123;
        char myChar = 'a';

        // el final se usa para constantes dejar una variable fija
        final String valorFijo = "Esta es una variable fija no es fluctuante";

        // operadores numericos

        // operador modulo devuelve el residuo de una division
        int num1 = 4;
        int num2 = 6;
        int mod = num1 % num2;
        System.out.println(mod);

        System.out.println(myByte++);
        System.out.println(++myByte);

        // autoincrementacion

        long intToLong = 6;
        double intToDouble = 3;

        System.out.println(intToLong);
        // Ejercicio 7.3

        byte numero1 = 3;
        byte numero2 = 20;

        // byte suma = numero1 + numero2; --> da error al copilar

        // usando cast
        byte suma1 = (byte) (numero1 + numero2);

        System.out.println("******************  Exercise 7 - 3 ******************");
        System.out.println("La suma es: " + suma1);
        System.out.println("************************************");

    }

}
