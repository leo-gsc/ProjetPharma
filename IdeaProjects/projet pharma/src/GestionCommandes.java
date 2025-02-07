public class GestionCommandes {

    // Méthode pour valider une commande
    public boolean validerCommande(Commande commande, Stock stock) {
        boolean estValide = true;

        // Vérifier les stocks avant validation
        for (Produit produit : commande.getProduits()) {
            int stockDisponible = stock.getStockProduit(produit.getNom());
            if (produit.getQuantite() > stockDisponible) {
                System.out.println("Erreur : Stock insuffisant pour " + produit.getNom());
                estValide = false;
            }
        }

        // Si tous les produits ont un stock suffisant, valider la commande
        if (estValide) {
            System.out.println("Commande validée.");
        }

        return estValide;
    }
}
