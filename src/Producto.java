public class Producto {
  public String nombre;
  public int precio;

  public Producto(String nombre, int precio){
    this.nombre = nombre;
    this.precio = precio;
  }

  //---------->GETTERS
  public String getNombre(){
    return nombre;
  }

  public int getPrecio(){
    return precio;
  }

  //--------->SETTERS
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  public String imprimirProducto() {
    return "Nombre: "+this.nombre+ "Precio: "+this.precio;
  }


}
