import java.util.*;

public class ECommerceSearch {
    private List<Product> products;

    public ECommerceSearch() {
        products = new ArrayList<>();
        products.add(new Product(101, "OnePlus 11", "Mobile"));
        products.add(new Product(102, "Lenovo ThinkPad", "Laptop"));
        products.add(new Product(103, "JBL Earbuds", "Audio"));
        products.add(new Product(104, "Nike ZoomX", "Shoes"));
        products.add(new Product(105, "NoiseFit Pulse", "Wearable"));
    }

    public void linearSearch(String keyword) {
        boolean found = false;
        keyword = keyword.toLowerCase();

        for (Product p : products) {
            if (p.getName().toLowerCase().contains(keyword)) {
                p.print();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No match found in linear search.");
        }
    }

    public void binarySearch(String keyword) {
        List<Product> sortedList = new ArrayList<>(products);
        sortedList.sort(Comparator.comparing(Product::getName, String.CASE_INSENSITIVE_ORDER));

        System.out.println("\nSorted Products for Binary Search:");
        for (Product p : sortedList) {
            p.print();
        }

        int low = 0, high = sortedList.size() - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midName = sortedList.get(mid).getName().toLowerCase();
            int cmp = midName.compareTo(keyword.toLowerCase());

            if (midName.contains(keyword.toLowerCase())) {
                System.out.println("\nMatch found in binary search:");
                sortedList.get(mid).print();
                found = true;
                break;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("\nNo match found in binary search.");
        }
    }
}

