/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az3eval2bourassamarieeve;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author TQY_06
 */
public class ArticleVue extends JFrame {

    private JButton jButtonPremier;
    private JButton jButtonPrecedent;
    private JButton jButtonSuivant;
    private JButton jButtonDernier;
    private JButton jButtonAjouter;
    private JButton jButtonAnnuler;
    private JButton jButtonModifier;
    private JButton jButtonNouveau;
    private JButton jButtonSupprimer;
    private JLabel jLabelCodeArticles;
    private JLabel jLabelCodeCategorie;
    private JLabel jLabelDesignationArticles;
    private JLabel jLabelPrixUnitaire;
    private JSeparator jSeparator1;
    private JTextField jTextFieldCodeArticles;
    private JTextField jTextFieldCodeCategorie;
    private JTextField jTextFieldDesignationArticles;
    private JTextField jTextFieldPrixUnitaire;
    private JLabel jLabelInstructions;

    public ArticleVue() {

        setLocation(500, 250);

        jLabelCodeArticles = new JLabel();
        jLabelDesignationArticles = new JLabel();
        jLabelCodeCategorie = new JLabel();
        jLabelPrixUnitaire = new JLabel();
        jTextFieldDesignationArticles = new JTextField();
        jTextFieldCodeArticles = new JTextField();
        jTextFieldPrixUnitaire = new JTextField();
        jTextFieldCodeCategorie = new JTextField();
        jSeparator1 = new JSeparator();
        jButtonModifier = new JButton();
        jButtonNouveau = new JButton();
        jButtonSupprimer = new JButton();
        jButtonAjouter = new JButton();
        jButtonAnnuler = new JButton();
        jButtonPremier = new JButton();
        jButtonPrecedent = new JButton();
        jButtonSuivant = new JButton();
        jButtonDernier = new JButton();
        jLabelInstructions = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Table Articles");

        jLabelCodeArticles.setText("Code Articles");

        jLabelDesignationArticles.setText("Designation Articles");

        jLabelCodeCategorie.setText("Code Categorie");

        jLabelPrixUnitaire.setText("Prix Unitaire");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButtonModifier.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButtonModifier.setText("Modifier");
        jButtonModifier.setMaximumSize(new java.awt.Dimension(100, 23));
        jButtonModifier.setMinimumSize(new java.awt.Dimension(100, 23));
        jButtonModifier.setPreferredSize(new java.awt.Dimension(100, 23));

        jButtonNouveau.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButtonNouveau.setText("Nouveau");
        jButtonNouveau.setMaximumSize(new java.awt.Dimension(100, 23));
        jButtonNouveau.setMinimumSize(new java.awt.Dimension(100, 23));
        jButtonNouveau.setPreferredSize(new java.awt.Dimension(100, 23));

        jButtonSupprimer.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButtonSupprimer.setText("Supprimer");
        jButtonSupprimer.setMaximumSize(new java.awt.Dimension(100, 23));
        jButtonSupprimer.setMinimumSize(new java.awt.Dimension(100, 23));
        jButtonSupprimer.setPreferredSize(new java.awt.Dimension(100, 23));

        jButtonAjouter.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButtonAjouter.setText("Ajouter");
        jButtonAjouter.setEnabled(false);
        jButtonAjouter.setMaximumSize(new java.awt.Dimension(100, 23));
        jButtonAjouter.setMinimumSize(new java.awt.Dimension(100, 23));
        jButtonAjouter.setPreferredSize(new java.awt.Dimension(100, 23));

        jButtonAnnuler.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.setEnabled(false);
        jButtonAnnuler.setMaximumSize(new java.awt.Dimension(100, 23));
        jButtonAnnuler.setMinimumSize(new java.awt.Dimension(100, 23));
        jButtonAnnuler.setPreferredSize(new java.awt.Dimension(100, 23));

        jButtonPremier.setText("<<");

        jButtonPrecedent.setText("<");

        jButtonSuivant.setText(">");

        jButtonDernier.setText(">>");
        
        jLabelInstructions.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabelInstructions.setForeground(new java.awt.Color(255, 0, 0));
        jLabelInstructions.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDesignationArticles)
                            .addComponent(jLabelCodeArticles)
                            .addComponent(jLabelCodeCategorie)
                            .addComponent(jLabelPrixUnitaire)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonPremier)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPrecedent)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPrixUnitaire, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCodeArticles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDesignationArticles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCodeCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSuivant)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDernier))))
                    .addComponent(jLabelInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonModifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNouveau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNouveau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jButtonModifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jButtonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButtonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCodeArticles)
                                    .addComponent(jTextFieldCodeArticles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelDesignationArticles)
                                    .addComponent(jTextFieldDesignationArticles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCodeCategorie)
                                    .addComponent(jTextFieldCodeCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelPrixUnitaire)
                                    .addComponent(jTextFieldPrixUnitaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelInstructions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonPremier)
                                    .addComponent(jButtonPrecedent)
                                    .addComponent(jButtonSuivant)
                                    .addComponent(jButtonDernier))))
                        .addGap(25, 25, 25))))
        );

        pack();
    }
    

    public JButton getjButtonPremier() {
        return jButtonPremier;
    }

    public void setjButtonPremier(JButton jButtonPremier) {
        this.jButtonPremier = jButtonPremier;
    }

    public JButton getjButtonPrecedent() {
        return jButtonPrecedent;
    }

    public void setjButtonPrecedent(JButton jButtonPrecedent) {
        this.jButtonPrecedent = jButtonPrecedent;
    }

    public JButton getjButtonSuivant() {
        return jButtonSuivant;
    }

    public void setjButtonSuivant(JButton jButtonSuivant) {
        this.jButtonSuivant = jButtonSuivant;
    }

    public JButton getjButtonDernier() {
        return jButtonDernier;
    }

    public void setjButtonDernier(JButton jButtonDernier) {
        this.jButtonDernier = jButtonDernier;
    }

    public JButton getjButtonAjouter() {
        return jButtonAjouter;
    }

    public void setjButtonAjouter(JButton jButtonAjouter) {
        this.jButtonAjouter = jButtonAjouter;
    }

    public JButton getjButtonAnnuler() {
        return jButtonAnnuler;
    }

    public void setjButtonAnnuler(JButton jButtonAnnuler) {
        this.jButtonAnnuler = jButtonAnnuler;
    }

    public JButton getjButtonModifier() {
        return jButtonModifier;
    }

    public void setjButtonModifier(JButton jButtonModifier) {
        this.jButtonModifier = jButtonModifier;
    }

    public JButton getjButtonNouveau() {
        return jButtonNouveau;
    }

    public void setjButtonNouveau(JButton jButtonNouveau) {
        this.jButtonNouveau = jButtonNouveau;
    }

    public JButton getjButtonSupprimer() {
        return jButtonSupprimer;
    }

    public void setjButtonSupprimer(JButton jButtonSupprimer) {
        this.jButtonSupprimer = jButtonSupprimer;
    }

    public JTextField getjTextFieldCodeArticles() {
        return jTextFieldCodeArticles;
    }

    public void setjTextFieldCodeArticles(JTextField jTextFieldCodeArticles) {
        this.jTextFieldCodeArticles = jTextFieldCodeArticles;
    }

    public JTextField getjTextFieldCodeCategorie() {
        return jTextFieldCodeCategorie;
    }

    public void setjTextFieldCodeCategorie(JTextField jTextFieldCodeCategorie) {
        this.jTextFieldCodeCategorie = jTextFieldCodeCategorie;
    }

    public JTextField getjTextFieldDesignationArticles() {
        return jTextFieldDesignationArticles;
    }

    public void setjTextFieldDesignationArticles(JTextField jTextFieldDesignationArticles) {
        this.jTextFieldDesignationArticles = jTextFieldDesignationArticles;
    }

    public JTextField getjTextFieldPrixUnitaire() {
        return jTextFieldPrixUnitaire;
    }

    public void setjTextFieldPrixUnitaire(JTextField jTextFieldPrixUnitaire) {
        this.jTextFieldPrixUnitaire = jTextFieldPrixUnitaire;
    }

    public JLabel getjLabelInstructions() {
        return jLabelInstructions;
    }

    public void setjLabelInstructions(JLabel jLabelInstructions) {
        this.jLabelInstructions = jLabelInstructions;
    }
    

}
