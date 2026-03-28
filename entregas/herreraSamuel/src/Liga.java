public class Liga {
    private String nombre;
    private String temporada; 
    private Equipo[] equipos;
    private Partido[] partidos;
    private int numeroDeEquipos;
    private int numeroDePartidos;


    public Liga(String nombre, String temporada){
        assert nombre != null && !nombre.isEmpty();
        assert temporada != null && !temporada.isEmpty();
        
        this.nombre = nombre;
        this.temporada = temporada;
        
        this.equipos = new Equipo[20];
        this.partidos = new Partido[380];
        
        this.numeroDeEquipos = 0;
        this.numeroDePartidos = 0;
    }
   public void agregarEquipo(Equipo equipo) {}
    
    public void programarPartido(Partido partido) {}
    
    public void registrarResultado(Partido partido, int golesLocal, int golesVisitante) {}
    
    public void consultarClasificacion() {}
    
    public void consultarPartidosPendientes() {}

    
}