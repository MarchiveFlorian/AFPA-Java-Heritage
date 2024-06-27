package fr.afpa.heritage;

public class Fish extends Animal {

    // Attributs
    int preferredWaterDepth;

    // Constructeur
    public Fish(String species, String ecosystem, int preferredWaterDepth) {
        super(species, ecosystem);
        this.preferredWaterDepth = preferredWaterDepth;
    }

    // Getters & Setters
    public int getPreferredWaterDepth() {
        return preferredWaterDepth;
    }

    public void setPreferredWaterDepth(int preferredWaterDepth) {
        this.preferredWaterDepth = preferredWaterDepth;
    }

    // Méthodes
    @Override
    public String toString() {
        return "Fish [preferredWaterDepth=" + preferredWaterDepth + ", species=" + species + ", ecosystem=" + ecosystem
                + ", getSpecies()=" + getSpecies() + ", getPreferredWaterDepth()=" + getPreferredWaterDepth()
                + ", getEcosystem()=" + getEcosystem() + "]";
    }

}
