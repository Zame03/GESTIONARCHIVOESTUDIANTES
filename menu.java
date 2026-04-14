import java.util.LinkedList;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        LinkedList<objEstudiante> lista = new LinkedList<objEstudiante>();
        archivos a = new archivos();
        metodos m = new metodos();

        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Que desea realizar");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Consultar estudiante");
            System.out.println("3. Modificar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Mostrar estudiantes");
            System.out.println("6. Importar estudiantes");
            System.out.println("7. Exportar estudiantes");
            System.out.println("8. Salir");

            value = sc.nextInt();

            switch (value) {
                case 1:
                    lista = m.LlenarLista(lista, sc);
                    break;

                case 2:
                    m.MostrarLista(lista);
                    break;

                case 3:
                    
                    break;

                case 4:
                    
                    break;

                case 5:
                    
                    break;

                case 6:
                    a.importar(lista);
                    break;

                case 7:
                    a.exportar(lista);
                    break;

                case 8:
                    break; 
            
                default:
                    break;
            }
        }
    }
}
