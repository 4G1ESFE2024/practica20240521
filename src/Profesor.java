public class Profesor extends Persona {
    private double salario;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, double salario) {
        super(nombre, apellido);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public int marcarEntrada(Profesor profesor){
        return 1;
    }
    public int marcarSalida(Profesor profesor){
        return 1;
    }

    @Override
    public void imprimirDatos(){
       // super.imprimirDatos();
       System.out.println("******INFO PROFESOR **********");
       System.out.print("Nombre: "+ getNombre());
       System.out.print(" Apellido: "+ getApellido());
       System.out.print(" Salario: "+ getSalario());
       if(getDireccion()!=null){
        System.out.printf(" Ciudad %s Pais %s",getDireccion().getCiudad(), getDireccion().getPais());
       }
       System.out.println("****************************");;
    }
}
