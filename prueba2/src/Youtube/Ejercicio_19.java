package Youtube;

public class Ejercicio_19 {
	
	//funcion sumar
	public static double funcion1(double a, double b) {
		double suma= a+b;
		return suma;
	}
	//funcion divide
	public static double funcion2(double a, double b) {
		if(b==0) {
			System.out.println("la division en 0 no esta definida");
			return Double.NaN;
		}
		
		double division= a/b;
		return division;
	}
	//funcion multiplicar 
	public static double funcion3(double a, double b) {
		double multiplicar= a*b;
		return multiplicar;
	}
	//funcion promedio
	public static double promedio(double a, double b) {
		double suma= funcion1(a,b);
		double promedio=funcion2(suma,2);
		
		return promedio;
	}
	
	public static void main(String[] args) {
		double num1=2, num2=6, num3=10;
		
		System.out.println("la suma es: "+ funcion1(num1, num2));
		System.out.println("la division es: "+ funcion2(num1, num2));
		System.out.println("la multiplicion es: "+ funcion3(num1, num2));
		System.out.println("el promedio es: "+ promedio(funcion1(num3, num1), num2));

		System.out.println("Hola mundo");
		
	}
}

