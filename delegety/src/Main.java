import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NiepoprawnyformatDanychException {
//        KierownikWycieczki kierownik = new KierownikWycieczki(new Koncert());
//        kierownik.zalatwBilety();
//        kierownik = new KierownikWycieczki(new BramkaNaAutostradzie());
//        kierownik.zalatwBilety();
//        kierownik = new KierownikWycieczki(new LotMiedzynarodowy());
//        kierownik.zalatwBilety();
//        checkAge(18);
//        checkAge(17);

//        dzielenie();

        try {
            sprawdzFormatDanych("aaa@");
        }
        catch(NiepoprawnyformatDanychException e){
            System.out.println(e);
        }
    }
    static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Wiek ponizej 18 lat");
        }
    }
    static void dzielenie(){
        Scanner scanner = new Scanner(System.in);
        int wynik;
        try{
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            wynik = a/b;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (InputMismatchException e) {
            System.out.println(e);
        }
    }
    static void sprawdzFormatDanych(String dane) throws NiepoprawnyformatDanychException {
        if(!dane.toUpperCase().matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")){
            throw new NiepoprawnyformatDanychException();
        }

    }
}