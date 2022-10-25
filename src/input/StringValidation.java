package input;

public class StringValidation
{
	private StringValidation() {}
	public static boolean isNotBlank(String input)
	{
		return !input.isBlank();
	}
}
