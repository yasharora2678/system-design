// Adapter
public class PrinterAdapter implements Printer {
    private final LegacyPrinter legacyPrinter = new LegacyPrinter();

    @Override
    public void print() {
        legacyPrinter.printDocument();
    }
}