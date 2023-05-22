package exceptions;

public class DeadlineOutOfDateException extends Exception{
    public DeadlineOutOfDateException(String message){
        super(message);
    }
}
