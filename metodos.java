import java.util.LinkedList;
import java.util.Scanner;

public class metodos {
    public LinkedList<objEstudiante> LlenarLista(LinkedList<objEstudiante> l, Scanner sc){
        boolean continuar = true;

        while (continuar) {
            objEstudiante o = new objEstudiante();
            System.out.println("Ingrese nombre del estudiante: ");
            o.setNombre(sc.next());

            System.out.println("Ingrese el carnet: ");
            o.setCarnet(sc.next());

            System.out.println("Ingrese la cedula: ");
            o.setCedula(sc.nextInt());

            l.add(o);

            System.out.println("Desea seguir ingresando 1. Si 2. No");
            int opt = sc.nextInt();

            if (opt == 2){
                continuar = false;
            }
        }

        return l;
    }

    public void MostrarLista(LinkedList<objEstudiante> l) {
        int i = 1;
        for(objEstudiante o : l) {
            System.out.println("Indice: " + i);
            System.out.println("Nombre: " + o.getNombre());
            System.out.println("Carnet: " + o.getCarnet());
            System.out.println("Cedula " + o.getCedula());
            System.out.println("====================================");
            i++;
        }
    }

    public objEstudiante ConsultarEstudiante(int cedula, LinkedList<objEstudiante> l) {
        objEstudiante o = new objEstudiante();

        for (objEstudiante busqueda : l) {
            if (busqueda.getCedula() == cedula) {
                o.setNombre(busqueda.getNombre());
                o.setCarnet(busqueda.getCarnet());
                o.setCedula(busqueda.getCedula());
            }
        }

        return o;
    }

    public LinkedList<objEstudiante> ModificarEstudiante(int cedula, LinkedList<objEstudiante> l, Scanner sc) {
        for (objEstudiante busqueda : l) {
            if (busqueda.getCedula() == cedula) {
                System.out.println("Ingrese el nombre ");
                busqueda.setNombre(sc.next());
                System.out.println("Ingrese el Carnet ");
                busqueda.setCarnet(sc.next());
            } else {
                System.out.println("Estudiante no encontrado ");
            }
        }
        return l;
    }

    public LinkedList<objEstudiante> EliminarEstudiante(int cedula, LinkedList<objEstudiante> l, Scanner sc) {
        l.removeIf(x -> x.getCedula() == cedula);
        return l;
    }
}


