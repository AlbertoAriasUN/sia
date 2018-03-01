/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pequeñosia;

/**
 *
 * @author danie
 */
import java.util.ArrayList;
public class Profesor {
    
    private String id;
    private String nombre;
    private ArrayList<Grupo> gruposescogidos;

    public Profesor(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.gruposescogidos = new ArrayList<Grupo>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Grupo> getGruposescogidos() {
        return gruposescogidos;
    }

    public void setGruposescogidos(ArrayList<Grupo> gruposescogidos) {
        this.gruposescogidos = gruposescogidos;
    }
    
    
    
}

