/**
 * Clase que escribe las líneas de una factura
 * @author Juan Bachero
 *  @version 2016
 * 
 */
package tareadoc;
/**<b>Clase que escribe las líneas de una factura</b>*/
public class LineaFactura {
	/** Identifica el producto*/
	public String id_producto; 		
	/**Nombre del producto*/
	public String nombre_producto; 
	/**Precio por una unidad del producto*/
	public float precio; 		
	/**Cantidad de unidades compradas*/
	public float cantidad; 		
	/**Descuento de la unidad (no se esta utilizando)*/
	public float descuento; 	
	
	/**
	 * Constructor que inicializa los atributos de la clase LineaFactura mostrando id de producto, nombre, precio cantidad y descuento 
	 * @param idProducto Identifica el producto
	 * @param nombreProducto Identifica el nombre del producto
	 * @param precio Precio del producto
	 * @param cantidad Cantidad vendida
	 * @param descuento Descuento 
	 */
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	/**
	 * Clase que sobreescribe toString utiliza los atributos de la clase LineaFactura
	 * 
	 * @return Devuelve un String con todos los datos de la línea de factura 
	*/	
	@Override
	public String toString() {
		return "\n\tLineaFactura ["  				 				 
				+ "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto				
				+ ", precio=" + precio
				+ ", cantidad=" + cantidad
				+ ", descuento=" + descuento
				+ "]";
	}
	
	
	/**
	 * Devuelve el precio total de una linea, es decir, el precio de la unidad por la cantidad de productos 
	 * pedidos de esa unidad
	 * @return Devuleve el precio total, es decir el precio unitario multiplicado por la cantidad
	 */
	public float getTotal(){
		float total = this.precio * this.cantidad;
		return total;
	}

}
