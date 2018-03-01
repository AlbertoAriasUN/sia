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
public class Cursos {
    
    private String nombre;
    private String numero;
    private ArrayList<Grupo> gruposofrecidos;

    public Cursos(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.gruposofrecidos = new ArrayList<Grupo>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Grupo> getGruposofrecidos() {
        return gruposofrecidos;
    }

    public void setGruposofrecidos(ArrayList<Grupo> gruposofrecidos) {
        this.gruposofrecidos = gruposofrecidos;
    }
    
    
    
}

