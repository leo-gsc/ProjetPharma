import java.util.List;

public class Liste {
    /**
     * Recherche un produit dans une liste et affiche un message indiquant s'il a été trouvé ou non.
     *
     * Cette méthode parcourt la liste des produits et vérifie si le produit recherché est présent.
     * Si le produit est trouvé, un message de confirmation est affiché. Sinon, un message indiquant
     * son absence est retourné.
     *
     * @param produits         La liste contenant les noms des produits disponibles.
     * @param produitRecherche Le nom du produit à rechercher dans la liste.
     */
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
