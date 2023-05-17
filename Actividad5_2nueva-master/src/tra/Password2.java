package tra;

public class Password2 extends Password {
	/**
	 * Constructor que recibe una contraseña como parámetro y llama al constructor de la clase
	 * base Password para inicializarla.
	 *
	 * @param password la contraseña que se usará para inicializar el objeto Password2.
	 */
	public Password2(String password) {
        super(password);
    }
	/**
	 * Método estático que genera contraseñas aleatorias válidas de la longitud dada.
	 * Se utiliza un bucle do-while para generar una nueva contraseña hasta que se encuentre una
	 * que sea válida, verificando que cumpla con las condiciones definidas en el método
	 * passwordValida de la clase Password.
	 *
	 * @param longitud la longitud deseada de la contraseña generada.
	 * @return una cadena de caracteres que representa la contraseña generada.
	 */

    public static String generarPassword(int longitud) {
        String password;
        do {
            password = Password.generarPassword(longitud);
        } while (!new Password(password).passwordValida());
        return password;
    }
}
