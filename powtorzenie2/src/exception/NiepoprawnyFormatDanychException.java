package exception;

public class NiepoprawnyFormatDanychException extends Exception{
    public NiepoprawnyFormatDanychException(){
        super();
    }

    public NiepoprawnyFormatDanychException(String cos){
        super(cos);
    }

}
