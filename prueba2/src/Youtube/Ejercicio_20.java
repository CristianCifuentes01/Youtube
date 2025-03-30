package Youtube;

import java.util.*;

public class Ejercicio_20 {
	
	public static void ingresarDatos(String nombres[],double precio[], int  cantidad []) {
		Scanner entrada=new Scanner(System.in);
		
		for(int i=0; i<nombres.length;i++ ) {
			System.out.println("\nProducto "+ (i+1));
			System.out.println("Escribe el nombre del producto: ");
			nombres[i]=entrada.nextLine();
			System.out.println("Escribe el precio del producto: ");
			precio[i]=entrada.nextDouble();
			System.out.println("Escribe cantidad en invetario del producto: ");
			cantidad[i]=entrada.nextInt();
			
			entrada.nextLine();// Elimina el buffer
			
		}
	}
	public static void mostrarDatos(String nombres[],double precio[], int  cantidad []) {
		
		System.out.println("Inventario de productos");
		for(int i=0; i<nombres.length;i++ ) {
			System.out.println("\nProducto "+ (i+1));
			System.out.println("Nombre del producto: "+ nombres[i]);
			System.out.println("Precio del producto: "+ precio[i]);
			System.out.println("Cantidad en invetario del producto: "+ cantidad[i]);
			System.out.println("--------------------------------------------------------");
			
			
		}
	}
	
	

	public static void main(String[] args) {
	
		Scanner entrada=new Scanner(System.in);
		
		int numProductos;
		
		System.out.println("Cuantos productos vas a ingresar:");
		numProductos=entrada.nextInt();
		
		
		String nombre[]=new String[numProductos];
		double precio[]=new double[numProductos];
		int  cantidad[]=new int[numProductos];
		
		ingresarDatos(nombre,precio,cantidad);
		mostrarDatos(nombre,precio,cantidad);
		
		
	}

}
