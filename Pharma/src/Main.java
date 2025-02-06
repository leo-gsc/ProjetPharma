public class Main {
    public static void main(String[] args) {
        Category cosmetic = new Category("cosmetic");
        Category medicine = new Category("medicine");

        Product doliprane = new Product("doliprane", 13.0f, 2, medicine);
        Product smecta = new Product("smecta", 13.0f, 2, medicine);
        Product shampoo = new Product("shampoo", 13.0f, 2, cosmetic);

        GestionStock stock = new GestionStock();
        stock.addProduct(smecta);
        stock.addProduct(shampoo);
        stock.addProduct(doliprane);
        stock.displayProducts();
        stock.sortProducts();
        stock.displayProducts();



        System.out.println(doliprane.getPrice());
        System.out.println(doliprane.getCategory());
    }
}