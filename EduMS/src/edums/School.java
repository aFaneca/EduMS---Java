/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edums;
import java.io.Serializable;
import java.text.ParseException;
import java.util.*;


public class School implements Serializable{
    
    
    private List<Student> students;
    private List<Class> classes;
    private List<String> cUnits;
    private final String name;
    private static String fileName;
    public static DB db1;
    
    public School(String name){
        db1 = new DB("teste.bin");
        fileName = "teste.bin";
        this.name = name;
        students = new ArrayList<Student>();
        classes = new ArrayList<Class>();
        cUnits = new ArrayList<String>();
        cUnits.add("Tecnologia e Arquitectura de Computadores");
        cUnits.add("Sistemas Operativos");
        cUnits.add("Sistemas Operativos II");
        cUnits.add("Modelação e Design");
        cUnits.add("Tecnologias Web");
        cUnits.add("Programação Web");
        cUnits.add("Conhecimento e Radiocínio");
        cUnits.add("Programação Avançada");
        cUnits.add("Programação Orientada a Objetos");
        cUnits.add("Introdução às Redes de Comunicação");
        cUnits.add("Programação Distribuída");
        cUnits.add("Arquiteturas Móveis");
        cUnits.add("Introdução à Inteligência Artificial");
  
    }
    public static void main(String[] args) throws ParseException {
        db1 = new DB("teste.bin");
        School s  = new School("ESCOLA TESTE");
        s.addClass(new Class("A", "B", "C", 1, 2));
        s.addClass(new Class("D", "E", "F", 3, 4));
        Date d1 = Student.getDateFormat().parse("29/01/1997");
        s.addStudent(new Student ("A",Student.getDateFormat().format(d1), 1));
        s.addStudent(new Student ("B",Student.getDateFormat().format(d1), 911909187));
        db1.exportData(s);
        
    }
    
    
    public void addStudent(Student student){
        System.out.println(""+this.name);
        students.add(student);
        //db1.exportData(this);
    }
    
    public void addClass(Class c){
        classes.add(c);
    }
    
    public void removeStudent(Student student){
        if(students.contains(student))
            students.remove(students.indexOf(student));
        else
            System.err.println("Student wasn't found.");
    }
    
    public void removeClass(Class c){
        if(classes.contains(c))
            classes.remove(classes.indexOf(c));
        else
            System.err.println("Class wasn't found.");
    }
    
    public void editStudent(Student student){
        if(students.contains(student))
            students.set(students.indexOf(student), student);
        else
            System.err.println("Student wasn't found.");
    }
    
    public void editClass(Class c){
        if(classes.contains(c))
            classes.set(classes.indexOf(c), c);
        else
            System.err.println("Class wasn't found.");
    }

    public String getName() {
        return name;
    }
    
    
    
    @Override
    public String toString(){
        String str;
        str = "\nESCOLA\nTurmas: " + classes.size()
                + "\nEstudantes: " + students.size();
        
        return str;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final School other = (School) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    // SETTERS
    public void setClasses(List<Class> classes) {this.classes = classes;}
    public void setStudents(List<Student> students) {this.students = students;}
    // GETTERS
    public List<String> getcUnits() {return cUnits;}
    public List<Class> getClasses() {return classes;}
    public List<Student> getStudents() {return students;}
}
