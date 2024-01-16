import java.util.Scanner;

public class LanzadoraPantalla {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Seguir;
        String nombre ;
        float precio;
        int cantidad, nref;
        int op = 0;
        Pantalla p = new Pantalla();



        do {
            do{

                System.out.println("Elija una opcion\n 1- Alta Pantalla\n 2- Visualiza Pantalla \n 3- Importe total \n 4- Salir");
                op = sc.nextInt();
            }while ((op<1) || (op > 4));

            switch (op){
                case 1:
                    System.out.println("Introduzca nombre de Producto");
                    nombre = sc.next();
                    System.out.println("Introduzca numero referencia");
                    nref = sc.nextInt();
                    System.out.println("Introduce precio");
                    precio = sc.nextFloat();
                    System.out.println("Introduce cantidad");
                    cantidad = sc.nextInt();
                    p.setNombre(nombre);
                    p.setNref(nref);
                    p.setCantidad(cantidad);
                    p.setPrecio(precio);
                    break;
                case 2:

                    System.out.println("Nombre del producto: " + p.getNombre());
                    System.out.println("Numero de referencia del producto: " + p.getNref());
                    System.out.println("Cantidad de propductos: " + p.getCantidad());
                    System.out.println("Precio del producto: " + p.getPrecio());
                    break;
                case 3:
                    float Resultado = p.getPrecio()*p.getCantidad();
                    System.out.println("al importiu total es  " +Resultado);
                    break;
                case 4:
                    System.out.println("adew baby ");
                    break;
                default:

        }
            System.out.println("¿quieres continuar? S/N ");
            Seguir = sc.next();
        }while((Seguir.equals("S")));
        System.out.println("sayonara baby");
        Pantalla[] arrai = new Pantalla[10];
    }}