package fr.afpa.heritage;

public abstract class Animal {
    
    //Attributs
    String species;
    String ecosystem;

    //Constructeur
    public Animal(String species, String ecosystem) {
        this.species = species;
        this.ecosystem = ecosystem;
    }

    //Getters & Setters
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getEcosystem() {
        return ecosystem;
    }

    public void setEcosystem(String ecosystem) {
        this.ecosystem = ecosystem;
    }

}
