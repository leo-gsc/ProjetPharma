public class Produit {
    private String nom;
    private float prix;
    private int quantite;
    private String categorie;

    public Produit(String nom, float prix, int quantite, String categorie) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
    public String getCategorie() {
        return categorie;
    }
}
