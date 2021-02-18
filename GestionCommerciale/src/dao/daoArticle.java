/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Article;

/**
 *
 * @author HP
 */
public class daoArticle implements Idao<Article>{
    
    
    private daoMysql mysql;

    public daoArticle() {
        mysql=new daoMysql();
    }

    @Override
    public int insert(Article objet) {
         int nbreLigne=0;
        
         try {
            
        } finally{
             
             
            mysql.closeConnexion();
        }
        
           return nbreLigne;
    }
    
}
