import java.util.List;

public class Liste {
    public static void rechercherProduit(List<String> produits, String produitRecherche) {
        boolean trouve = false;
        for (String produit : produits) {
            if (produit.equals(produitRecherche)) {
                System.out.println("Produit trouvé  : " + produitRecherche);
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            System.out.println("Le produit que vous cherchez n'existe pas ou n'est pas disponible : " + produitRecherche);
        }
    }
}
