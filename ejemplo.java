public class ejemplo
{
    public static void main(String[] args)
    {
        // Mediante la llamada al método constructor (Animal(“Perro”)) de la clase animal, se crea un
// objeto de la clase Animal cuyo nombré será Perro
        Animal miAnimal = new Animal(" Ion ");
        // Se establece una edad para el perro de 3 años.
        miAnimal.setEdad(3);
// Se muestra el nombre del animal por pantalla
        System.out.println("El nombre es: " + miAnimal.getNombre());
        // Se muestra la edad del animal por pantalla
        System.out.println(" y tiene " + miAnimal.getEdad() + " años");
// Este código deberia imprimir en cónsola: "El nombre es: Perro y tiene 3 años"
    }
}
