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
    private boolean nouveauActif, modifierActif;

    public ControleurArticles(ArticleVue vue, ModelVueArticles model) throws SQLException {
        try {

            this.vue = vue;
            this.model = model;
            article = new Articles();
            i = 0;
            nouveauActif = false;
            modifierActif = false;
            ArrayList<Articles> ArticlesList = model.getArticles();
            setTooTip();
            getRow(vue, ArticlesList, i);

            vue.getjButtonPremier().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (i == 0) {
                        JOptionPane.showMessageDialog(null, "Vous êtes déjà au premier enregistrement");
                    } else {
                        i = 0;
                        getRow(vue, ArticlesList, i);
                    }
                }
            });

            vue.getjButtonDernier().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (i == ArticlesList.size() - 1) {
                        JOptionPane.showMessageDialog(null, "Vous êtes déjà au dernier enregistrement");
                    } else {
                        i = ArticlesList.size() - 1;
                        getRow(vue, ArticlesList, i);
                    }
                }
            });
            vue.getjButtonSuivant().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (i == ArticlesList.size() - 1) {
                        JOptionPane.showMessageDialog(null, "Vous êtes au derniers enregistrement");
                    } else {
                        i++;
                        getRow(vue, ArticlesList, i);
                    }
                }
            });

            vue.getjButtonPrecedent().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (i == 0) {
                        JOptionPane.showMessageDialog(null, "Vous êtes au premier enregistrement");
                    } else {
                        i--;
                        getRow(vue, ArticlesList, i);
                    }

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
                        vue.getjButtonSuivant().setEnabled(false);
                        vue.getjButtonPrecedent().setEnabled(false);
                        vue.getjButtonPremier().setEnabled(false);
                        vue.getjButtonDernier().setEnabled(false);
                        vue.getjButtonNouveau().setEnabled(false);
                        vue.getjButtonModifier().setEnabled(false);
                        vue.getjButtonSupprimer().setEnabled(false);
                        vue.getjLabelInstructions().setText("Entrez les informations requise");
                        vue.getjLabelInstructions().setVisible(true);
                        nouveauActif = true;

                    } catch (Exception p) {
                        JOptionPane.showMessageDialog(null, "Erreur");
                    }
                }
            });

            vue.getjButtonAjouter().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    if (nouveauActif == true) {

                        String codesArticles, designationArticles;
                        int codeCategories;
                        double prixUnitaire;
                        codesArticles = vue.getjTextFieldCodeArticles().getText();
                        designationArticles = vue.getjTextFieldDesignationArticles().getText();
                        codeCategories = Integer.parseInt(vue.getjTextFieldCodeCategorie().getText());
                        prixUnitaire = Double.parseDouble(vue.getjTextFieldPrixUnitaire().getText());
                        model.addArticles(codesArticles, designationArticles, codeCategories, prixUnitaire);
                        nouveauActif = false;
                        vue.getjButtonAjouter().setEnabled(false);
                        vue.getjButtonAnnuler().setEnabled(false);
                        vue.getjButtonSuivant().setEnabled(true);
                        vue.getjButtonPrecedent().setEnabled(true);
                        vue.getjButtonPremier().setEnabled(true);
                        vue.getjButtonDernier().setEnabled(true);
                        vue.getjButtonNouveau().setEnabled(true);
                        vue.getjButtonModifier().setEnabled(true);
                        vue.getjButtonSupprimer().setEnabled(true);
                         getRow(vue, ArticlesList, i);
                    }

                    if (modifierActif == true) {

                    }
//                    try {
//                        refreshList();
//                        i = ArticlesList.size() - 1;
//                       
//                    } catch (SQLException ref) {
//                        JOptionPane.showMessageDialog(null, "Je n'ai pas pus mettre la base de donner a jours");
//                    }
                }
            });

            vue.getjButtonModifier().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    try {
                        vue.getjTextFieldDesignationArticles().setText("");
                        vue.getjTextFieldCodeCategorie().setText("");
                        vue.getjTextFieldPrixUnitaire().setText("");
                        vue.getjButtonAjouter().setEnabled(true);
                        vue.getjButtonAnnuler().setEnabled(true);
                        vue.getjLabelInstructions().setText("Entrez les informations que vous vulez modifier");
                        vue.getjLabelInstructions().setVisible(true);

                    } catch (Exception p) {
                        JOptionPane.showMessageDialog(null, "Erreur");
                    }
                }

            });
            vue.getjButtonAnnuler().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    try {
                        vue.getjButtonAjouter().setEnabled(false);
                        vue.getjButtonAnnuler().setEnabled(false);
                        vue.getjButtonSuivant().setEnabled(true);
                        vue.getjButtonPrecedent().setEnabled(true);
                        vue.getjButtonPremier().setEnabled(true);
                        vue.getjButtonDernier().setEnabled(true);
                        vue.getjButtonNouveau().setEnabled(true);
                        vue.getjButtonModifier().setEnabled(true);
                        vue.getjButtonSupprimer().setEnabled(true);
                        vue.getjLabelInstructions().setVisible(false);
                        getRow(vue, ArticlesList, i);
                    } catch (Exception p) {
                        JOptionPane.showMessageDialog(null, "Erreur");
                    }
                }
            });

        } catch (IndexOutOfBoundsException e) {
            i = 0;

        }
    }

    public void getRow(ArticleVue vue, ArrayList<Articles> ArticlesList, int i) {
        vue.getjTextFieldCodeArticles().setText(String.valueOf(ArticlesList.get(i).getCodesArticles()));
        vue.getjTextFieldDesignationArticles().setText(String.valueOf(ArticlesList.get(i).getDesignationArticles()));
        vue.getjTextFieldCodeCategorie().setText(String.valueOf(ArticlesList.get(i).getCodeCategories()));
        vue.getjTextFieldPrixUnitaire().setText(String.valueOf(ArticlesList.get(i).getPrixUnitaire()));
    }

    public void setTooTip() {
        vue.getjButtonPremier().setToolTipText("Retour au début");
        vue.getjButtonPrecedent().setToolTipText("Precedent");
        vue.getjButtonSuivant().setToolTipText("Suivant");
        vue.getjButtonDernier().setToolTipText("Allez au dernier item");
        vue.getjButtonNouveau().setToolTipText("Ajouter un nouvel article");
        vue.getjButtonSupprimer().setToolTipText("Supprimer un article");
        vue.getjButtonModifier().setToolTipText("Modifier un article");
    }

    public void refreshList() throws SQLException {
       getRow(vue, ArticlesList, i);
      
    }

    public void setButtonsEnabledDisabled() {
        if (nouveauActif == false) {

        }

    }
}
