package _p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {
    private int Subordinados;
    private int Proyectos;

    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados,
            int proyectos) {
        super(nombre, sexo, descripcion, salario);
        Subordinados = subordinados;
        Proyectos = proyectos;
    }

    public int getSubordinados() {
        return Subordinados;
    }
    public void setSubordinados(int subordinados) {
        Subordinados = subordinados;
    }
    public int getProyectos() {
        return Proyectos;
    }
    public void setProyectos(int proyectos) {
        Proyectos = proyectos;
    }
    
    @Override
    public double getBono() {
        double bono = (Salario * 0.15) + (Proyectos * 100) + (Subordinados * 10);
        return bono;
    }

    public double getTotal() {
        double Total = Salario + getBono();
        return Total;
    }
    
    @Override
    public String toString() {
        return "JugadorEntrenador [Subordinados=" + Subordinados + ", Proyectos=" + Proyectos + "]";
    }
    
}
