/**
 * 
 */
package org.ronan.puissance4.modele.jeu;

/**
 * Cette exception est soulev�e lorsque l'on tente d'ins�rer un jeton dans une colonne pleine
 * @author Ronan Quintin
 *
 */
public class ColonnePleineException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public ColonnePleineException() {
	}

	/**
	 * @param message
	 */
	public ColonnePleineException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ColonnePleineException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ColonnePleineException(String message, Throwable cause) {
		super(message, cause);
	}

}
