import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Category cosmetic = new Category("cosmetic");
        Product doliprane = new Product("dolipranesuperpuissant", 13.0f, 2, cosmetic);
        Product amoxicilline = new Product("Amoxicillinecourtout", 5, 10, cosmetic);
        Product azithromycine = new Product("Azithromycinesupra", 50, 1, cosmetic);

        System.out.println(doliprane);
        System.out.println(amoxicilline);
        System.out.println(azithromycine);

        List<String> nomsProduits = new ArrayList<>();
        nomsProduits.add(doliprane.getName());
        nomsProduits.add(amoxicilline.getName());
        nomsProduits.add(azithromycine.getName());

        String produitRecherche = "dolipranesuperpuissant";
        Liste.rechercherProduit(nomsProduits, produitRecherche);
    }
}