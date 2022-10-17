package lambdaexpression;

public class IUserEntryValidator {
	@FunctionalInterface
	public interface IUserEntryValidator {
		public boolean validate (String input) throws UserValidationException;
	}
}
