public class ExcelCreator extends DocFactory {
    public MyDocument createDoc() {
        return new ExcelFile();
    }
}