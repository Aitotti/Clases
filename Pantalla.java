public class Pantalla extends Producto {

    private float precio;
    private int cantidad;
    //constructor pantalla

    public Pantalla()
    {
    super();
    }
    public Pantalla (int nref, String nombre, float precio, int cantidad){

        super(nref, nombre);
        this.precio = precio;
        this.cantidad = cantidad;

    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
