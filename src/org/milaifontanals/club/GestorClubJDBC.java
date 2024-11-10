/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.milaifontanals.club;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author beni
 */
public class GestorClubJDBC implements IClubOracleBD{

    private Connection conn;

    public GestorClubJDBC() throws GestorBDClub{
        this("clubDB.properties");
    }
    
    public GestorClubJDBC(String nomFitxerProperties) throws GestorBDClub {
        if(nomFitxerProperties == null || nomFitxerProperties.equals(""))
            throw new GestorBDClub("Nom de fitxer no valid! ");
        
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(nomFitxerProperties));
        } catch (FileNotFoundException ex) {
           throw new GestorBDClub("No es troba el fitxer de propiertats" + nomFitxerProperties, ex);
        } catch (IOException ex) {
            throw new GestorBDClub("Error en intentar carregar el fitxer de propiertats" + nomFitxerProperties, ex);
        }
        
        String url = props.getProperty("url");
        String user = props.getProperty("user");
        String password = props.getProperty("password");
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false);
        } catch (SQLException ex) {
            throw new GestorBDClub("No ha sigut posible fer la conexio amb la BD", ex);
        }
        
    }
    
    
    @Override
    public void tancarCapa() throws GestorBDClub {
        if(conn == null)
            throw new GestorBDClub("No hi ha ninguna conexio amb la BD creada");
        
        try {
            conn.rollback();
        } catch (SQLException ex) {
            throw new GestorBDClub("Error al fer el rollback final. ", ex);
        }
        
        try {
            conn.close();
        } catch (SQLException ex) {
            throw new GestorBDClub("Error en tancar la connexió.\n", ex);
        }
    }

    @Override
    public void afegirJugador(Jugador j) throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void esborrarJugador(Jugador j) throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificarJugador(Jugador j) throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void afegirTemporada(Temporada t) throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void esborrarTemporada(Temporada t) throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void afegirCategoria(Categoria c) throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void esborrarCategoria(Categoria c) throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void afegirEquip(Equip e) throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void esborrarEquip(Equip e) throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificarEquip(Equip e) throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void afegirMembre(Membre m) throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void esborrarMembre(Jugador j) throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void afegirUsuari(Usuari u) throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void esborrarUsuari(Usuari u) throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificarUsuari(Usuari u) throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Jugador> obtenirLlistaJugador() throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Temporada> obtenirLlistaTemporada() throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Categoria> obtenirLlistaCategoria() throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Membre> obtenirLlistaMembre(Equip e) throws GestorBDClub {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
