public class MainReportes {
    public static void main(String[] args) {
        

GeneradorReporte ReporteExcel = new ReporteExcel();
GestorReportes gestorReportes = new GestorReportes(ReporteExcel);
gestorReportes.reportar("Renuncia trabajo",
 "Expresar mi renuncia formal a este trabajo", 
"Se que es dificil, pero no hay condiciones laborales justas");

System.out.println("");

GeneradorReporte ReportePDF = new ReportePDF();
gestorReportes = new GestorReportes(ReportePDF);
gestorReportes.reportar("Asistencia Estudiantes",
 "Listar a los estudiantes que asistieron", 
"laura, gabriel, valentina, juan");

    }
}
