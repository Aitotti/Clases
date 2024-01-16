import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class pruebas {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int[] array = {5, 2, 8, 1, 9,5};
        String[] palabros = {"Uno","Dos","Tres", "Cuatro", "Nueve"};
        Arrays.sort(array);
        Arrays.sort(palabros);
        System.out.println(Arrays.toString(array));
        // Imprime [1, 2, 5, 8, 9]
        System.out.println(Arrays.toString(palabros));
        System.out.println(palabros[2]);
        int[] arr = {1, 2, 5, 8, 9};
        int index = Arrays.binarySearch(array, 5);
        System.out.println(index); // Imprime 2 (índice del elemento 5)

        String texto = "Hola,buenas  tardes";
        for (int i=0;i < texto.length();i++){
            System.out.println(texto.charAt(i));
        }
        String[] partes = texto.split(" ");
        for (int i = 0; i < partes.length; i++){
            System.out.println(partes[i]);
        }





    }
    public static void saludar(String nombre)
    {
        System.out.println("Hola, " + nombre);
    }
}
