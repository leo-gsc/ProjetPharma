import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Création des produits avec un stock initial
        Produit paracetamol = new Produit("Paracétamol", 10);
        Produit ibuprofene = new Produit("Ibuprofène", 15);

        // Création du stock
        Stock stock = new Stock();
        stock.ajouterProduit(paracetamol, 10);
        stock.ajouterProduit(ibuprofene, 15);

        // Création d'une commande standard
        List<Produit> produitsStandard = new ArrayList<>();
        produitsStandard.add(new Produit("Paracétamol", 2));
        produitsStandard.add(new Produit("Ibuprofène", 3));

        Commande commandeStandard = new CommandeStandard(1, produitsStandard, new Date());

        // Création d'une commande urgente
        List<Produit> produitsUrgente = new ArrayList<>();
        produitsUrgente.add(new Produit("Paracétamol", 1));

        Commande commandeUrgente = new CommandeUrgente(2, produitsUrgente, new Date());

        // Vérification et affichage des commandes
        GestionCommandes gestion = new GestionCommandes();

        if (gestion.validerCommande(commandeStandard, stock)) {
            System.out.println("Commande Standard acceptée !");
            commandeStandard.afficherCommande();
        } else {
            System.out.println(" Commande Standard refusée !");
        }

        if (gestion.validerCommande(commandeUrgente, stock)) {
            System.out.println(" Commande Urgente acceptée !");
            commandeUrgente.afficherCommande();
        } else {
            System.out.println(" Commande Urgente refusée !");
        }
    }
}
