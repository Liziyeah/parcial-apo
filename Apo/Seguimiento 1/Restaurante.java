import java.util.Scanner;

public class Restaurante {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el número de Queen Salchis que deseas comprar: ");
		int salchi1 = entrada.nextInt();
		System.out.println("Ingresa el número de American Salchis que desea comprar:  ");
		int salchi2 = entrada.nextInt();
		
		int valorVentaQs = salchi1 * 65000;
		int valorVentaAs = salchi2 * 25000;
		double impuestoAgregado = (valorVentaQs + valorVentaAs) * 0.08;
		double valorTotal = valorVentaQs + valorVentaAs + impuestoAgregado;
		
		System.out.println(salchi1 + "x Queen Salchi ......." + valorVentaQs);
		System.out.println(salchi2 + "x American Salchi ......" + valorVentaAs);
		System.out.println("Impuesto al consumo (8%) ........." + impuestoAgregado);
		System.out.println("Total a pagar ...................." + valorTotal);
		System.out.println("¡Gracias por preferirnos! :3");
	}
}