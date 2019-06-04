/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az3eval2bourassamarieeve;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author TQY_06
 */
public class ControleurArticles {

    private ArticleVue vue;
    private ModelVueArticles model;

    public ControleurArticles(ArticleVue vue, ModelVueArticles model) {
        this.vue = vue;
        this.model = model;

        vue.getjButtonDebut().setToolTipText("Retour au début");
        vue.getjButtonPrecedent().setToolTipText("Precedent");
        vue.getjButtonSuivant().setToolTipText("Suivant");
        vue.getjButtonDernier().setToolTipText("Allez au dernier item");
        vue.getjButtonNouveau().setToolTipText("Ajouter un nouvel article");
        vue.getjButtonSupprimer().setToolTipText("Supprimer un article");
        vue.getjButtonModifier().setToolTipText("Modifier un article");

        vue.getjTextFieldCodeArticles().setText(String.valueOf(model.getArticles().getCodesArticles()));
        vue.getjTextFieldDesignationArticles().setText(String.valueOf(model.getArticles().getDesignationArticles()));
        vue.getjTextFieldCodeCategorie().setText(String.valueOf(model.getArticles().getCodeCategories()));
        vue.getjTextFieldPrixUnitaire().setText(String.valueOf(model.getArticles().getPrixUnitaire()));

        vue.getjButtonDebut().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {

                    vue.getjTextFieldCodeArticles().setText(String.valueOf(model.getArticles().getCodesArticles()));
                    vue.getjTextFieldDesignationArticles().setText(String.valueOf(model.getArticles().getDesignationArticles()));
                    vue.getjTextFieldCodeCategorie().setText(String.valueOf(model.getArticles().getCodeCategories()));
                    vue.getjTextFieldPrixUnitaire().setText(String.valueOf(model.getArticles().getPrixUnitaire()));
                } catch (Exception p) {
                    JOptionPane.showMessageDialog(null, "Je n'ai pas pus obtenir la base de donner");
                }
            }

        });
    }
}
