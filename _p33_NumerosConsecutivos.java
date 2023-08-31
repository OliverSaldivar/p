import java.util.Scanner;

public class _p33_NumerosConsecutivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        System.out.println("Ingresa los números uno por uno:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        scanner.close();

        boolean sonConsecutivos = true;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] != numeros[i - 1] + 1) {
                sonConsecutivos = false;
                break;
            }
        }

        if (sonConsecutivos) {
            System.out.println("Los números son consecutivos.");
        } else {
            System.out.println("Los números no son consecutivos.");
        }
    }
}
