import java.util.List;
import java.util.Date;

public class CommandeStandard extends Commande {
    public CommandeStandard(int id, List<Produit> produits, Date dateCommande) {
        super(id, produits, dateCommande);
    }

    @Override
    public void afficherCommande() {
        System.out.println("Commande Standard");
        super.afficherCommande();
    }
}
