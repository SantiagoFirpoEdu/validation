package input;

import org.jetbrains.annotations.NotNull;

public class StringValidation
{
	public static boolean isNotBlank(@NotNull String input)
	{
		return !input.isBlank();
	}

	private StringValidation() {}
}
