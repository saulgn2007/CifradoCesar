package Principal;

import java.util.Scanner;

public class Depuracion {

	// Método para solicitar un texto no vacío
	public static  String solicitarTexto(Scanner scanner, String mensaje) {
		String texto;
		do {
			System.out.print(mensaje);
			texto = scanner.nextLine().trim();
			if (texto.isEmpty()) {
				System.out.println("⚠ Error: No puede estar vacío.");
			}
		} while (texto.isEmpty());
		return texto;
	}

	// Método para solicitar un número entero positivo
	public static int solicitarNumero(Scanner scanner, String mensaje) {
		int numero;
		while (true) {
			try {
				System.out.print(mensaje);
				numero = Integer.parseInt(scanner.nextLine().trim());
				if (numero >= 0) {
					return numero;
				} else {
					System.out.println("⚠ Error: Debe ser un número positivo.");
				}
			} catch (NumberFormatException e) {
				System.out.println("⚠ Error: Ingrese un número válido.");
			}
		}
	}

}
