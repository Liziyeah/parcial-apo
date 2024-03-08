import java.util.Scanner;

public class Repaso {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Número de dulces ");
		int numeroDulces = entrada.nextInt();
		
	
		final int PRECIO_DULCES_BASE = 300;
		final double VALOR_IMPUESTO = 0.16;
		double valorBase = numeroDulces * PRECIO_DULCES_BASE;
		double totalDulces = (valorBase * VALOR_IMPUESTO) + valorBase;
		int totalDulcesSinDecimal = (int) totalDulces;
		
		System.out.println("El total de los dulces es " + totalDulcesSinDecimal);
	}
}