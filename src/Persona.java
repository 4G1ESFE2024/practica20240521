public abstract class Persona implements IProcesos {
    private String nombre;
    private String apellido;
    private Direccion direccion;
    
    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String generarNumeroParqueo(Persona persona){        
        return "#1";
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /*public void imprimirDatos(){
        System.out.println("Nombre: "+ getNombre()+ " Apellido: "+ getApellido());
    }*/
}
