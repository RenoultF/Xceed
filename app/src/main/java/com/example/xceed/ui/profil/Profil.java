package com.example.xceed.ui.profil;

public class Profil {
    private String pseudo;
    private int taille;
    private String kg;

    public Profil(String p, int t, String k){
        this.pseudo = p;
        this.taille = t;
        this.kg = k;
    }

    public String getKg() {
        return kg;
    }

    public int getTaille() {
        return taille;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setKg(String kg) {
        this.kg = kg;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}

