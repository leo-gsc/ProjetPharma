import java.util.ArrayList;

public class GestionStock {
    private final ArrayList<Product> products;

    public GestionStock() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product.getQuantity() > 0) {
            products.add(product);
            System.out.println(product +" added to stock.");
        } else {
            System.out.println("cannot add an inexistent product");
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

    public int lenArray() {
        int len = 0;
        for (Product product : products) {
            len++;
        }
        return len;
    }

    public void sortProducts() {
        int lenA = lenArray();

        for (int i = 0; i < lenA - 1; i++) {
            int min = i;
            for (int j = i + 1; j < lenA; j++) {
                if (products.get(j).getName().compareTo(products.get(min).getName()) <0) {
                    min = j;
                }
            }
            if (min != i){
                Product exch = products.get(i);
                products.set(i, products.get(min));
                products.set(min, exch);
            }
        }
    }



}