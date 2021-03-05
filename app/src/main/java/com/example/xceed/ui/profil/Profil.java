package com.example.xceed.ui.profil;

public class Profil {
    private String pseudo;
    private int taille;
    private String kg;
    private String imc;

    public Profil(String p, int t, String k,String imc){
        this.pseudo = p;
        this.taille = t;
        this.kg = k;
        this.imc = imc;
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

    public String getImc() {
        return imc;
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

    public void setImc(String imc) {
        this.imc = imc;
    }

    public float calculImc(){
        float tailleImc = (float)this.taille/100;
        float imcTemp = Float.parseFloat(this.kg)/(tailleImc*tailleImc);
        this.imc = String.valueOf(imcTemp);
        return imcTemp;
    }
}

