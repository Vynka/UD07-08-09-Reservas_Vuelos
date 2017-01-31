/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.lalafly.data;

import java.sql.Connection;

/**
 *
 * @author Fer
 */
public interface ConnectionProvider {
    
    public Connection getConnection();
     public void closeConnection(Connection conn);
}
