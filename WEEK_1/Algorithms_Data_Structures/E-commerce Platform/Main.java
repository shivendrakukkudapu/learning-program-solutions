import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ECommerceSearch searchTool = new ECommerceSearch();

        System.out.print("Enter product name to search: ");
        String keyword = sc.nextLine();

        System.out.println("\n--- Linear Search Result ---");
        searchTool.linearSearch(keyword);

        System.out.println("\n--- Binary Search Result ---");
        searchTool.binarySearch(keyword);

        sc.close();
    }
}
