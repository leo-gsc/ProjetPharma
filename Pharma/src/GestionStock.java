import java.util.ArrayList;

public class GestionStock {
    private ArrayList<Produit> produits;


    public void ajouterProduit(Produit p) {
        produits.add(p);
    }

    public void listerProduits() {
        for (Produit p : produits) {
            System.out.println(p);
        }
    }

    public void trierProduit() {

    }


}