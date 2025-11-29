package ex3.ma.projet.bean;

public class Categorie {
    private static int compteur = 1;
    private int id;
    private String code;
    private String libelle;

    public Categorie(String code, String libelle) {
        this.id = ++compteur;
        this.code = code;
        this.libelle = libelle;
    }


    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Categorie{id=" + id + ", libelle='" + libelle + "', code='"+ code +"'}";
    }
}