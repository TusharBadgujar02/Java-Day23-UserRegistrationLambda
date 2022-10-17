package lambdaexpression;

public class UserValidation extends Exception {
	public ExceptionType type;
	
	public enum ExceptionType{
		ENTERED_NULL, ENTERED_EMPTY
	}

	public UserValidationException() {

	}

	public UserValidation(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}

}
