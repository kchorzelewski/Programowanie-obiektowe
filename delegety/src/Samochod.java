public class Samochod {
    private Silnik silnik;
    Samochod(Silnik silnik){

    }

    void start(){
        silnik.uruchom();
    }

    void stop(){
        silnik.zatrzymaj();
    }
}
