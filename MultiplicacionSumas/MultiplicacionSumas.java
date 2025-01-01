import java.util.Scanner;

public class MultiplicacionSumas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa el numero que deseas multiplicar");
        int numMultiplicar = sc.nextInt();

        System.out.println("ingresa el numero de veces que quieres que se multiplique:");
        int numVecesMultiplicar = sc.nextInt();

        multiplicacionSumas(numMultiplicar, numVecesMultiplicar);

        sc.close();
    }

    public static void multiplicacionSumas(int numMultiplicar, int numVecesMultiplicar) {
        int resultado = 0;

        if (numMultiplicar < 0 ^ numVecesMultiplicar < 0) {

            numMultiplicar = Math.abs(numMultiplicar);
            numVecesMultiplicar = Math.abs(numVecesMultiplicar);

            for (int i = 0; i < numVecesMultiplicar; i++) {
                resultado = numMultiplicar + resultado;
            }
            System.out.println("el resultado es:" + resultado * (-1));

        } else if (numMultiplicar > 0 && numVecesMultiplicar > 0) {

            for (int i = 0; i < numVecesMultiplicar; i++) {
                resultado = numMultiplicar + resultado;
            }
            System.out.println("el resultado es: " + resultado);

        } else if (numMultiplicar < 0 && numVecesMultiplicar < 0) {

            numMultiplicar = Math.abs(numMultiplicar);
            numVecesMultiplicar = Math.abs(numVecesMultiplicar);

            for (int i = 0; i < numVecesMultiplicar; i++) {
                resultado = numMultiplicar + resultado;
            }
            System.out.println("el resultado es:" + resultado);
        }
    }
}
