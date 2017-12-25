/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edums;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diogo
 */
public class Class implements Serializable{
    String unitDenomination, typeClass, curricularUnit;
    int hoursPerClass, classesPerWeek, maxStudents;
    List<Student> students;
    static int total = 0;
    final int id;

    public Class(String unitDenomination, String typeClass, String curricularUnit, int hoursPerClass, int classesPerWeek) {
        this.id = total++;
        this.unitDenomination = unitDenomination;
        this.typeClass = typeClass;
        this.curricularUnit = curricularUnit;
        this.hoursPerClass = hoursPerClass;
        this.classesPerWeek = classesPerWeek;
        students = new ArrayList<>();
    }

    public String getUnitDenomination() {
        return unitDenomination;
    }
    public String getTypeClass() {
        return typeClass;
    }
    public String getCurricularUnit() {
        return curricularUnit;
    }
    public int getHoursPerClass() {
        return hoursPerClass;
    }
    public int getClassesPerWeek() {
        return classesPerWeek;
    }
    public int getMaxStudents() {
        return maxStudents;
    }
    public Student getStudent(int id){return students.get(id);}
    
    public int getNumStudents(){return students.size();}

    public int getId() {return id;}
    
    
    public void setUnitDenomination(String unitDenomination) {
        if(unitDenomination.length() == 0){
            System.err.println("Empty String!");
            return;
        }
        this.unitDenomination = unitDenomination;
    }
    public void setTypeClass(String typeClass) {
        if(typeClass.length() == 0 || typeClass.equals("T") && !typeClass.equals("TP") && !typeClass.equals("P")){
            System.err.println("String different than the expected!(T,TP or P)");
            return;
        }
        this.typeClass = typeClass;
    }
    public void setCurricularUnit(String curricularUnit) {
        if(curricularUnit.length() == 0){
            System.err.println("Empty String!");
            return;
        }
        this.curricularUnit = curricularUnit;
    }
    public void setHoursPerClass(int hoursPerClass) {
        if(hoursPerClass == 0){ 
            System.err.println("Must be different than 0 and positive!");
            return;
        }
        this.hoursPerClass = hoursPerClass;
    }
    public void setClassesPerWeek(int classesPerWeek) {
        if(classesPerWeek == 0){
            System.err.println("Must be different than 0 and positive!");
            return;
        }
        this.classesPerWeek = classesPerWeek;
    }
    public void setMaxStudents(int maxStudents) {
        if(maxStudents == 0){
            System.err.println("Must be different than 0 and positive!");
            return;
        }
        this.maxStudents = maxStudents;
    }

    public static void setTotal(int total) {
        Class.total = total;
    }
    
    
    public void associateStudent(Student st){
        if(students.size() >= maxStudents){
            System.err.println("Max number of students reached!\nCan't add more students.");
            return;
        }
        students.add(st);
    }
    
    public void desassociateStudent(Student st){
        if(students.isEmpty()){
            System.err.println("Class already empty!\nCan't remove more students.");
            return;
        }
        students.remove(st);
    }

    @Override
    public String toString() {
        return "Unit Denomination: "+getUnitDenomination()+"\nType of Class: "+getTypeClass()+"\nCurricular Unit: "+getCurricularUnit()+"\nHours per Class: "+getHoursPerClass()+"\nClasses per Week: "+getClassesPerWeek()+"\nStudents:\n"+students.toString();
    }

    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.id;
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
        final Class other = (Class) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }    
}
