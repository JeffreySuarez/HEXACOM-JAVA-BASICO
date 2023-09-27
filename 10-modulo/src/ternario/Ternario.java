package ternario;

public class Ternario {

    public static void main(String[] args) {

        int x = 4;
        int y = 9;

        x = ((y / x) < 3) ? (x + y) : (x * y);

        System.out.println(x);
    }

}
