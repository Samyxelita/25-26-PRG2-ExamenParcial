public class ClienteLiga {
   
    public static void main(String[] args) {
        Liga ligaNacional = new Liga("Liga Nacional", "2025-2026");

        Equipo equipoLocal = new Equipo("Real Madrid", "Blanco", 25);
        Equipo equipoVisitante = new Equipo("FC Barcelona", "Azulgrana", 24);

        ligaNacional.agregarEquipo(equipoLocal);
        ligaNacional.agregarEquipo(equipoVisitante);

        Fecha fechaPartido = new Fecha(10, 4, 2026);
    
        Partido elClasico = new Partido(equipoLocal, equipoVisitante, fechaPartido);
        ligaNacional.programarPartido(elClasico);

        System.out.println("\n--- ANTES DE LA JORNADA ---");
        ligaNacional.consultarPartidosPendientes();

        ligaNacional.registrarResultado(elClasico, 2, 1);

        System.out.println("\n--- DESPUÉS DE LA JORNADA ---");
        ligaNacional.consultarPartidosPendientes();

        ligaNacional.consultarClasificacion();
    
}
    
}
