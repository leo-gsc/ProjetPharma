/**
 * Classe principale pour tester la gestion du stock de produits.
 * Ce programme crée des catégories, des produits et gère leur ajout, recherche, 
 * affichage et tri dans un stock.
 */
public class Main {
    public static void main(String[] args) {
        // Création des catégories
        Category cosmetic = new Category("cosmetic");
        Category medicine = new Category("medicine");

        // Création de produits avec leurs informations
        Product doliprane = new Product("doliprane", 13.0f, 50, medicine);
        Product smecta = new Product("smecta", 13.0f, 2, medicine);
        Product shampoo = new Product("shampoo", 13.0f, 2, cosmetic);

        // Création de l'objet GestionStock pour gérer le stock de produits
        GestionStock stock = new GestionStock();

        // Ajout de produits dans le stock
        stock.addProduct(smecta);
        stock.addProduct(shampoo);
        stock.addProduct(doliprane);

        // Recherche d'un produit spécifique dans le stock et affichage de ses détails
        stock.search(doliprane);

        // Affichage des produits en stock avant le tri
        stock.displayProducts();

        // Tri des produits par ordre alphabétique et affichage après le tri
        stock.sortProducts();
        stock.displayProducts();

        // Affichage du prix du produit doliprane
        System.out.println(doliprane.getPrice());

        // Affichage de la catégorie du produit doliprane
        System.out.println(doliprane.getCategory());
    }
}
