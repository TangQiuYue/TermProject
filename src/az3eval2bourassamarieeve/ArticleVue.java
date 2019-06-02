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

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
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

    public ArticleVue() {
  jLabelCodeArticles = new javax.swing.JLabel();
        jLabelDesignationArticles = new javax.swing.JLabel();
        jLabelCodeCategorie = new javax.swing.JLabel();
        jLabelPrixUnitaire = new javax.swing.JLabel();
        jTextFieldDesignationArticles = new javax.swing.JTextField();
        jTextFieldCodeArticles = new javax.swing.JTextField();
        jTextFieldPrixUnitaire = new javax.swing.JTextField();
        jTextFieldCodeCategorie = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonModifier = new javax.swing.JButton();
        jButtonNouveau = new javax.swing.JButton();
        jButtonSupprimer = new javax.swing.JButton();
        jButtonAjouter = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

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


        jButton1.setText("<<");


        jButton2.setText("<");

        jButton3.setText(">");

        jButton4.setText(">>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDesignationArticles)
                    .addComponent(jLabelCodeArticles)
                    .addComponent(jLabelCodeCategorie)
                    .addComponent(jLabelPrixUnitaire)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPrixUnitaire, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodeArticles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDesignationArticles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodeCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)))
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
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3)
                                    .addComponent(jButton4))))
                        .addGap(25, 25, 25))))
        );

        pack();
    }
}
