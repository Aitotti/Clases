import java.util.Scanner;

public class lanzadora
{
    public static void main (String args [])
    {
        String nombre, apellidos;
        int id;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre profesor: ");
        nombre=sc.nextLine();
        System.out.println("Apellidos profesor:" );
        apellidos=sc.nextLine();
        System.out.println("Id profesor: ");
        id=sc.nextInt();
        Profesor profe = new Profesor(nombre, apellidos, id);
        System.out.println("El nombre del profesor es: " + profe.getNombre());
        System.out.println("Los apellidos del profesor son: " +profe.getApellidos());
        System.out.println("El identificador del profesor es: " +profe.getIdProfesor());
    }
}