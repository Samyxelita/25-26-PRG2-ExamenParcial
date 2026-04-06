class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio){
        assert dia >= 1 && dia <= 31;
        assert mes >= 1 && mes <= 12;
        assert anio > 0;
        
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean esIgual(Fecha otraFecha){
       return (this.dia == otraFecha.dia) && 
               (this.mes == otraFecha.mes) && 
               (this.anio == otraFecha.anio);
    }
    public void mostrar(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.anio);
    }
}