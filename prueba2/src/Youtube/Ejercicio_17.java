package Youtube;

import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		String[] productos= {"Camisas","computAdor", "telefonos","impresora","microfono"};
		String productoBuscado, continua;
		
		do {
			
			System.out.println("Escribe el nombre del producto que desear buscar: ");
			productoBuscado=entrada.nextLine();
			
			if(buscarProducto(productos,productoBuscado)) {
				System.out.println("El producto "+productoBuscado+ ". Esta en inventario");
			}else {
				System.out.println("El producto "+productoBuscado+ ". No esta en inventario");
			}
			
			System.out.println("Deseas buscar otro producto (Si o No): ");
			continua=entrada.nextLine();
		}while(continua.equalsIgnoreCase("si"));
		
		
		
		
	}
	
	
	public static boolean buscarProducto(String [] producto, String productoBuscado ) {
		for(int i=0; i<producto.length; i++) {	
			if(producto[i].equalsIgnoreCase(productoBuscado)) {
				return true;
			}	
		}
		return false;
		
	}

}
