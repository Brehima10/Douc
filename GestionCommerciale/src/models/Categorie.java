/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author HP
 */
public class Categorie {
    private int id;
    private int libelle;

    public Categorie() {
    }

    public Categorie(int id, int libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Categorie(int libelle) {
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLibelle() {
        return libelle;
    }

    public void setLibelle(int libelle) {
        this.libelle = libelle;
    }
    
    
}
