
import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		System.out.println("Bienvenido, ingrese un numero: ");
		
		Scanner sc = new Scanner(System.in); 
		double num1 = sc.nextDouble();
		System.out.println("Ahora el otro numero: ");
		double num2 = sc.nextDouble();
		System.out.println("Que operacion quieres hacer?");
		System.out.println("+,-,*,/");
		
		String opcion = sc.next();
		switch (opcion) {
		case "+":
			System.out.println("La suma es: " + num1+num2);
			break;
		case "-":
			System.out.println("La resta es: " + resta(num1, num2));
			break; 
		case "*":
			System.out.print("La multiplicacion es: " + num1 * num2);
			break;
		case "/": 
			System.out.print("La division es: " + num1 / num2 );
			if (num2 == 0) throw new ArithmeticException("No se puede división por cero");
			break;
			default: System.out.print("Ingresaste un simbolo equivocado");
	}
	

	}

	private static double resta(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}}	


