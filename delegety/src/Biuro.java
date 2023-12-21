public class Biuro {
    private Printer printer;
    Biuro(Printer printer){
        this.printer = printer;
    }

    public void drukujDokument(String tekst){
        printer.drukuj(tekst);
    }
}
