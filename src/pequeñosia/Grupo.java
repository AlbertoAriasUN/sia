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
public class Grupo {
    
    //Convertir a Clases los Strings menos el numero.
    private String numero;
    private Profesor dictadopor;
    private Cursos curso;
    private ArrayList<Estudiante> estudiantesinscritos;
    private ArrayList<Notas> notas;

    public Grupo(String numero, Profesor dictadopor, Cursos curso, ArrayList<Estudiante> Estudiantesinscritos) {
        this.numero = numero;
        this.dictadopor = dictadopor;
        this.curso = curso;
        this.estudiantesinscritos = Estudiantesinscritos;
        this.notas = new ArrayList<Notas>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Profesor getDictadopor() {
        return dictadopor;
    }

    public void setDictadopor(Profesor dictadopor) {
        this.dictadopor = dictadopor;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public ArrayList<Estudiante> getEstudiantesinscritos() {
        return estudiantesinscritos;
    }

    public void setEstudiantesinscritos(ArrayList<Estudiante> estudiantesinscritos) {
        this.estudiantesinscritos = estudiantesinscritos;
    }

    public ArrayList<Notas> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Notas> notas) {
        this.notas = notas;
    }

    

    

    

    
    
   
    
    
}

