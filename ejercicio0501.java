import java.util.Scanner;

public class ejercicio0501 {
    public static void maximo(int n1,int n2)
    {
        int max;
        if (n1>n2)
            max = n1;
        else
            max=n2;
        System.out.println("El máximo es: " + max);
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce primer numero:");
        int numero1 = sc.nextInt();
        System.out.println("Introduce segundo numero:");
        int numero2 = sc.nextInt();
        maximo(numero1, numero2);

    }

}

