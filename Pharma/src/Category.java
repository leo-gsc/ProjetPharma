/**
 * Représente une catégorie avec un nom.
 */
public class Category {
    private String name;

    /**
     * Constructeur pour initialiser la catégorie avec un nom.
     * 
     * @param name Le nom de la catégorie.
     */
    public Category(String name) {
        this.name = name;
    }

    /**
     * Récupère le nom de la catégorie.
     * 
     * @return Le nom de la catégorie.
     */
    public String getName() {
        return name;
    }

    /**
     * Définit le nom de la catégorie.
     * 
     * @param name Le nom de la catégorie à définir.
     */
    public void setName(String name) {
        this.name = name;
    }
}
