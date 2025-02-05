import java.util.ArrayList;

public class GestionStock {
    private ArrayList<Product> products;


    public void ajouterProduit(Product p) {
        products.add(p);
    }

    public void listerProducts() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void trierProduct() {

    }


}