package Drukarka;

public interface Printer {
    void drukuj(String tekst);
}

class NiestandardowyPrinter implements Printer{
    @Override
    public void drukuj(String tekst) {
        StringBuilder wynik = new StringBuilder(tekst);
        System.out.println(wynik.reverse().toString());

    }

    class Biuro{
        private Printer prntr;

        public Biuro(Printer prntr){
            this.prntr = prntr;
        }

        public void drukujDokument(String tekst){
            prntr.drukuj(tekst);
        }
    }
    class main{
        public static void main(String[] args) {
            //Biuro b1 = new Biuro("biuro");
        }
    }
}