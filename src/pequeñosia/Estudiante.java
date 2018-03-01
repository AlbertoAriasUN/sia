/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pequeñosia;

/**
 *
 * @author Julian Jimenez
 */
import java.util.ArrayList;

public class Estudiante {
    
private String id;
private String nombre;
private ArrayList<Grupo> grupocursado;

public Estudiante(String id, String nombre) {
    this.id = id;
    this.nombre = nombre;
    this.grupocursado = new ArrayList<Grupo>();
    }



    public String getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    

    public ArrayList<Grupo> getGrupocursado() {
        return grupocursado;
    }

    public void setGrupocursado(ArrayList<Grupo> grupocursado) {
        this.grupocursado = grupocursado;
    }



    
}

