import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAlumnos= 0;
        int totalDocentes = 0;
        int totalTrabajadores = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int totalDineroAlumnos = 0;
        int totalDineroDocentes = 0;
        int totalDineroTrabajadores = 0;
        int totalDineroGeneral = 0;
        int totalParticipantes = 0;
        int totalEdad = 0;

        while (true) {
            System.out.print("Ingrese el nombre del participante: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el sexo del participante (h/m): ");
            char sexo = scanner.nextLine().charAt(0);
            System.out.print("Ingrese la edad del participante: ");
            int edad = Integer.parseInt(scanner.nextLine());

            if (edad < 18) {
                System.out.println("Solo mayores de edad pueden participarchao bai");
                continue;
            }

            System.out.print("Ingrese el tipo de participante (Alumno/Docente/Trabajador): ");
            String tipoParticipante = scanner.nextLine();

            int costoInscripcion = 0;

            switch (tipoParticipante.toLowerCase()) {
                case "alumno":
                    costoInscripcion = 50;
                    totalAlumnos++;
                    totalDineroAlumnos += costoInscripcion;
                    break;
                case "docente":
                    costoInscripcion = 80;
                    totalDocentes++;
                    totalDineroDocentes += costoInscripcion;
                    break;
                case "trabajador":
                    costoInscripcion = 60;
                    totalTrabajadores++;
                    totalDineroTrabajadores += costoInscripcion;
                    break;
                default:
                    System.out.println("Tipo de participante no válido.");
                    continue;
            }

            if (sexo == 'h') {
                totalHombres++;
            } else if (sexo == 'm') {
                totalMujeres++;
            }

            totalParticipantes++;
            totalDineroGeneral += costoInscripcion;
            totalEdad += edad;

            System.out.print("¿Deseas registrar más participantes? (s/n): ");
            char mas = scanner.nextLine().charAt(0);

            if (mas == 'n') {
                break;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres en general: " + totalHombres);
        System.out.println("Total de Mujeres en general: " + totalMujeres);
        System.out.println("Total de todos los participantes: " + totalParticipantes);
        System.out.println("Promedio de la edad de todos los participantes: " + (totalEdad / totalParticipantes));

        System.out.println("\n--- Totales de Dinero ---");
        System.out.println("Total dinero recaudado de Alumnos: " + totalDineroAlumnos);
        System.out.println("Total dinero recaudado de Docentes: " + totalDineroDocentes);
        System.out.println("Total dinero recaudado de Trabajadores: " + totalDineroTrabajadores);
        System.out.println("Total dinero en general: " + totalDineroGeneral);

        System.out.println("\n--- Mensaje final ---");
        if (totalDineroGeneral < 100) {
            System.out.println("El evento concluye con ganancias BAJAS");
        } else if (totalDineroGeneral < 200) {
            System.out.println("El evento concluye con ganancias MODERADAS");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias");
        }
    }
}