public class Main {
    public static void main(String[] args) {
        // Créer des catégories
        Category cosmetic = new Category("Cosmetic");
        Category medicine = new Category("Medicine");

        // Créer des produits
        Product Doliprane;
        Doliprane = new Product("Doliprane", 13.0f, 2, medicine, "001");
        Product smecta = new Product("Smecta", 13.0f, 2, medicine, "002");
        Product shampoo = new Product("Shampoo", 13.0f, 2, cosmetic, "003");

        // Créer une instance de GestionStock
        GestionStock stock = new GestionStock();

        // Ajouter les produits au stock
        stock.addProduct(smecta);
        stock.addProduct(shampoo);
        stock.addProduct(Doliprane);

        // Afficher les produits avant le tri
        System.out.println("Products before sorting:");
        stock.displayProducts();

        // Trier les produits
        stock.sortProducts();

        // Afficher les produits après le tri
        System.out.println("\nProducts after sorting:");
        stock.displayProducts();

        // Tester la suppression par recherche avec confirmation
        System.out.println("\nAttempting to delete a product (Smecta):");
        stock.deleteProductBySearch("smecta", true); // Ajout du paramètre true pour confirmer la suppression

        // Afficher les produits après suppression
        System.out.println("\nProducts after deletion:");
        stock.displayProducts();
    }
}
