/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.lalafly.data.mysqlDao;

import es.cifpcm.lalafly.data.ConnectionProvider;
import es.cifpcm.lalafly.data.entities.Aeropuerto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wyrna
 */
public class MySqlAeropuertoDao {
  private ConnectionProvider connProvider;
    private int pageSize;

    public MySqlAeropuertoDao(ConnectionProvider conn) {
        this.connProvider = conn;
    }
    public List<Aeropuerto> selectAll() {
        ArrayList<Aeropuerto> listaAeropuerto = new ArrayList<>();
        String query = "SELECT nombre FROM aeropuerto";
        try (Connection conn = connProvider.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Aeropuerto aeropuerto = new Aeropuerto(rs.getInt(1));
                listaAeropuerto.add(aeropuerto);
            }
            return listaAeropuerto;
        } catch (SQLException ex) {
            Logger.getLogger(MySqlAeropuertoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
