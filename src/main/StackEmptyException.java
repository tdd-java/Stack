public class StackEmptyException extends Throwable {
    public StackEmptyException() {
        super("Cannot Pop from Empty stack! ");
    }
}
