public class GestorReportes implements GeneradorReporte {
    
    GeneradorReporte generadorReporte;


    public GestorReportes(GeneradorReporte generadorReporte){

this.generadorReporte = generadorReporte;
    }



    public void generarReporte(String nombreReporte, String objetivoReporte, String informacionReporte){


    }



    @Override
    public void reportar(String nombreReporte, String objetivoReporte, String informacionReporte) {
        generadorReporte.reportar(nombreReporte, objetivoReporte, informacionReporte);

    }
}
