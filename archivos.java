import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileReader;

public class archivos {
    public LinkedList<objEstudiante> importar(LinkedList<objEstudiante> l) {
        String rutaArchivo = "estudiantes.txt";
        LinkedList<objEstudiante> lista = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            objEstudiante obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Nombre:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                    obj = new objEstudiante();
                    obj.setNombre((linea.substring(8)));
                } else if (linea.startsWith("Carnet:")) {
                    if (obj != null) {
                        obj.setNombre(linea.substring(8));
                    }
                } else if (linea.startsWith("Cedula:")) {
                    if (obj != null) {
                        obj.setCedula(Integer.parseInt(linea.substring(10)));
                    }
                }
            System.out.println("Archivo importado correcrtamente ");
            }

        } catch (Exception e) {
            System.out.println("Error Generado");
            // TODO: handle exception
        }

        return lista;
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