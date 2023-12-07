import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Produkt implements Comparable<Produkt> {
    String nazwa;
    double cena;
    LocalDate dataProdukcji;
    LocalDate dataWaznosci;

    Produkt(String nazwa, double cena, LocalDate dataProdukcji, LocalDate dataWaznosci){
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataProdukcji = dataProdukcji;
        this.dataWaznosci = dataWaznosci;
    }

    @Override
    public String toString() {
        return "" + dataProdukcji;
    }

    public static void main(String[] args){
        ArrayList<Produkt> produktList = new ArrayList<>();
        produktList.add(new Produkt("Jano",2000.0, LocalDate.of(2023,10,1), LocalDate.of(2023,10,3)));
        produktList.add(new Produkt("Jano",1234.0, LocalDate.of(2023,10,3), LocalDate.of(2023,10,2)));
        produktList.add(new Produkt("Jano",5555.0, LocalDate.of(2023,10,8), LocalDate.of(2023,10,7)));
        produktList.add(new Produkt("Jano",4823.0, LocalDate.of(2022,10,7), LocalDate.of(2022,10,8)));
        System.out.println(produktList);
        Collections.sort(produktList);
        System.out.println(produktList);
        produktList.sort(new ProduktDateComparator());
        System.out.println(produktList);

    }

    @Override
    public int compareTo(Produkt o) {
        return o.dataProdukcji.compareTo(this.dataProdukcji);
    }
}

class ProduktDateComparator implements Comparator<Produkt>{
    @Override
    public int compare(Produkt o1, Produkt o2) {
        return o1.dataWaznosci.compareTo(o2.dataWaznosci);
    }
}
