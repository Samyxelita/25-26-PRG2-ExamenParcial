public class Partido {
    private Fecha fecha;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesLocal;
    private int golesVisitante;
    private boolean estaJugado;

    public Partido(Equipo local, Equipo visitante, Fecha fecha) {
        assert local != visitante; 
        
        this.fecha = fecha;
        this.equipoLocal = local;
        this.equipoVisitante = visitante;
        
        this.golesLocal = 0;
        this.golesVisitante = 0;
        this.estaJugado = false;
    } 

    public void registrarResultado(int golesLocal, int golesVisitante)
    public boolean estaJugado()
    public void mostrar()
}

