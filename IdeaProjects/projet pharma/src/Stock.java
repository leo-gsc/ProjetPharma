import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Produit> stockProduits;

    public Stock() {
        stockProduits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit, int quantite) {
        stockProduits.add(new Produit(produit.getNom(), quantite));
    }

    public int getStockProduit(String nom) {
        for (Produit produit : stockProduits) {
            if (produit.getNom().equals(nom)) {
                return produit.getQuantite();
            }
        }
        return 0; // Si le produit n'est pas trouvé, retourne 0
    }
}
