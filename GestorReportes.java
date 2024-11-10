public class GestorReportes {
    
    GeneradorReporte generadorReporte;


    public GestorReportes(GeneradorReporte generadorReporte){

this.generadorReporte = generadorReporte;
    }



    public void generarReporte(String nombreReporte, String objetivoReporte, String informacionReporte){

generadorReporte.reportar(nombreReporte, objetivoReporte, informacionReporte);

    }
}
