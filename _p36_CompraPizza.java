// Calcula fuerza, masa, y aceleración de acuerdo a la segunda ley de newton

import java.util.Scanner;

import javax.rmi.CORBA.Stub;

public class _p36_CompraPizza {
    public static void main(String[] args) {
        float p, m, t, d;
        char op;
        Scanner obj = new Scanner(System.in);

        System.out.println("pedido de pizza");

        System.out.println("[C]hica ");
        System.out.println("[M]ediana");
        System.out.println("[G]rande ");
        System.out.print("Elije una opcion ? ");
        op = Character.toUpperCase(obj.next().charAt(0));

        m=0;
        p=0;
        t=0;
        d=0;
        if (op == 'C') {
                System.out.println("\nPizza chica");
                System.out.print("Cuantas pizzas quieres ? ");
                m = obj.nextFloat();
                p = m*5;
                if (p>2000){
                   t=p*0.85;
                   d=p*0.15;
                    System.out.println("Usted esta comparando pizzas chicas\n");
                    System.out.println("Esta comprando" +m+ "pizzas");
                    System.out.println("El total de su sin descuento es" +p);
                    System.out.println("Su descuento es de" +d);
                    System.out.println("Su total es de" +t);
                }
                else if (p<2000){
                   d=0;
                   t=p;
                    System.out.println("Usted esta comparando pizzas chicas\n");
                    System.out.println("Esta comprando" +m+ "pizzas");
                    System.out.println("El total de su compra sin descuento es" +p);
                    System.out.println("Su descuento es de" +d);
                    System.out.println("Su total es de" +t);
                }
            }
        else if (op == 'M') {
                System.out.println("\nPizza Mediana");
                System.out.print("Cuantas pizzas quieres ? ");
                m = obj.nextFloat();
                p = m*10;
                if (p>2000){
                   t=p*0.85;
                   d=p*0.15;
                    System.out.println("Usted esta comparando pizzas medianas\n");
                    System.out.println("Esta comprando" +m+ "pizzas");
                    System.out.println("El total de su sin descuento es" +p);
                    System.out.println("Su descuento es de" +d);
                    System.out.println("Su total es de" +t);
                }
                else if (p<2000){
                   d=0;
                   t=p;
                    System.out.println("Usted esta comparando pizzas medinas\n");
                    System.out.println("Esta comprando" +m+ "pizzas");
                    System.out.println("El total de su compra sin descuento es" +p);
                    System.out.println("Su descuento es de" +d);
                    System.out.println("Su total es de" +t);
                }
            }
        else if (op == 'G') {
                System.out.println("\nPizza Grande");
                System.out.print("Cuantas pizzas quieres ? ");
                m = obj.nextFloat();
                p = m*15;
                if (p>2000){
                    t=p*0.85;
                    d=p*0.15;
                    System.out.println("Usted esta comparando pizzas grandes\n");
                    System.out.println("Esta comprando" +m+ "pizzas");
                    System.out.println("El total de su sin descuento es" +p);
                    System.out.println("Su descuento es de" +d);
                    System.out.println("Su total es de" +t);
                }
                else if (p<2000){
                   d=0;
                    t=p;
                    System.out.println("Usted esta comparando pizzas grandes\n");
                    System.out.println("Esta comprando" +m+ "pizzas");
                    System.out.println("El total de su compra sin descuento es" +p);
                    System.out.println("Su descuento es de" +d);
                    System.out.println("Su total es de" +t);
                }        
            }
        else{
        System.out.println("\nOpcion Invalida \n");
        obj.close();
        }
    }
}

        
   
