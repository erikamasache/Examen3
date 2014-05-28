/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.List;
import modelo.Equipo;

/**
 *
 * @author elivar
 */
public interface DaoGeneric {

    public void guardar(Equipo equipo);

    public void editar(Equipo equipo);

    public void eliminar(Equipo equipo);

    public List<Equipo> listaEquipo(boolean asc);
    
}
