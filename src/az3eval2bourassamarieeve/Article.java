/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az3eval2bourassamarieeve;

/**
 *
 * @author TQY_06
 */
public class Article {

    private String codesArticles;
    private String designationArticles;
    private int codeCategories;
    private double prixUnitaire;

    public Article() {
    }

    public Article(String codesArticles, String designationArticles, int codeCategories, double prixUnitaire) {
        this.codesArticles = codesArticles;
        this.designationArticles = designationArticles;
        this.codeCategories = codeCategories;
        this.prixUnitaire = prixUnitaire;
    }

    public String getCodesArticles() {
        return codesArticles;
    }

    public void setCodesArticles(String codesArticles) {
        this.codesArticles = codesArticles;
    }

    public String getDesignationArticles() {
        return designationArticles;
    }

    public void setDesignationArticles(String designationArticles) {
        this.designationArticles = designationArticles;
    }

    public int getCodeCategories() {
        return codeCategories;
    }

    public void setCodeCategories(int codeCategories) {
        this.codeCategories = codeCategories;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

}
