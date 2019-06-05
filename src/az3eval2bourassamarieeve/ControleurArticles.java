/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az3eval2bourassamarieeve;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author TQY_06
 */
public class ControleurArticles {

    private ArticleVue vue;
    private ModelVueArticles model;
    private Articles article;
    private ArrayList<Articles> ArticlesList;
    private int i;

    public ControleurArticles(ArticleVue vue, ModelVueArticles model) throws SQLException {
        try {

            this.vue = vue;
            this.model = model;
            article = new Articles();
            i = 0;
            ArrayList<Articles> ArticlesList = model.getArticles();
            setTooTip();
             setData(vue, ArticlesList, i);

            vue.getjButtonDebut().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    i = 0;
                     setData(vue, ArticlesList, i);
                }
            });

            vue.getjButtonDernier().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    i = ArticlesList.size() - 1;
                     setData(vue, ArticlesList, i);

                }
            });
            vue.getjButtonSuivant().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (i != ArticlesList.size() - 1) {
                        i++;
                    }
                     setData(vue, ArticlesList, i);
                }
            });

            vue.getjButtonPrecedent().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (i != 0) {
                        i--;
                    }
                     setData(vue, ArticlesList, i);
                }
            });

            vue.getjButtonNouveau().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    try {
                        vue.getjTextFieldCodeArticles().setText("");
                        vue.getjTextFieldDesignationArticles().setText("");
                        vue.getjTextFieldCodeCategorie().setText("");
                        vue.getjTextFieldPrixUnitaire().setText("");
                        vue.getjButtonAjouter().setEnabled(true);
                        vue.getjButtonAnnuler().setEnabled(true);
                        vue.getjLabelInstructions().setText("Entrez les informations requise");
                        vue.getjLabelInstructions().setVisible(true);

                    } catch (Exception p) {
                        JOptionPane.showMessageDialog(null, "Erreur");
                    }
                }

            });

            vue.getjButtonAjouter().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String codesArticles, designationArticles;
                        int codeCategories;
                        double prixUnitaire;
                        codesArticles = vue.getjTextFieldCodeArticles().getText();
                        designationArticles = vue.getjTextFieldDesignationArticles().getText();
                        codeCategories = Integer.parseInt(vue.getjTextFieldCodeCategorie().getText());
                        prixUnitaire = Double.parseDouble(vue.getjTextFieldPrixUnitaire().getText());

                        model.addArticles(codesArticles, designationArticles, codeCategories, prixUnitaire);
                        vue.getjButtonAjouter().setEnabled(false);

                    } catch (Exception p) {
                        JOptionPane.showMessageDialog(null, "Je n'ai pas pus obtenir la base de donner");
                    }
                }

            });
            vue.getjButtonAnnuler().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    try {

                        vue.getjButtonAjouter().setEnabled(false);
                        vue.getjButtonAnnuler().setEnabled(false);
                        vue.getjLabelInstructions().setVisible(false);
                        setData(vue, ArticlesList, i);
                    } catch (Exception p) {
                        JOptionPane.showMessageDialog(null, "Erreur");
                    }
                }

            });

        } catch (IndexOutOfBoundsException e) {
            i = 0;

        }
    }

    public void setData(ArticleVue vue, ArrayList<Articles> ArticlesList, int i) {
        vue.getjTextFieldCodeArticles().setText(String.valueOf(ArticlesList.get(i).getCodesArticles()));
        vue.getjTextFieldDesignationArticles().setText(String.valueOf(ArticlesList.get(i).getDesignationArticles()));
        vue.getjTextFieldCodeCategorie().setText(String.valueOf(ArticlesList.get(i).getCodeCategories()));
        vue.getjTextFieldPrixUnitaire().setText(String.valueOf(ArticlesList.get(i).getPrixUnitaire()));
    }

    public void setTooTip() {
        vue.getjButtonDebut().setToolTipText("Retour au début");
        vue.getjButtonPrecedent().setToolTipText("Precedent");
        vue.getjButtonSuivant().setToolTipText("Suivant");
        vue.getjButtonDernier().setToolTipText("Allez au dernier item");
        vue.getjButtonNouveau().setToolTipText("Ajouter un nouvel article");
        vue.getjButtonSupprimer().setToolTipText("Supprimer un article");
        vue.getjButtonModifier().setToolTipText("Modifier un article");
    }

}
