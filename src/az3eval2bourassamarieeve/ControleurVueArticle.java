/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az3eval2bourassamarieeve;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.IllegalFormatException;
import javax.swing.JOptionPane;

/**
 *
 * @author TQY_06
 */
public class ControleurVueArticle {

    private VueArticle vue;
    private ModelVueArticle model;
    private ResultSet ArticlesList;
    private boolean nouveauActif, modifierActif;
    private boolean success;

    public ControleurVueArticle(VueArticle vue, ModelVueArticle model) throws SQLException {
        try {
            this.vue = vue;
            this.model = model;
            nouveauActif = false;
            modifierActif = false;
            ArticlesList = getCursor();
            setTooTip();
            success = ArticlesList.first();
            success = ArticlesList.next();
            getRow(vue);

            vue.getjButtonPremier().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    getPremier();
                }
            });

            vue.getjButtonDernier().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    getDernier();
                }
            });

            vue.getjButtonSuivant().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    next();
                }
            });

            vue.getjButtonPrecedent().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    previous();
                }
            });

            vue.getjButtonNouveau().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    try {
                        vue.getjTextFieldCodeArticles().setText("");
                        vue.getjTextFieldDesignationArticles().setText("");
                        vue.getjTextFieldCodeCategorie().setText("");
                        vue.getjTextFieldPrixUnitaire().setText("");
                        setButtonsDisabled();
                        nouveauActif = true;

                    } catch (IllegalFormatException p) {
                        JOptionPane.showMessageDialog(null, "Erreur");
                    }
                }
            });

            vue.getjButtonAjouter().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String codesArticles = vue.getjTextFieldCodeArticles().getText(), designationArticles;
                    int codeCategories;
                    double prixUnitaire;

                    if (nouveauActif == true) {
                        try {
                            model.closeConnection();
                            designationArticles = vue.getjTextFieldDesignationArticles().getText();
                            try {
                                codeCategories = Integer.parseInt(vue.getjTextFieldCodeCategorie().getText());
                                prixUnitaire = Double.parseDouble(vue.getjTextFieldPrixUnitaire().getText());
                                model.addArticles(codesArticles, designationArticles, codeCategories, prixUnitaire);
                            } catch (NumberFormatException p) {
                                JOptionPane.showMessageDialog(null, "Le Code Categories doit être un entier et le Prix Unitaire un double");
                            }

                            nouveauActif = false;
                            setButtonsEnabled();
                        } catch (SQLException a) {
                            a.printStackTrace();
                        }
                    }

                    if (modifierActif == true) {
                        try {
                            model.closeConnection();
                            designationArticles = vue.getjTextFieldDesignationArticles().getText();
                            try {
                                codeCategories = Integer.parseInt(vue.getjTextFieldCodeCategorie().getText());
                                prixUnitaire = Double.parseDouble(vue.getjTextFieldPrixUnitaire().getText());
                                model.modifyArticles(vue.getjTextFieldCodeArticles().getText(), designationArticles, codeCategories, prixUnitaire);
                            } catch (NumberFormatException p) {
                                JOptionPane.showMessageDialog(null, "Le Code Categories doit être un entier et le Prix Unitaire un double");
                            }
                            vue.getjTextFieldCodeArticles().enable(true);
                            modifierActif = false;
                            setButtonsEnabled();
                        } catch (SQLException a) {
                            a.printStackTrace();
                        }
                    }
                    try {
                        getCursor();
                        getRow(vue);
                    } catch (SQLException ref) {
                        JOptionPane.showMessageDialog(null, "Je n'ai pas pus mettre la base de donner a jours");
                    }
                }

            });

            vue.getjButtonModifier().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    try {
                        setButtonsDisabled();
                        vue.getjTextFieldCodeArticles().setText(ArticlesList.getString("codesArticles"));
                        vue.getjTextFieldCodeArticles().enable(false);
                        modifierActif = true;
                    } catch (Exception p) {
                        JOptionPane.showMessageDialog(null, "Erreur");
                    }
                }
            });

            vue.getjButtonSupprimer().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    try {
                        model.closeConnection();
                        int dialogResult = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer cette article?", "ATTENTION", dialogButton);

                        if (dialogResult == 0) {
                            model.deleteArticles(vue.getjTextFieldCodeArticles().getText());
                            getCursor();
                            getRow(vue);
                        } else {
                            JOptionPane.showMessageDialog(null, "L'article n'a pas été supprimer");
                        }
                    } catch (Exception p) {
                        JOptionPane.showMessageDialog(null, "Erreur");
                    }
                    try {
                        getCursor();
                        getDernier();
                        getRow(vue);
                    } catch (SQLException ref) {
                        JOptionPane.showMessageDialog(null, "Je n'ai pas pus mettre la base de donner a jours");
                    }
                }
            });

            vue.getjButtonAnnuler().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    try {
                        model.closeConnection();
                        setButtonsEnabled();
                        vue.getjTextFieldCodeArticles().enable(true);
                        getCursor();
                        success = ArticlesList.next();
                        getRow(vue);
                    } catch (Exception p) {
                        JOptionPane.showMessageDialog(null, "Erreur");
                    }
                }
            });
        } catch (Exception a) {
            a.getMessage();
        }

    }

    public void getRow(VueArticle vue) {
        try {
            vue.getjTextFieldCodeArticles().setText(ArticlesList.getString("codesArticles"));
            vue.getjTextFieldDesignationArticles().setText(ArticlesList.getString("designationArticles"));
            vue.getjTextFieldCodeCategorie().setText(ArticlesList.getString("codeCategories"));
            vue.getjTextFieldPrixUnitaire().setText(ArticlesList.getString("prixUnitaires"));
        } catch (Exception e) {
        }
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

    public ResultSet getCursor() throws SQLException {
        return ArticlesList = model.getArticles();
    }

    public void getDernier() {
        try {
            if (ArticlesList.isLast()) {
                JOptionPane.showMessageDialog(null, "Vous êtes déjà au dernier enregistrement");
            } else {
                success = ArticlesList.last();
                getRow(vue);
            }
        } catch (Exception e) {
        }
    }

    public void next() {
        try {

            if (ArticlesList.isLast()) {
                JOptionPane.showMessageDialog(null, "Vous êtes au derniers enregistrement");
            } else {
                success = ArticlesList.next();
                getRow(vue);
            }
        } catch (Exception e) {
        }
    }

    public void getPremier() {
        try {
            if (ArticlesList.isFirst()) {
                JOptionPane.showMessageDialog(null, "Vous êtes déjà au premier enregistrement");
            } else {
                success = ArticlesList.first();
                getRow(vue);
            }
        } catch (Exception e) {
        }

    }

    public void previous() {
        try {

            if (ArticlesList.isFirst()) {
                JOptionPane.showMessageDialog(null, "Vous êtes au premier enregistrement");
            } else {
                success = ArticlesList.previous();
                getRow(vue);
            }
        } catch (Exception e) {
        }
    }

    public void setButtonsDisabled() {
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
    }

    public void setButtonsEnabled() {
        vue.getjButtonAjouter().setEnabled(false);
        vue.getjButtonAnnuler().setEnabled(false);
        vue.getjButtonSuivant().setEnabled(true);
        vue.getjButtonPrecedent().setEnabled(true);
        vue.getjButtonPremier().setEnabled(true);
        vue.getjButtonDernier().setEnabled(true);
        vue.getjButtonNouveau().setEnabled(true);
        vue.getjButtonModifier().setEnabled(true);
        vue.getjButtonSupprimer().setEnabled(true);
        vue.getjLabelInstructions().setText("");
    }
}
