import java.util.List;
import java.util.Date;

public class CommandeUrgente extends Commande {
    public CommandeUrgente(int id, List<Produit> produits, Date dateCommande) {
        super(id, produits, dateCommande);
    }

    @Override
    public void afficherCommande() {
        System.out.println("️ COMMANDE URGENTE !!! Priorité haute !");
        super.afficherCommande();
    }
}
