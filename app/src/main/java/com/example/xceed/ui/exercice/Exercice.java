package com.example.xceed.ui.exercice;

public class Exercice {

    private String nomExercice;
    private String descriptionExercice;
    private String categorie;

    private int nbSerie;

    private int idGif;

    public Exercice(String nom, String dE, int idGif, String categorie){
        this.nomExercice = nom;
        this.descriptionExercice = dE;
        this.idGif = idGif;
        this.categorie = categorie;
    }

    public String getNomExerciceEx() {
        return nomExercice;
    }

    public int getNbSerie() {
        return nbSerie;
    }

    public String getDescriptionExercice() {
        return descriptionExercice;
    }

    public int getIdGif() {
        return idGif;
    }

    public String getCategorie() {
        return categorie;
    }
}
