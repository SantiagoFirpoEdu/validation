package parsing;

import result.GResult;

import java.text.NumberFormat;
import java.text.ParseException;

public class SafeParse
{
	private SafeParse() {}
	public static GResult<Integer, NumberFormatException> safeParseInt(String input)
	{
		try
		{
			return GResult.ok(Integer.parseInt(input));
		}
		catch (NumberFormatException exception)
		{
			return GResult.error(exception);
		}
	}

	public static GResult<Double, Exception> safeParseDouble(String input)
	{
		try
		{
			return GResult.ok(NumberFormat.getInstance().parse(input).doubleValue());
		}
		catch (NumberFormatException | ParseException exception)
		{
			return GResult.error(exception);
		}
	}
}
