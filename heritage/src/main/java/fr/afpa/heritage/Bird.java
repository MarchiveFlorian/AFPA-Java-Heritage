package fr.afpa.heritage;

public class Bird extends Animal {

    // Attributs
    int wingSpan;

    // Constructeur
    public Bird(String species, String ecosystem, int wingSpan) {
        super(species, ecosystem);
        this.wingSpan = wingSpan;
    }

    // Getters & Setters
    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "Bird [species=" + species + ", wingSpan=" + wingSpan + ", ecosystem=" + ecosystem + ", getWingSpan()="
                + getWingSpan() + ", getSpecies()=" + getSpecies() + ", getEcosystem()=" + getEcosystem()
                + "]";
    }

    // Méthodes

}
