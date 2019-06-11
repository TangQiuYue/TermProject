/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az3eval2bourassamarieeve;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author TQY_06
 */
public class Az3Eval2BourassaMarieEve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            VueArticle vue = new VueArticle();
            ModelVueArticle model = new ModelVueArticle();
            model.getConnexion();

            ControleurVueArticle control = new ControleurVueArticle(vue, model);

            vue.setVisible(true);
            
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Il-y a un problem avec la base de donnee");
        }
        

    }
}
