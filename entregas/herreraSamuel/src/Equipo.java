public class Equipo {

    private String nombre;
    private String color;
    private int cantidadJugadores;
    private int puntos;
    
    public Equipo(String nombre, String color, int cantidadJugadores) {
        assert cantidadJugadores > 0; 
        
        this.nombre = nombre;
        this.color = color;
        this.cantidadJugadores = cantidadJugadores;
        this.puntos = 0; 
    }
    
    public String nombre() { return ""; } 
    
    public String color() { return ""; }
    
    public int puntos() { return 0; }
    
    public void sumarPuntos(int puntos) {} 
    
    public void mostrar() {}
}