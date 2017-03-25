public class StackOverflowException extends Throwable {
    public StackOverflowException() {
        super("Stack capacity is Full!");
    }
}
