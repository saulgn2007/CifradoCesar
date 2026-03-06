package Principal;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Declaramos scanner
		Scanner leer = new Scanner(System.in);
		String texto;
		int clave;
		Cifrado cifrado = new Cifrado();
		int opcion;

		do {
			opcion = Depuracion.solicitarNumero(leer, "Introduce la opción que desee: \n1-> Cifrar un texto\n2-> Descifrar un texto\n0-> Salir del programa.");
			switch (opcion) {
			case 1:
				texto = Depuracion.solicitarTexto(leer, "Introduce el texto a cifrar: ");
				cifrado.setTexto(texto);
				clave = Depuracion.solicitarNumero(leer, "Introduce la clave de cifrado (número entero): ");
				cifrado.setClave(clave);
				System.out.println(cifrado.cifrar());
				break;
			case 2:
				texto = Depuracion.solicitarTexto(leer, "Introduce el texto a descifrar: ");
				cifrado.setTexto(texto);
				clave = Depuracion.solicitarNumero(leer, "Introduce la clave de descifrado (número entero): ");
				cifrado.setClave(clave);
				System.out.println(cifrado.descifrar());
				break;
			case 0:
				System.out.println("Saliendo del programa. ¡Hasta luego!");
				break;
			default:
				System.out.println("Opción no válida. Por favor, introduce 1 para cifrar, 2 para descifrar o 0 para salir.");
				break;
			}
		} while (opcion != 0);
	}
}
