public class Product {
    private String name;
    private float price;
    private int quantity;
    private Category category;
    private String id;  // Ajout d'un identifiant pour le produit

    public Product(String name, float price, int quantity, Category category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.id = generateId();  // Définir l'ID lors de la création du produit
    }

    public Product(String Doliprane, float price, int quantity, Category medicine, String number) {
    }

    // Générer un ID unique basé sur le nom du produit et la catégorie
    private String generateId() {
        return this.name + "_" + this.category.getName() + "_" + System.currentTimeMillis();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category.getName();
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getId() {
        return this.id;  // Retourne l'ID unique
    }

    @Override
    public String toString() {
        return getName() + " : " + getPrice() + "€, Stock: " + getQuantity() + ", Category: " + getCategory() + ", ID: " + getId();
    }
}
