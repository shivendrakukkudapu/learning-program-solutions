import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DocFactory factory = null;

        System.out.println("Choose document type:");
        System.out.println("1. Word");
        System.out.println("2. PDF");
        System.out.println("3. Excel");
        System.out.print("Your choice: ");
        int option = sc.nextInt();

        if (option == 1) {
            factory = new WordCreator();
        } else if (option == 2) {
            factory = new PdfCreator();
        } else if (option == 3) {
            factory = new ExcelCreator();
        } else {
            System.out.println("Invalid option.");
            sc.close();
            return;
        }

        MyDocument doc = factory.createDoc();
        doc.openDoc();

        sc.close();
    }
}