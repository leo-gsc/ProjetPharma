/**
 * Représente un produit avec un nom, un prix, une quantité en stock et une catégorie.
 */
public class Product {
    private String name;
    private float price;
    private int quantity;
    private Category category;

    /**
     * Constructeur pour initialiser un produit avec son nom, prix, quantité et catégorie.
     * 
     * @param name Le nom du produit.
     * @param price Le prix du produit.
     * @param quantity La quantité disponible en stock du produit.
     * @param category La catégorie à laquelle appartient le produit.
     */
    public Product(String name, float price, int quantity, Category category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    /**
     * Récupère le nom du produit.
     * 
     * @return Le nom du produit.
     */
    public String getName() {
        return name;
    }

    /**
     * Définit le nom du produit.
     * 
     * @param name Le nom du produit à définir.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Récupère la quantité du produit en stock.
     * 
     * @return La quantité du produit en stock.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Définit la quantité du produit en stock.
     * 
     * @param quantity La quantité du produit à définir.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Récupère le prix du produit.
     * 
     * @return Le prix du produit.
     */
    public float getPrice() {
        return price;
    }

    /**
     * Définit le prix du produit.
     * 
     * @param price Le prix du produit à définir.
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Récupère le nom de la catégorie du produit.
     * 
     * @return Le nom de la catégorie du produit.
     */
    public String getCategory() {
        return category.getName();
    }

    /**
     * Définit la catégorie du produit.
     * 
     * @param category La catégorie du produit à définir.
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du produit.
     * Affiche le nom, le prix, la quantité en stock et la catégorie du produit.
     * 
     * @return La chaîne de caractères représentant le produit.
     */
    @Override
    public String toString() {
        return getName() + " : " + getPrice() + "€, Stock: " + getQuantity() + ", Category: " + getCategory();
    }
}
