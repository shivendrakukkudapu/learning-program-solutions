public class PdfCreator extends DocFactory {
    public MyDocument createDoc() {
        return new PdfFile();
    }
}