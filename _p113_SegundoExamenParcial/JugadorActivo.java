package _p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
    private int partidos;
    private int goles;

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        this.partidos = partidos;
        this.goles = goles;
    }

    @Override
    public double getBono() {
        double bono = (getSalario() * 0.10) + (partidos * 50) + (goles * 5);
        return bono;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPartidos: " + partidos + "\nGoles: " + goles + "\nBono: " + getBono();
    }
    public double getTotal() {
        double Total = Salario + getBono();
        return Total;
    }
}
