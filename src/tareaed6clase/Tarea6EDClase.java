
package tareaed6clase;

public class Tarea6EDClase {

    
    private static final double DESCUENTO_MAYOR_CANTIDAD = 5.0;
    private static final double DESCUENTO_GENERAL = 0.8;
    private static final double DESCUENTO_SIN_PRODUCTOS = 0.95;
    /**
      @param precioProducto El precio del producto.
      @param cantidadProductos La cantidad de productos.
     */

    public void aplicarDescuento(double precioProducto, int cantidadProductos){     
        double total;
        
        
        precioProducto = aplicarDescuentoPorCantidad(precioProducto, cantidadProductos);

   
        total = calcularTotal(precioProducto, cantidadProductos);

     
        mostrarTotal(total);
    }
 /**
     @param precioProducto El precio del producto.
     @param cantidadProductos La cantidad de productos.
     @return El precio del producto después de aplicar el descuento.
     */
    private double aplicarDescuentoPorCantidad(double precioProducto, int cantidadProductos) {
        if(cantidadProductos > 3) {
            precioProducto -= DESCUENTO_MAYOR_CANTIDAD;
        }
        return precioProducto;
    }
    /**
     * @param precioProducto El precio del producto.
     * @param cantidadProductos La cantidad de productos.
     * @return El total a pagar después de aplicar el descuento.
     */
    private double calcularTotal(double precioProducto, int cantidadProductos) {
        double total;
        if (cantidadProductos != 0){
            total = precioProducto * (1 - DESCUENTO_GENERAL);
        } else {
            total = precioProducto *  DESCUENTO_SIN_PRODUCTOS;
        }
        return total;
    }
 /**
     * @param total El total a pagar.
     */
    private void mostrarTotal(double total) {
        System.out.println("El total a pagar es: " + total);
        System.out.println("Enviado");
    }

 
}
