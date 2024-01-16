import java.util.Scanner;
// Definición de la clase Operacion
public class Operacion {
    // Atributos
    private int x;
    private int y;
    // Constructor
    public Operacion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Método para calcular la suma
    public void suma() {
        int resultado = x + y;
        System.out.println("La suma de " + x + " y " + y + " es: " + resultado);
    }

    public void multiplicacion(){
        int resultado = x * y;
        System.out.println("La multiplicación de x e y da como resultado: " + resultado);
    }
    public void division(){
        int resultado = x / y;
        System.out.println("la division de x e y da como resultado: " + resultado);
    }

    public void resta() {
        int resultado = x - y;
        if (y > x){
            System.out.println("\n El resultado será negativo: \n Y el resultado es:" + resultado);
        }
        System.out.println("La resta de x " + x + " y " + y + " es: " + resultado);
    }
    // Método main
    public static void main(String[] args) {
        // Crear un objeto de la clase Operacion
        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario que ingrese dos números

        System.out.print("Ingrese el valor de x: ");
        int valorX = sc.nextInt();
        System.out.print("Ingrese el valor de y: ");
        int valorY = sc.nextInt();

        // Crear un objeto Operacion con los valores proporcionados por el usuario

        Operacion oper = new Operacion(valorX, valorY);
        // Llamar al método suma para calcular e imprimir el resultado
        oper.suma();
        oper.resta();
        oper.multiplicacion();
        oper.division();
        // Cerrar el scanner
        sc.close();
    }
}