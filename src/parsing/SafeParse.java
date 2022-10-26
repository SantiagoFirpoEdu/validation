package parsing;

import result.GResult;

import java.text.NumberFormat;
import java.text.ParseException;

public class SafeParse
{
	private SafeParse() {}
	public static GResult<Integer, ParseException> safeParseInt(String input)
	{
		try
		{
			return GResult.ok(NumberFormat.getInstance().parse(input).intValue());
		}
		catch (ParseException exception)
		{
			return GResult.error(exception);
		}
	}

	public static GResult<Double, ParseException> safeParseDouble(String input)
	{
		try
		{
			return GResult.ok(NumberFormat.getInstance().parse(input).doubleValue());
		}
		catch (ParseException exception)
		{
			return GResult.error(exception);
		}
	}
}
