/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edums;
import java.util.*;


public class School {
    
    
    private List<Student> students;
    private List<Class> classes;
    
    
    public School(){
        students = new ArrayList<Student>();
        classes = new ArrayList<Class>();
    }
    public static void main(String[] args) {
        
    }
    
    
    public void addStudent(Student student){
        students.add(student);
    }
    
    public void addClass(Class class){
        classes.add(class);
    }
    
    public void removeStudent(Student student){
        if(students.contains(student))
            students.remove(students.indexOf(student));
        else
            System.err.println("Student wasn't found.");
    }
    
    public void removeClass(Class class){
        if(classes.contains(class))
            classes.remove(classes.indexOf(class));
        else
            System.err.println("Class wasn't found.");
    }
    
    public void editStudent(Student student){
        if(students.contains(student))
            students.set(students.indexOf(student), student);
        else
            System.err.println("Student wasn't found.");
    }
    
    public void editClass(Class class){
        if(classes.contains(class))
            classes.set(classes.indexOf(class), class);
        else
            System.err.println("Class wasn't found.");
    }
    
}
