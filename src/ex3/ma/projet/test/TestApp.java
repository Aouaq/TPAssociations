package ex3.ma.projet.test;

import ex3.ma.projet.bean.Article;
import ex3.ma.projet.bean.Categorie;

public class TestApp {

    public static void main(String[] args) {

        Categorie[] categories = new Categorie[2];

        categories[0] = new Categorie("PR", "Ordinateur Portable");
        categories[1] = new Categorie("PO", "Ordinateur Poste");

        Article[] articles = new Article[4];

        articles[0] = new Article(14, "DELL INSPIRON", categories[0]);
        articles[1] = new Article(4,  "SONY VAIO",     categories[0]);
        articles[2] = new Article(74,  "TERRA",        categories[1]);
        articles[3] = new Article(785, "HP Compaq",    categories[1]);

        System.out.println("\n Ordinateur Portable: ");
        for (Article article : articles ) {
            if(article.getCategorie().getCode() == "PR") {
                System.out.println("\t -" + article);
            }
        }
        System.out.println("\n Ordinateur Poste:");
        for (Article article : articles ) {
            if(article.getCategorie().getCode() == "PO") {
                System.out.println("\t -" + article);
            }
        }

    }
}