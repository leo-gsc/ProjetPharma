public class Produit {
    private String nom;
    private float prix;
    private int quantite;
    private Categorie categorie;

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

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {}
}
