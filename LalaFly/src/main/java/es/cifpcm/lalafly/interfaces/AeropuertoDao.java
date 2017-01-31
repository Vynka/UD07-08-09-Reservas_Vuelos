/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.lalafly.interfaces;

import es.cifpcm.lalafly.data.entities.Aeropuerto;
import java.util.List;

/**
 *
 * @author 2dawb
 */
public interface AeropuertoDao {
    public List<Aeropuerto> selectAll();
}
