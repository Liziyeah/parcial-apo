import java.util.Scanner;

public class PrimeraCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor escriba el número 1: ");
		int entero1 = entrada.nextInt();
		System.out.println("Por favor escriba el número 2: ");
		int entero2 = entrada.nextInt();
		
		int suma = entero1 + entero2;
		int resta = entero1 - entero2;
		int producto = entero1 * entero2;
		int division = entero1 / entero2;
		int modulo = entero1 % entero2;
		
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(producto);
		System.out.println(division);
		System.out.println(modulo);
		
		

	}
}
		