package application;

import java.util.Scanner;

import model.service.ImprimeService;

/**
 * Aplicar o uso de Generics afim de manipular qualquer tipo de dado
 * parametrizado permitindo o reuso e o type safety
 * 
 * @author julian
 *
 */
public class ImprimeValoresMainProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a quantidade de valores a ser lido:");
		int pQtde = sc.nextInt();
		
		ImprimeService<Integer> ip = new ImprimeService();
		for (int i = 1; i <= pQtde; i++) {
			System.out.print("Entre com o " + i + "º" + " número:");
			Integer pNumero = sc.nextInt();
			ip.adicionarValor(pNumero);
		}
		ip.imprimir();
		System.out.println();
		System.out.println("Primeiro valor inserido: " + ip.primeiro());

		System.out.println("-----------------------------------");
		
		
		ImprimeService<String> ipNome = new ImprimeService();
		for (int i = 1; i <= pQtde; i++) {
			System.out.print("Entre com o " + i + "º" + " nome:");
			String pNome = sc.next();
			ipNome.adicionarValor(pNome);
		}
		ipNome.imprimir();
		System.out.println();
		System.out.println("Primeiro valor inserido: " + ipNome.primeiro());

		sc.close();

	}

}
