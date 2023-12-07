import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Pracownik implements Comparable<Pracownik> {
    public String imie;
    public double pensja;
    public LocalDate dataZatrudnienia;
    public Pracownik(String imie, double pensja, LocalDate dataZatrudnienia){
        this.imie = imie;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return "" + pensja;
    }

    public static void main(String[] args){
        ArrayList<Pracownik> pracownikList = new ArrayList<>();
        pracownikList.add(new Pracownik("Jano",2000.0, LocalDate.of(2023,10,1)));
        pracownikList.add(new Pracownik("Jano",1234.0, LocalDate.of(2023,10,3)));
        pracownikList.add(new Pracownik("Jano",5555.0, LocalDate.of(2023,10,8)));
        pracownikList.add(new Pracownik("Jano",4823.0, LocalDate.of(2022,10,7)));
        System.out.println(pracownikList);
        Collections.sort(pracownikList);
        System.out.println(pracownikList);
    }

    @Override
    public int compareTo(Pracownik o) {
        return Double.compare(o.pensja, this.pensja);
    }
}
