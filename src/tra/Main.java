package tra;

import java.util.Scanner;

public class Main {
	/**
	 * Método principal que inicia la aplicación.
	 * 
	 * @param args Los argumentos de línea de comando que se pasan al programa.
	 */
	public static void main(String[] args) {
		// Crear una instancia de Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese la longitud del password
		System.out.print("Ingresa la longitud del password: ");
		int longitud = scanner.nextInt();

		// Generar dos contraseñas de la longitud especificada
		String password1 = Password.generarPassword(longitud);
		boolean password1Fuerte = new Password(password1).passwordValida();

		String password2 = Password2.generarPassword(longitud);
		boolean password2Fuerte = new Password(password2).passwordValida();

		// Imprimir las contraseñas generadas y su fuerza
		System.out.println("Password1: " + password1);
		System.out.println("Password1 fuerte? " + password1Fuerte);

		System.out.println("Password2: " + password2);
		System.out.println("Password2 fuerte? " + password2Fuerte);
	}
}
