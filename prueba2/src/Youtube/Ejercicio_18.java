package Youtube;

import java.util.Scanner;

public class Ejercicio_18 {
	
	public static void main(String args[]) {
		Scanner entrada=new Scanner(System.in);
		boolean[] mesas=new boolean[10];
		
		for(int i=0;i<mesas.length;i++) {
			mesas[i]=true;//mesas disponibles 
		}
		int opcion;
		
		do {
			System.out.println("\n-------------------------------------------");
			System.out.println("Bienvenido al programa de reservas...Escoja la opcion deseada:");
			System.out.println("1) Verificar la disponiblidad de mesa. ");
			System.out.println("2) Reservar Mesa. ");
			System.out.println("3) Cancelar Reserva de mesa. ");
			System.out.println("4) Mostrar estados de la mesas. ");
			System.out.println("5) Salir del programa.");
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1: 
				System.out.println("Escribe el numero de mesa a verificar: (1-10) ");
				int numMesa=entrada.nextInt();
				verificarDisponiblidadMesa(mesas,numMesa);
				
				break;
			case 2: 
				System.out.println("Escribe el numero de mesa a reservar: (1-10) ");
				int numReserva=entrada.nextInt();
				reservarMesa(mesas,numReserva);
				
				break;
			case 3: 
				System.out.println("Escribe el numero de mesa para cancelar reserva: (1-10) ");
				int numCancelacion=entrada.nextInt();
				cancelarReserva(mesas,numCancelacion);
				
				break;
			case 4:
				mostrarEstadoMesas(mesas);
				break;
			case 5: 
				break;
			default: 
				System.out.println("\nOpcion no disponible intente de nuevo");
			}
			
		}while(opcion !=5);
				
	}
	
	public static void verificarDisponiblidadMesa(boolean mesas[], int numMesa) {
		if(numMesa<1||numMesa>10) {
			System.out.println("Error: el valor tiene que estar entre 1 y 10. ");
			return;
		}
		if(mesas[numMesa-1]) {
			System.out.println("La mesa "+numMesa+ " esta disponible.");
		}else {
			System.out.println("La mesa "+numMesa+ " ya esta reservada.");
		}	
	}
	
	public static void reservarMesa(boolean mesas[], int numMesa) {
		if(numMesa<1||numMesa>10) {
			System.out.println("Error: el valor tiene que estar entre 1 y 10. ");
			return;
		}
		if(mesas[numMesa-1]) {
			mesas[numMesa-1]=false;
			System.out.println("La mesa "+numMesa+ " se reservó.");
		}else {
			System.out.println("La mesa "+numMesa+ " ya esta reservada.");
		}	
	}
	public static void cancelarReserva(boolean mesas[], int numMesa) {
		if(numMesa<1||numMesa>10) {
			System.out.println("Error: el valor tiene que estar entre 1 y 10. ");
			return;
		}
		if(mesas[numMesa-1]==false) {
			mesas[numMesa-1]=true;
			System.out.println("se canceló la reserva de la mesa: "+ numMesa);
		}else {
			System.out.println("La mesa "+numMesa+ " ya estaba disponible");
		}	
	}
	public static void mostrarEstadoMesas(boolean mesas[]) {
		for(int i=0; i<mesas.length;i++) {
			String estado=mesas[i]? "Disponible": "No Disponible";
			System.out.println("La mesa "+(i+1)+ " esta: "+ estado);
		}
	}
	
	
	

}
