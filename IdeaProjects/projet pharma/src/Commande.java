import java.util.List;
import java.util.Date;

public class Commande {
    private int id;  // Identifiant unique pour la commande
    private List<Produit> produits;  // Liste des produits commandés
    private Date dateCommande;  // Date de la commande

    // Constructeur
    public Commande(int id, List<Produit> produits, Date dateCommande) {
        this.id = id;
        this.produits = produits;
        this.dateCommande = dateCommande;
    }

    // Méthode pour afficher les détails de la commande
    public void afficherCommande() {
        System.out.println("ID Commande: " + id);
        System.out.println("Date de Commande: " + dateCommande);
        System.out.println("Produits Commandés:");
        for (Produit produit : produits) {
            System.out.println("Produit: " + produit.getNom() + ", Quantité: " + produit.getQuantite());
        }
    }

    // Getter et Setter pour les attributs si nécessaire
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }
}
