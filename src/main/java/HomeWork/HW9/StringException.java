package HomeWork.HW9;

public class StringException extends RuntimeException{

    private String string;
    public String getSubString(){return string;}

    public StringException (String message){
        super(message);
    }


}
