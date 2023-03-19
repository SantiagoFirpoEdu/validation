package parsing;

import result.Result;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class SafeParse
{
	private SafeParse() {}
	public static Result<Integer, ParseException> safeParseInt(String input)
	{
		try
		{
			return Result.ok(NumberFormat.getInstance().parse(input).intValue());
		}
		catch (ParseException exception)
		{
			return Result.error(exception);
		}
	}

	public static Result<Double, ParseException> safeParseDouble(String input, Locale locale)
	{
		try
		{
			return Result.ok(NumberFormat.getInstance(locale).parse(input).doubleValue());
		}
		catch (ParseException exception)
		{
			return Result.error(exception);
		}
	}

	public static Result<Double, ParseException> safeParseDouble(String input)
	{
		try
		{
			return Result.ok(NumberFormat.getInstance().parse(input).doubleValue());
		}
		catch (ParseException exception)
		{
			return Result.error(exception);
		}
	}
}
