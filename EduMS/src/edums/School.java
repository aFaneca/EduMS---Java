/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edums;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class School {
    
    
    private List<Student> students;
    private List<Class> classes;
    private final String name;
    
    public School(String name){
        this.name = name;
        students = new ArrayList<Student>();
        classes = new ArrayList<Class>();
    }
    public static void main(String[] args) throws ParseException {
        
        
    }
    
    
    public void addStudent(Student student){
        students.add(student);
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
    
    
    @Override
    public String toString(){
        String str;
        str = "\nESCOLA\nTurmas: " + classes.size()
                + "\nEstudantes: " + students.size();
        
        return str;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    
    
    
    
    
}
