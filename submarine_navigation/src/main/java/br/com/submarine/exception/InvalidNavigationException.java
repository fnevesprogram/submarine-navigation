package br.com.submarine.exception;

public class InvalidNavigationException extends Exception {

	private static final long serialVersionUID = 7858809737039058033L;

	public InvalidNavigationException() {
	}

	public InvalidNavigationException(String message) {
		super(message);
	}

	public InvalidNavigationException(Throwable cause) {
		super(cause);
	}

	public InvalidNavigationException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidNavigationException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
}
