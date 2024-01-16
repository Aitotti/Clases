import java.util.Scanner;
// El MAIN al final, llamando a las funciones


public class PruebasClases
{
    public static void mostrarBienvenida()
    {
        System.out.println("Bienvenido a nuestra tienda");
        System.out.println("Elige una opcion del menu");
    }
    public static void saludar(String nombre, int edad)
    {
        System.out.println("Hola, " + nombre + " tienes " + edad + " años");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String nombreUsuario;
        int edad;

        mostrarBienvenida();
        saludar("Aitor", 36);
        saludar("Helvia", 6);
        System.out.println("Introduce tu nombre");
        nombreUsuario = sc.nextLine();
        System.out.println("Introduce tu edad");
        edad = sc.nextInt();
        saludar(nombreUsuario, edad);
    }
}