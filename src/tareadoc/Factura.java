/**
 * @author Juan Bachero
 * @version 2016
 */
package tareadoc;

import java.util.Arrays;
/**<b>Clase que escribe el resumen de una factura con las líneas de la misma</b>*/
public class Factura {
	/**Identificador (codigo) del cliente*/
	public String id_cliente;
	/**Nombre del cliente*/
	public String nombre_cliente;
	/**Lista de productos comprados*/
	public LineaFactura lineas[];	
	
	
	/** 
	* Inicializa los atributos de la clase Factura id_cliente, nombre_cliente y lineas 
	* @param idCliente Identificación cliente 
	* @param nombreCliente Nombre del Cliente
	* @param lineas Lineas de la Factura
	*/
	public Factura(String idCliente, String nombreCliente, LineaFactura[] lineas) {
		super();
		id_cliente = idCliente;
		nombre_cliente = nombreCliente;
		this.lineas = lineas;
	}

	/**
	 * Clase que devuelve el precio total de la Factura, calculado a partir del precio de cada linea.
	 * Llama al metodo getTotal de la clase LineaFactura para obtener el precio parcial de cada linea
	 * y suma los valores parciales para obtener el precio total de la factura
	 * @see LineaFactura#getTotal()
	 * @return Devuelve el total de la factura sumando todas las lineas
	*/
	public float getTotal(){
		float precio = 0;
		for (int i = 0; i < this.lineas.length; i++ ){
			precio += this.lineas[i].getTotal();
		}
		return precio;
	}
	/**
	 * Clase que sobreescribe toString, utiliza los atributos de la clase Factura. Usa Arrays.toString para devolver el valor del array lineas 
	 * @see Arrays#toString()
	 * @return Devuelve los datos de la factura y sus lineas 
	*/	
	@Override
	public String toString() {
		return "Factura [" + "id_cliente=" + id_cliente + ", nombre_cliente=" + nombre_cliente 
				+ ", getTotal()=" + getTotal() + ", lineas=" + Arrays.toString(lineas) + "]";
	}

	/**
	 * Clase principal crea los objetos líneas factura y factura y escribe en pantalla
	 * @param args No se usan
	 * 
	*/		
	public static void main(String[] args){
		
		// Crear una factura
		LineaFactura[] lineas = new LineaFactura[]{
				new LineaFactura("P100", "Leche",	0.85f, 	6, 	0 ),
				new LineaFactura("P200", "Pan",		0.60f, 	1, 	0 ),
				new LineaFactura("P150", "Tomate",	0.85f, 	2, 	0 ),
				new LineaFactura("P600", "Cafe",		1.2f, 	1, 	0 )
			};														
		Factura factura1 = new Factura( "C100",  "Antonio Garcia", lineas);
		
		// Escribir la factura
		System.out.println( factura1);
		
	}	
	
}
