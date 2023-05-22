package exceptions;

public class LimitOfBookExceededException extends RuntimeException {

    public LimitOfBookExceededException(String message) {
        super(message);
    }
}
