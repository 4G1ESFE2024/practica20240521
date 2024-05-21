public class Direccion {
    private String ciudad;
    private String pais;
    private Persona[] personas=null; 
    private int indicePersona=0;   
    public Direccion() {     
    }
    public Direccion(String ciudad, String pais) {
        this.ciudad = ciudad;
        this.pais = pais;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Persona[] getPersonas() {
        return personas;
    }
    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public void asociarPersona(Persona persona){
        if(personas == null){
            personas= new Persona[20];
        }
        personas[indicePersona]=persona;
        indicePersona++;
    }

    public void imprimirDatosPersonas(){
        if(getPersonas()!=null && getPersonas().length>0){
            System.out.println("******INFO CIUDAD **********");
            System.out.printf(" Ciudad %s Pais %s",getCiudad(), getPais());
            for(int i=0; i<indicePersona;i++){
                Persona item= getPersonas()[i];
                System.out.println("******INFO PERSONA **********");
                System.out.print("Nombre: "+ item.getNombre());
                System.out.print(" Apellido: "+ item.getApellido());
                System.out.println("******** **********");
            }
            System.out.println("****************");
        }
    }
}
