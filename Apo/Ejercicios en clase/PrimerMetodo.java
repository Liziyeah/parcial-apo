import java.util.Scanner;

public class PrimerMetodo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor escriba el número 1: ");
		int entero1 = entrada.nextInt();
		System.out.println("Por favor escriba el número 2: ");
		int entero2 = entrada.nextInt();
		
		int resultadoSuma;
		resultadoSuma = suma(entero1, entero2); //Llamado del metodo
		System.out.println("La suma es " + resultadoSuma);
	}
	/**
	* Contrato
	* Descripcion: Método que toma dos números y los suma
	* @param int numero1 debe ser entero
	* @param int numero2 debe ser entero
	*/
	public static int suma(int numero1, int numero2) {
		
		int resultado; 
		resultado = numero1 + numero2;
		return resultado;
		}
}
	