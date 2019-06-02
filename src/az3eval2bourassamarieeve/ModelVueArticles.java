/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az3eval2bourassamarieeve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TQY_06
 */
public class ModelVueArticles {
    
    
    public Connection connectToBD(){
        Connection connect = null;
       try{ connect = DriverManager.getConnection("jdbc:derby://localhost:1527/Az3Eval2Bourassa", "username", "password");
        System.out.println("Connexion Obtenue");
       } catch(SQLException e) {
           e.printStackTrace();
       }
        return connect;
    }
}
