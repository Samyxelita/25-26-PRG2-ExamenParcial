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
   public void agregarEquipo(Equipo equipo) {
    assert this.numeroDeEquipos < this.equipos.length;
        this.equipos[this.numeroDeEquipos] = equipo;
        this.numeroDeEquipos++;
   }
    
    public void programarPartido(Partido partido) {
        assert this.numeroDePartidos < this.partidos.length;
        this.partidos[this.numeroDePartidos] = partido;
        this.numeroDePartidos++;
    }
    
    public void registrarResultado(Partido partido, int golesLocal, int golesVisitante) {
        assert golesLocal >= 0 && golesVisitante >= 0;
        partido.registrarResultado(golesLocal, golesVisitante);
    }
    
    public void consultarClasificacion() {}
    
    public void consultarPartidosPendientes() {}

    
}