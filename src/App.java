public class App {
    public static void main(String[] args) throws Exception {
       Direccion direccion = new Direccion("Sonsonate","El salvador");
       Estudiante estudiante = new Estudiante();
       estudiante.setNombre("Marvin");
       estudiante.setApellido("Barrera");
       estudiante.setCodigoEstudiante("CodA");
       direccion.asociarPersona(estudiante);
       estudiante.setDireccion(direccion);
       Profesor profesor = new Profesor();
       profesor.setNombre("Marco");
       profesor.setApellido("Escobar");
       profesor.setSalario(600.5);
       profesor.setDireccion(direccion);
       direccion.asociarPersona(profesor);

       estudiante.imprimirDatos();
       profesor.imprimirDatos();
       direccion.imprimirDatosPersonas();
    }
}
