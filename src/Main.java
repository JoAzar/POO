public class Main {

  public static void main(String[] args) {

    //INSTANCIO LOS OBJETOS
    Carrito carrito = new Carrito();
    Producto listadoProducto[] = new Producto[3];

    //LES ASIGNO ATRIBUTOS
    listadoProducto[0] = new Producto("Jabón en polvo", 40);
    listadoProducto[1] = new Producto("Esponjas", 10);
    listadoProducto[2] = new Producto("Chocolates", 100);

    int total = listadoProducto[0].getPrecio();
    for(int i=0; i<listadoProducto.length; i++) {
      System.out.println(listadoProducto[i].imprimirProducto());
      if(i>0){
        total += listadoProducto[i].getPrecio();
      }
    }
    System.out.println("La suma del precio de los productos de su carrito es: "+total);
  }
}
