public class Main {
    public static void main(String[] args) {
        Category cosmetic = new Category("cosmetic");
        Product doliprane = new Product("dolipranesuperpuissant", 13.0f, 2, cosmetic);
        Category cosmetics = new Category("Médicaments");
        Product Amoxicilline = new Product("Amoxicillinecourtout", 5, 10, cosmetic);
        Category Médicaments = new Category("Médicaments");
        Product Azithromycine = new Product("Azithromycinesupra", 50, 1, cosmetic);
        System.out.println(doliprane.toString());
        System.out.println(Amoxicilline.toString());
        System.out.println(Azithromycine.toString());
    }
}
