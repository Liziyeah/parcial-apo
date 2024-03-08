import java.util.Scanner;

public class EjercicioClaseDulces {
	public static void main(String[] args) {
	
		int numeroDulces = entrada.nextInt();
		System.out.println("Número de dulces ");
		
		final precioDulceBase = 300;
		final valorImpuesto = 0.16;
		int valorBase = numeroDulces * precioDulceBase;
		double precioConImpuesto = (valorBase * valorImpuesto) + valorBase;
		
		
	}
	
}
