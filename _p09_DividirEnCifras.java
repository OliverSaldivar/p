import java.util.Scanner;

public class _p09_DividirEnCifras {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        
        int num, unidades, decenas, centenas;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dame un número entero de 3 cifras: ");
        num = scanner.nextInt();
        
        centenas = num / 100;
        decenas = (num - centenas * 100) / 10;
        unidades = num - (centenas * 100 + decenas * 10);
        
        System.out.println("El número introducido fue: " + num);
        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);
        
        scanner.close();
    }
}