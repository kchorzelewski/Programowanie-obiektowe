package exception;

public class Sprawdzanie {
    public static void main(String[] args) {
        try{
            SprawdzFormatDanych("ad");
        }catch (NiepoprawnyFormatDanychException e){
            System.out.println("error");
            System.out.println(e.getMessage());
        }
    }
    public static void SprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException{
        if(dane.length() < 3){
            throw new NiepoprawnyFormatDanychException("Zle jest");
        }
        else{
            System.out.println("dobrze");
        }

    }
}
