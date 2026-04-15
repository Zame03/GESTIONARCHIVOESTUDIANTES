import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class archivos {
    public void importar(LinkedList<objEstudiante> l) {


    }

    public void exportar(LinkedList<objEstudiante> l) {
        if(l.isEmpty()) {
            System.out.println("La lista se encuentra vacia, archivo no exportado");
            return;
        } else {
            try (FileWriter e = new FileWriter("estudiantes.txt")) {
                for (objEstudiante o : l) {
                    e.write("======================================\n");
                    e.write("Nombre: " + o.getNombre() + "\n");
                    e.write("Carnet: " + o.getCarnet() + "\n");
                    e.write("Cedula: " + o.getCedula() + "\n");
                }

                System.out.println("\n Archivo generado con exito");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
