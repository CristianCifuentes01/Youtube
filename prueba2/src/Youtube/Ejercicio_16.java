package Youtube;

import java.util.Scanner;

public class Ejercicio_16 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		double[] ventas=new double[7];
		String[] dias= {"lunes","martes","miercoles","jueves","viernes","Sabado","Domingo"};
		double ventasT=0;
		int DiaM=0;
		
		for(int i=0; i<ventas.length; i++) {
			System.out.println("Escribe la venta del dia "+ dias[i]+ ": ");
			ventas[i]=entrada.nextDouble();
			ventasT+=ventas[i];
			if(ventas[i]>ventas[DiaM]) {
				DiaM=i;
			}
		}
		
		System.out.println("\nLas ventas totales en la semana fueron de:  "+ ventasT);
		System.out.println("El dia con mayor venta fue :  "+ dias[DiaM]);
	}

}
