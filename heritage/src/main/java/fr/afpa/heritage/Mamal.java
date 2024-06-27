package fr.afpa.heritage;

public class Mamal extends Animal {

    // Attributs
    String furColor;

    // Constructeur
    public Mamal(String species, String ecosystem, String furColor) {
        super(species, ecosystem);
        this.furColor = furColor;
    }

    // Getters & Setters
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    // Méthodes
    @Override
    public String toString() {
        return "Mamal [species=" + species + ", furColor=" + furColor + ", ecosystem=" + ecosystem + ", getSpecies()="
                + getSpecies() + ", getFurColor()=" + getFurColor() + ", getEcosystem()=" + getEcosystem()
                + "]";
    }

}
