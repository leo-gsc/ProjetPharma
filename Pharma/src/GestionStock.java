import java.util.ArrayList;

public class GestionStock {
    private final ArrayList<Product> products;

    public GestionStock() {
        this.products = new ArrayList<>();
    }

    // Add product to stock
    public void addProduct(Product product) {
        if (product.getQuantity() > 0) {
            products.add(product);
            System.out.println(product + " added to stock.");
        } else {
            System.out.println("Cannot add an inexistent product.");
        }
    }

    // Delete product by search term (no user interaction)
    public void deleteProductBySearch(String searchTerm, boolean confirmDeletion) {
        Product foundProduct = null;
        // Search for the product by name or ID
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(searchTerm) || product.getId().equalsIgnoreCase(searchTerm)) {
                foundProduct = product;
                break;
            }
        }

        if (foundProduct == null) {
            System.out.println("Product not found.");
            return;
        }

        // If user confirms deletion (here passed as a parameter)
        if (confirmDeletion) {
            products.remove(foundProduct);
            System.out.println(foundProduct + " removed from stock.");
        } else {
            System.out.println("Deletion canceled.");
        }
    }

    // Display all products
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Stock is empty.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    // Length of the array
    public int lenArray() {
        int len = 0;
        for (Product product : products) {
            len++;
        }
        return len;
    }

    // Sort products alphabetically by name
    public void sortProducts() {
        int lenA = lenArray();

        for (int i = 0; i < lenA - 1; i++) {
            int min = i;
            for (int j = i + 1; j < lenA; j++) {
                if (products.get(j).getName().compareTo(products.get(min).getName()) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                Product exch = products.get(i);
                products.set(i, products.get(min));
                products.set(min, exch);
            }
        }
    }
}
