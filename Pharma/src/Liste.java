import java.util.ArrayList;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // Création et remplissage de la liste des produits (médicaments)
        List<String> produits = new ArrayList<>();
        produits.add("dolipranesuperpuissant");
        produits.add("Amoxicillinecourtout");
        produits.add("Azithromycinesupra");

        System.out.println("Liste des produits : " + produits);

        String produitRecherche = "dolipranesuperpuissant";

        boolean trouve = false;
        for (String produit : produits) {
            if (produit.equals(produitRecherche)) {
                System.out.println("Produit trouvé  : " + produitRecherche);
                trouve = true;
                break;  // Sort de la boucle dès que le produit est trouvé
            }
        }
        if (!trouve) {
            System.out.println("Produit non trouvé (avec boucle for) : " + produitRecherche);
        }
    }
}
