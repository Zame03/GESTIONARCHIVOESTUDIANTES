public class objEstudiante {
    private String Nombre;
    private String Carnet;
    private int Cedula;
    
    public objEstudiante() {
    }

    public objEstudiante(String nombre, String carnet, int cedula) {
        Nombre = nombre;
        Carnet = carnet;
        Cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getCarnet() {
        return Carnet;
    }
    public void setCarnet(String carnet) {
        Carnet = carnet;
    }
    public int getCedula() {
        return Cedula;
    }
    public void setCedula(int cedula) {
        Cedula = cedula;
    }


}
