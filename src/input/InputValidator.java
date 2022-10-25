package input;

@FunctionalInterface
public interface InputValidator<T>
{
	boolean validate(T input);
}
