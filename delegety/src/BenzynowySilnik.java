public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("Silnik został uruchomiony");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Silnik został zatrzymany");
    }
}
