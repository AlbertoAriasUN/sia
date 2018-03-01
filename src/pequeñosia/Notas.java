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
public class Notas {
    
    private Estudiante estudiante;
    private Grupo grupo;
    private double nota;

    public Notas(Estudiante estudiante, Grupo grupo, double nota) {
        this.estudiante = estudiante;
        this.grupo = grupo;
        this.nota = nota;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
    
}
