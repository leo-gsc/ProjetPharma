import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestionStock {
    private ArrayList<Product> products;

    public GestionStock() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        if (product.getQuantity() > 0) {
            products.add(product);
            System.out.println(product +" added to stock.");
        } else {
            System.out.println("Cannot add product. Invalid quantity.");
        }
    }
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Stock empty.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public void trierProduct() {
        for (Product product : products) {

        }
    }


}