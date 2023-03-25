import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Examen1 resultados = new Examen1();

        Map resultados_finales = new HashMap();
        resultados.estudiantesLista().forEach((estudiante_nombre,v) -> {


            System.out.println(estudiante_nombre);
        });
    }
}