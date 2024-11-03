package Youtube;
import java.util.Scanner ;


public class Ejercicio_15 {

	public static void main(String[] args) {
		// metodo de entrada de la clase scanner
		Scanner entrada=new Scanner(System.in);
		
		double lado1, lado2, lado3;
		
		System.out.println("Escriba el valor del lado 1 en cm: ");
		lado1=entrada.nextDouble();
		System.out.println("Escriba el valor del lado 2 en cm: ");
		lado2=entrada.nextDouble();
		System.out.println("Escriba el valor del lado 3 en cm: ");
		lado3=entrada.nextDouble();
		
		
		if(lado1==lado2 && lado2==lado3) {
			
			System.out.println("El triangulo es equilatero");
			
		}else if(lado1==lado2 || lado2==lado3 || lado1==lado3) {
			
			System.out.println("El triangulo es isosceles");
			
		}else if(lado1!=lado2 && lado2!=lado3 && lado1!=lado3) {
			
			System.out.println("El triangulo es escaleno");
		}
		
	}

}
