package Youtube;


public class pureba {
	//funcion suma 
	public static double sumar(double x, double y) {
		double suma=x+y;
		return suma;
	}
	//funcion divide
	public static double dividir(double x, double y) {
		if(y==0) {
			System.out.println("La división entre 0 no esta definida.");
			return Double.NaN;
		}
		return x/y;
			
	}
	//funcion multiplicar 
	public static double multiplicar(double x, double y) {
		return x * y;
	}
	//funcion promedio  
	public static double promedio(double x, double y) {
		double suma=sumar(x,y);
		return dividir(suma,2);
	}
	
	public static void main(String[] args) {
		
		double num1=5, num2=10, num3=12;
		
		System.out.println("La suma es: "+sumar(num1,num2));
		
		System.out.println("La división es: "+dividir(num1,num2));
		System.out.println("La multiplicación es: "+multiplicar(num1,num2));
		System.out.println("El promedio es: "+promedio(num1,num2));
		
		System.out.println("La suma es: "+sumar(num3,sumar(4,7)));
	}
	
	

}
