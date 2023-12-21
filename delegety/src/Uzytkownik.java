public class Uzytkownik {
    private Powiadomienie powiadomienie;
    Uzytkownik(Powiadomienie powiadomienie){
        this.powiadomienie = powiadomienie;
    }
    void powiadomOModernizacji(String informacja){
        powiadomienie.wyslij(informacja);
    }
}
