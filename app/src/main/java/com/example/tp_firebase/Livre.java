package com.example.tp_firebase;

public class Livre {
    public String titre,auteur,hall;
    public int nbPage;

    public Livre() {
    }

    public Livre(String titre, String auteur, String hall, int nbPage) {
        this.titre = titre;
        this.auteur = auteur;
        this.hall = hall;
        this.nbPage = nbPage;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }
}
