package exceptions;

public class ListIsEmptyException extends Exception {

    public ListIsEmptyException(String message) {
        System.out.println(message);
    }
}

