import java.util.Scanner;

public class EjercicioCondicionales {
	
	static Scanner sc = new Scanner(System.in); //Creando el Scanner
	
	public static void main(String[] args) {
		
		pideInfo("cedula");
		int cedulaUsuario;
		cedulaUsuario = leerDato();
		pideInfo("dia");
		int dia;
		dia = leerDato();
		System.out.println(cedulaUsuario);
		System.out.println(dia);
		
		
	}
	
	
/**
*Descripcioón: Método que pida la cédula al usuario
*/
	public static void pideInfo(String dato){ //metodo general
		System.out.println("Por favor digite su " + dato);
}

/**
*Descripción: Método que lee con ayuda del scanner la cedula ingresada
*@return dato que se captura
*/
	public static int leerDato(){
		int dato = sc.nextInt();
		return dato;
	}
/**
*Descripción: Calcular el resutado de la operacion modulo 2 sobre un entero
*@param entero 
*@return resultado del modulo 2
*/

	public static int calcularDato(){
		leerDato % 2;
		return leerDato;
	}
}
