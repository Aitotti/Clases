public class Producto {

    private int nref;
    private String nombre;

    //Construtor de la clase master productos
    public Producto(){

    }
    public Producto(int nref, String nombre) {
        this.nref = nref;
        this.nombre = nombre;
    }

    //metodos de la clase master
    public int getNref() {
        return nref;
    }

    public void setNref(int nref) {
        this.nref = nref;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}




