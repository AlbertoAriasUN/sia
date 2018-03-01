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
import java.util.Scanner;

public class PequeñoSia {
    

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        PequeñoSia pequeño = new PequeñoSia();
        pequeño.addGrupo();
        pequeño.imprimirNotas(pequeño.addNotas());
        
        
        
    }
    
    public ArrayList<Estudiante> addEstudiante(){
        
    
    ArrayList<Estudiante> grupoestudiantes = new ArrayList<>();
    
    Estudiante nuevo = new Estudiante("1010045678","Sandro");
    grupoestudiantes.add(nuevo);
    Estudiante nuevo2 = new Estudiante("1034562896","Thomas");
    grupoestudiantes.add(nuevo2);
    Estudiante nuevo3 = new Estudiante("1018569388","Rafael");
    grupoestudiantes.add(nuevo3);
    
    return grupoestudiantes;
    
    
    }
    public ArrayList<Profesor> addProfesor(){
        
        
    ArrayList<Profesor> grupoprofesores = new ArrayList<>();
    Profesor nuevo = new Profesor("5395820","Roberto");
    grupoprofesores.add(nuevo);
    
    return grupoprofesores;
    
    
    }
    
    public ArrayList<Cursos> addCurso(){
    
    ArrayList<Cursos> grupocursos = new ArrayList<>();
    Cursos nuevo = new Cursos("Programacion Orientada a Objetos","2016375-8");
    
    grupocursos.add(nuevo);
    
    return grupocursos;
    
    }
    
    public ArrayList<Grupo> addGrupo(){
    
    ArrayList<Grupo> grupo = new ArrayList<>();
    
    Grupo g1 = new Grupo("8",this.addProfesor().get(0),this.addCurso().get(0),this.addEstudiante()); 
    grupo.add(g1);
    this.addEstudiante().get(0).setGrupocursado(grupo);
    this.addEstudiante().get(1).setGrupocursado(grupo);
    this.addEstudiante().get(2).setGrupocursado(grupo);
    this.addProfesor().get(0).setGruposescogidos(grupo);
    this.addCurso().get(0).setGruposofrecidos(grupo);
    return grupo;
    
    }
    
    public ArrayList<Notas> addNotas(){
    
    ArrayList<Notas> gruponotas = new ArrayList<>();
    
    double n1,n2,n3;
    
    System.out.println("Digite las notas de los estudiantes: ");
    
    System.out.println("Nota 1: ");
    
    Scanner s1 = new Scanner(System.in);
    
    n1 = s1.nextDouble();
    
    System.out.println("Nota 2: ");
    
    Scanner s2 = new Scanner(System.in);
    
    n2 = s2.nextDouble();
    
    System.out.println("Nota 3: ");
    
    Scanner s3 = new Scanner(System.in);
    
    n3 = s3.nextDouble();
    
    Notas nota1 = new Notas(this.addEstudiante().get(0), this.addGrupo().get(0), n1);
    Notas nota2 = new Notas(this.addEstudiante().get(1), this.addGrupo().get(0), n2);
    Notas nota3 = new Notas(this.addEstudiante().get(2), this.addGrupo().get(0), n3);
    
    gruponotas.add(nota1);
    gruponotas.add(nota2);
    gruponotas.add(nota3);
    
    this.addGrupo().get(0).setNotas(gruponotas);
    
    return gruponotas;
    }
    
    public void imprimirNotas(ArrayList<Notas> gruponotas){
        
    System.out.println("El grupo " + gruponotas.get(0).getGrupo().getNumero() + " contiene la siguiente estructura:");

    System.out.print("El Profesor: " + gruponotas.get(0).getGrupo().getDictadopor().getNombre() + " ");    
    System.out.print("identificado con Id " + gruponotas.get(0).getGrupo().getDictadopor().getId() + " ");
    System.out.print("dicta " + gruponotas.get(0).getGrupo().getCurso().getNombre() + " ");
    System.out.println("identificado por " + gruponotas.get(0).getGrupo().getCurso().getNumero() + " ");
    
    System.out.println("Los estudiantes(su id y nombre) y las notas de los estudiantes son : ");
    
    System.out.println("1. Id " + gruponotas.get(0).getEstudiante().getId() + " , Nombre: " + gruponotas.get(0).getEstudiante().getNombre() + " -----> " + gruponotas.get(0).getNota());
    System.out.println("2. Id " + gruponotas.get(1).getEstudiante().getId() + " , Nombre: " + gruponotas.get(1).getEstudiante().getNombre() + " -----> " + gruponotas.get(1).getNota());
    System.out.println("3. Id " + gruponotas.get(2).getEstudiante().getId() + " , Nombre: " + gruponotas.get(2).getEstudiante().getNombre() + " -----> " + gruponotas.get(2).getNota());
    
        
    }
    
}
