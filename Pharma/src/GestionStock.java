import java.util.ArrayList;

public class GestionStock {
    private final ArrayList<Product> products;

    /**
     * Constructeur de la classe GestionStock.
     * Initialise une liste vide pour stocker les produits.
     */
    public GestionStock() {
        this.products = new ArrayList<>();
    }

    /**
     * Ajoute un produit au stock si sa quantité est valide (> 0).
     *
     * @param product Le produit à ajouter au stock.
     */
    public void addProduct(Product product) {
        if (product.getQuantity() > 0) {
            products.add(product);
            System.out.println(product + " added to stock.");
        } else {
            System.out.println("Cannot add an inexistent product");
        }
    }

    /**
     * Affiche la liste des produits en stock.
     * Si aucun produit n'est disponible, un message indique que le stock est vide.
     */
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Stock empty.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    /**
     * Calcule et retourne la taille actuelle de la liste de produits.
     *
     * @return Le nombre de produits en stock.
     */
    public int lenArray() {
        int len = 0;
        for (Product product : products) {
            len++;
        }
        return len;
    }

    /**
     * Trie les produits en stock par ordre alphabétique de leur nom en utilisant le tri par sélection.
     */
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

    /**
     * Recherche un produit spécifique dans le stock par son nom.
     * Si le produit est trouvé, affiche son nom et sa quantité.
     * 
     * @param name Le produit à rechercher dans le stock.
     *             Cette méthode compare le produit directement par référence, et non par son nom.
     */
    public void search(Product name) {
        for (Product product : products) {
            if (product == name){
                System.out.println(product.getName() + " found. quantity: " + product.getQuantity());
            }
        }
    }

    public void remove(Product name) {
        for (int i = 0; i < products.size(); i++ ) {
            if (products.get(i) == name) {
                String rem = products.get(i).getName();
                products.remove(i);
                System.out.println(rem + " got removed");
            }

        }
    }
}
