public class Main {
    public static void main(String[] args) {
        Categorie cosmetique = new Categorie("cosmetique");
        Produit doliprane = new Produit("dolipranesuperpuissant", 13.0f, 2, cosmetique);

        System.out.println(doliprane.toString());
    }
}