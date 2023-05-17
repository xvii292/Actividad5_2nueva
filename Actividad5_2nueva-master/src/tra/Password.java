package tra;

import java.util.Random;

public class Password {
	/**
	 * La contraseña actual.
	 */
	private String password;

	/**
	 * Crea una nueva instancia de la clase Password con la contraseña
	 * proporcionada.
	 * 
	 * @param password la contraseña a establecer.
	 */
	public Password(String password) {
		this.password = password;
	}

	/**
	 * Comprueba si la contraseña actual cumple con los requisitos de seguridad. Una
	 * contraseña segura debe tener al menos una letra mayúscula, más de dos letras
	 * minúsculas y al menos un número.
	 * 
	 * @return true si la contraseña es segura, false en caso contrario.
	 */
	public boolean passwordValida() {
		boolean hasUppercase = false;
		int numLowercase = 0;
		boolean hasNumber = false;
		for (char c : password.toCharArray()) {
			if (Character.isUpperCase(c)) {
				hasUppercase = true;
			} else if (Character.isLowerCase(c)) {
				numLowercase++;
			} else if (Character.isDigit(c)) {
				hasNumber = true;
			}
		}
		return hasUppercase && numLowercase > 2 && hasNumber;
	}

	/**
	 * Genera una nueva contraseña aleatoria con la longitud especificada. La
	 * contraseña aleatoria contendrá tanto letras minúsculas como números.
	 * 
	 * @param longitud la longitud de la contraseña a generar.
	 * @return una nueva contraseña aleatoria.
	 */
	public static String generarPassword(int longitud) {
		Random random = new Random();
		StringBuilder password = new StringBuilder();
		for (int i = 0; i < longitud; i++) {
			boolean isNumber = random.nextBoolean();
			if (isNumber) {
				int num = random.nextInt(10);
				password.append(num);
			} else {
				char c = (char) (random.nextInt(26) + 'a');
				password.append(c);
			}
		}
		return password.toString();
	}
}
