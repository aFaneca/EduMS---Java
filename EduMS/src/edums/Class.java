/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edums;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diogo
 */
public class Class {
    String unitDenomination, typeClass, curricularUnit;
    int hoursPerClass, classesPerWeek, maxStudents;
    List<Student> students;

    public Class(String unitDenomination, String typeClass, String curricularUnit, int hoursPerClass, int classesPerWeek) {
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
    
    
    public void setUnitDenomination(String unitDenomination) {
        this.unitDenomination = unitDenomination;
    }
    public void setTypeClass(String typeClass) {
        this.typeClass = typeClass;
    }
    public void setCurricularUnit(String curricularUnit) {
        this.curricularUnit = curricularUnit;
    }
    public void setHoursPerClass(int hoursPerClass) {
        this.hoursPerClass = hoursPerClass;
    }
    public void setClassesPerWeek(int classesPerWeek) {
        this.classesPerWeek = classesPerWeek;
    }
    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }
    
    
    
    public void associateStudent(Student st){
        if(students.size() >= maxStudents){
            System.err.println("Max number of students reached!\nCan't add more students.");
            return;
        }
        students.add(st);
    }
    
    public void desassociateStudent(Student st){
        if(!students.isEmpty()){
            System.err.println("Class already empty!\nCan't remove more students.");
            return;
        }
        students.remove(st);
    }

    
    
    
    
    
}
