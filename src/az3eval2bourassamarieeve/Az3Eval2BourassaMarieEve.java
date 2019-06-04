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
public class Az3Eval2BourassaMarieEve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArticleVue vue = new ArticleVue();
        ModelVueArticles model = new ModelVueArticles();
        ControleurArticles control = new ControleurArticles(vue, model);
        
       vue.setVisible(true);
  
      
       
    }
    
}
