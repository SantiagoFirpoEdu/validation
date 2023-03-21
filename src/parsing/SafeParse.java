package parsing;

import option.Option;
import org.jetbrains.annotations.NotNull;
import result.Result;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class SafeParse
{
	private SafeParse() {}
	public static @NotNull Result<Integer, ParseException> safeParseInt(@NotNull String input)
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

	public static @NotNull Option<Integer> parseIntIgnoreError(@NotNull String input)
	{
		try
		{
			return Option.some(NumberFormat.getInstance().parse(input).intValue());
		}
		catch (ParseException exception)
		{
			return Option.none();
		}
	}

	public static @NotNull Result<Double, ParseException> safeParseDouble(@NotNull String input, @NotNull Locale locale)
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

	public static @NotNull Result<Double, ParseException> safeParseDouble(@NotNull String input)
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
