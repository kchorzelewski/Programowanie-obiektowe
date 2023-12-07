import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Osoba implements Comparable<Osoba> {
    String imie;
    int wzrost;
    LocalDate dataUrodzenia;

    Osoba(String imie, int wzrost, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.wzrost = wzrost;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return "" +wzrost;
    }

    @Override
    public int compareTo(Osoba o) {
        return o.wzrost - this.wzrost;
    }

    public static void main(String[] args) {
        ArrayList<Osoba> osobaList = new ArrayList<>();
        osobaList.add(new Osoba("a", 22, LocalDate.of(2023,10,1)));
        osobaList.add(new Osoba("b", 12, LocalDate.of(2023,10,3)));
        osobaList.add(new Osoba("c", 31, LocalDate.of(2023,10,8)));
        osobaList.add(new Osoba("d", 51, LocalDate.of(2022,10,7)));
        System.out.println(osobaList);
        Collections.sort(osobaList);
        System.out.println(osobaList);
    }
}
