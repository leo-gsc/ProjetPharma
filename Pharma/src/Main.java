public class Main {
    public static void main(String[] args) {
        Category cosmetic = new Category("cosmetic");
        Product doliprane = new Product("dolipranesuperpuissant", 13.0f, 2, cosmetic);

        System.out.println(doliprane.toString());
    }
}