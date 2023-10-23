package _p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String liga;
    private ArrayList<Jugador> jugadores;

    public Equipo() {
        jugadores = new ArrayList<Jugador>();
    }

    public Equipo(String nombre, String liga) {
        this.nombre = nombre;
        this.liga = liga;
        jugadores = new ArrayList<Jugador>();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : jugadores) {
            total += jugador.getTotal();
        }
        return total;
    }

    public int getTotalH() {
        int totalHombres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getSexo() == 'H') {
                totalHombres++;
            }
        }
        return totalHombres;
    }

    public int getTotalM() {
        int totalMujeres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getSexo() == 'M') {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }

    public void reporte() {
        System.out.println("Reporte del Equipo: " + nombre);
        System.out.println("Liga: " + liga);
        System.out.println("Total de Jugadores: " + jugadores.size());
        System.out.println("Total de Bono: " + getTotalBono());
        System.out.println("Total de Totales: " + getTotal());
        System.out.println("Total de Hombres: " + getTotalH());
        System.out.println("Total de Mujeres: " + getTotalM());
        System.out.println(">> " + jugadores);
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre + "\nLiga: " + liga + "\nTotal de Jugadores: " + jugadores.size() + "\nTotal de Bono: " + getTotalBono() + "\nTotal de Totales: " + getTotal() + "\nTotal de Hombres: " + getTotalH() + "\nTotal de Mujeres: " + getTotalM();
    }
}
