package parsing;

import result.Result;

import java.text.NumberFormat;
import java.text.ParseException;

public class SafeParse
{
	private SafeParse() {}
	public static Result<Integer, NumberFormatException> safeParseInt(String input)
	{
		try
		{
			return Result.ok(Integer.parseInt(input));
		}
		catch (NumberFormatException exception)
		{
			return Result.error(exception);
		}
	}

	public static Result<Double, Exception> safeParseDouble(String input)
	{
		try
		{
			return Result.ok(NumberFormat.getInstance().parse(input).doubleValue());
		}
		catch (NumberFormatException | ParseException exception)
		{
			return Result.error(exception);
		}
	}
}
