public class ReportePDF implements GeneradorReporte {

    @Override
    public void reportar(String nombreReporte, String objetivoReporte, String informacionReporte) {
        System.out.println("El siguiente reporte esta en formato PDF. ");
        System.out.println("Nombre del reporte: " + nombreReporte);
        System.out.println(" El objetivo de este reporte es: " + objetivoReporte);
        System.out.println("es de fundamental importancia informar:"
                + informacionReporte);
    }

    
}
