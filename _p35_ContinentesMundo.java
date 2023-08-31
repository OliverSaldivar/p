import java.util.Scanner;
public class _p35_ContinentesMundo {
    public static void main(String[] args) {
        System.out.println("Dado un numero entre 1 y 6 imprime el continente\n");
        System.out.print("Dame el numero de continente\n");
        int dia = new Scanner(System.in).nextInt();
        switch (dia) {
            case 1 : System.out.println("El continente que seleccioneste es Asia");break;
            case 2 : System.out.println("El continente que seleccioneste es Africa");break;
            case 3 : System.out.println("El continente que seleccionaste es America del norte");break;
            case 4 : System.out.println("El continente que seleccionaste es America del sur");break;
            case 5 : System.out.println("El continente que seleccionaste es Antartida");break;
            case 6 : System.out.println("Europa");break;
            default : System.out.println("Numero invalido, jiji no sabe cuantos continentes hay");break;
        }
        
    }
}
