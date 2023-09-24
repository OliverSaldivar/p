import java.util.Scanner;

public class _p76_DiaSemana {

    public static String ObtenerDiaSemana(int numero) {
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        if (numero >= 1 && numero <= 7) {
            return diasSemana[numero - 1];
        } else {
            return "Número fuera de rango, por favor ingresa un número entre 1 y 7.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número entre 1 y 7: ");
            int numero = scanner.nextInt();
            String diaSemana = ObtenerDiaSemana(numero);
            System.out.println("El día de la semana con el numero " + numero + " es: " + diaSemana);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero válido.");
        }
    }
}