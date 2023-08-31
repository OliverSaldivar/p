import java.util.Scanner;

public class _p34_NumeroMayor {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();

         System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

         System.out.print("Ingresa el tercer numero: ");
        int num3 = scanner.nextInt();

        scanner.close();
        
        if (num1>num2 && num1>num3){
            System.out.println("el numero " +num1+  " es el mayor");
        }
        else if (num2>num1 && num2>num3){
            System.out.println("el numero " +num2+ " es el mayor");

        }
        else if (num3>num1 && num3>num2){
            System.out.println("el numero "+num3+" es el mayor");

        }
    }
}
