public class Profesor extends Persona
{
    private int idProfesor;

    public Profesor () { };
    public Profesor(String nombre, String apellidos, int idProfesor)
    {
        super( nombre, apellidos);
        this.idProfesor=idProfesor;
    }
    public void setIdProfesor (int idProfesor) {
        this.idProfesor = idProfesor;
    }
    public int getIdProfesor () {
        return idProfesor;
    }

}



