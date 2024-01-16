public class Alumno extends Persona {
    private int idAlumno;
    private float notaFinal;

    public Alumno(){}

    public Alumno(String nombre, String apellidos, float notaFinal,int idAlumno)
    {
        super( nombre, apellidos);
        this.idAlumno=idAlumno;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void setIdAlumno (int idAlumno) {
        this.idAlumno = idAlumno;
    }
    public float getNotaFinal () {
        return notaFinal;
    }

}
