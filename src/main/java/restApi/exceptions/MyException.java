package restApi.exceptions;

public class MyException extends Exception{
    private static final long serialVersionUID = -1344640670884805385L;

    public static final String DESCRIPTION = "Error nuevo";

    public static final int CODE = 532;

    public MyException() {
        this("");
    }

    public MyException(String detail) {
        super(DESCRIPTION + ". " + detail + ". CODE: " + CODE);
    }

}
