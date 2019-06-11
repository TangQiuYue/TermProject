/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az3eval2bourassamarieeve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author TQY_06
 */
public class ModelVueArticle {

    private static String url = "jdbc:derby://localhost:1527/Az3Eval2Bourassa";
    private static String user = "username";
    private static String passwd = "password";

    private Connection connect = null;
    private String sqlString;
    private Statement stmt;
    private ResultSet resSet;
    private PreparedStatement pstmt;

    String codesArticles = "", designationArticles = "";
    int codeCategories = 0;
    double prixUnitaire = 0.0;

    public Connection getConnexion() {
        Connection connect = null;
        try {
            connect = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion successful");
        } catch (SQLException a) {
            a.printStackTrace();
        }
        return connect;
    }

    public ResultSet getArticles() throws SQLException {
        try {
            connect = DriverManager.getConnection(url, user, passwd);
            stmt = connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            sqlString = "Select * from ARTICLES";
            resSet = stmt.executeQuery(sqlString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return resSet;
    }

    public void modifyArticles(String codesArticles, String designationArticles, int codeCategories, double prixUnitaire) {

        try {
            connect = DriverManager.getConnection(url, user, passwd);
            sqlString = "update ARTICLES set codesArticles=?, designationArticles=?,codeCategories=?, prixUnitaires=? WHERE codesArticles=?";
            pstmt = connect.prepareStatement(sqlString);
            pstmt.setString(1, codesArticles);
            pstmt.setString(2, designationArticles);
            pstmt.setInt(3, codeCategories);
            pstmt.setDouble(4, prixUnitaire);
            pstmt.setString(5, codesArticles);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "L'article a été modifier!!");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "L'article n'a pas pus etre modifier!!");
        } finally {
            try {
                pstmt.close();
                connect.close();
            } catch (Exception ex) {
                Logger.getLogger(ModelVueArticle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void deleteArticles(String codeArticles) {
        try {
            connect = DriverManager.getConnection(url, user, passwd);
            sqlString = "delete from ARTICLES where codesArticles=?";
            pstmt = connect.prepareStatement(sqlString);
            pstmt.setString(1, codeArticles);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "L'article a été supprimer");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "L'article n'a pas été supprimer");
        } finally {
            try {
              pstmt.close();
                connect.close();
            } catch (Exception ex) {
                Logger.getLogger(ModelVueArticle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void addArticles(String codesArticles, String designationArticles, int codeCategories, double prixUnitaire) {
        try {
            connect = DriverManager.getConnection(url, user, passwd);
            stmt = connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            sqlString = "Select * from Articles ";
            resSet = stmt.executeQuery(sqlString);
            resSet.moveToInsertRow();
            resSet.updateString(1, codesArticles);
            resSet.updateString(2, designationArticles);
            resSet.updateInt(3, codeCategories);
            resSet.updateDouble(4, prixUnitaire);
            resSet.insertRow();
            JOptionPane.showMessageDialog(null, "L'article a bien été ajouter!");

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "L'article n'a pas pus etre ajouter!");
        } finally {
            try {
                resSet.close();
                stmt.close();
                connect.close();
            } catch (Exception ex) {
                Logger.getLogger(ModelVueArticle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void closeConnection() throws SQLException {
        resSet.close();
        stmt.close();
        connect.close();
    }
}
