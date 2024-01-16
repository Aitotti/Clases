public class Animal
{
    private String raza;
    private String nombre;
    private int edad;
    //Se define el método constructor
    public Animal(String nuevoNombre)
    {
//Se le da un nombre al animal
        nombre = nuevoNombre;
    }
    //Método para obtener la edad del animal
    public int getEdad()
    { return edad;
    }
    //Método para establecer la edad del animal
    public void setEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }
    //Método para obtener el nombre del animal
    public String getNombre()
    {
        return nombre;
    }
}
