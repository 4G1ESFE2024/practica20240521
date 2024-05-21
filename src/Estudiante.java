public class Estudiante extends Persona {
    private String codigoEstudiante;
    
    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String codigoEstudiante) {
        super(nombre, apellido);
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
    
    public int asistencia (Estudiante estudiante){
        return 1;
    }

     @Override
    public void imprimirDatos(){
       // super.imprimirDatos();
       System.out.println("******INFO ESTUDIANTE **********");
       System.out.print("Nombre: "+ getNombre());
       System.out.print(" Apellido: "+ getApellido());
       System.out.print(" Codigo Estudiante: "+ getCodigoEstudiante());
       if(getDireccion()!=null){
        System.out.printf(" Ciudad %s Pais %s",getDireccion().getCiudad(), getDireccion().getPais());
       }
       System.out.println("******************************");
    }
}
