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

    public void registrarResultado(int golesLocal, int golesVisitante){
        assert golesLocal >= 0 && golesVisitante >= 0;
        assert !this.estaJugado; 

        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.estaJugado = true;

        if (this.golesLocal > this.golesVisitante) {
            this.equipoLocal.sumarPuntos(3);
        } else if (this.golesLocal < this.golesVisitante) {
            this.equipoVisitante.sumarPuntos(3);
        } else {
            this.equipoLocal.sumarPuntos(1);
            this.equipoVisitante.sumarPuntos(1);
        }
    }

    public boolean estaJugado(){
        return this.estaJugado;
    }
    public void mostrar(){
        if (this.estaJugado) {
            System.out.println("Resultado: " + this.equipoLocal.nombre() + " " + 
                               this.golesLocal + " - " + this.golesVisitante + 
                               " " + this.equipoVisitante.nombre());
        } else {
            System.out.print("Partido pendiente para la fecha: ");
            this.fecha.mostrar(); 
            System.out.println(this.equipoLocal.nombre() + " vs " + this.equipoVisitante.nombre());
        }
    }
}

