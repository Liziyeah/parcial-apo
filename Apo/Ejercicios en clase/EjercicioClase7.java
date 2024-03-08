import java.util.Scanner;

public class EjercicioClase7 {
	public static void main(String[] args) {
		
		final double PI = 3.14159265359;
		System.out.println("La constante de Pi es: " + PI);
		
		int piSinDecimales = (int) PI;
		System.out.println("La constante de Pi sin decimales es: " + piSinDecimales);
		
		piSinDecimales += 10; //Azúcar sintáctico
		System.out.println(piSinDecimales);
		
	}
	
}