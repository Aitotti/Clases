public class Persona {
    private String nombre;
    private String apellidos;
    public Persona ()
    { }
    public void setNombre (String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre ()
    {
        return nombre;
    }

    public void setApellidos (String apellidos)
    {
        this.apellidos = apellidos;
    }
    public String getApellidos () {
        return apellidos;
    }
    public Persona(String nombre, String apellidos)
    {
        this.nombre=nombre;
        this.apellidos=apellidos;
    }
}

