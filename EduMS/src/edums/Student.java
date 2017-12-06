/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edums;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Diogo
 */
public class Student {
    private final int id;
    private static int idTotal = 0;
    private String name;
    String birthday;
    int contact;
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");;
    
    public Student(String name, String birthday, int contact){
        this.id = idTotal++;
        this.name = name;
        this.birthday = birthday;
        this.contact = contact;   
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
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
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
   
    
    // GETTERS
    public static int getIdTotal() {return idTotal;}
    public String getName() {return name;}
    public String getBirthday() {return birthday;}
    public int getContact() {return contact;}
    public static SimpleDateFormat getDateFormat(){return dateFormat;}
    // SETTERS
    public void setContact(int contact) {this.contact = contact; }
    public void setBirthday(String birthday) {this.birthday = birthday;}
    public void setName(String name) {this.name = name;}
    public static void setDateFormat(SimpleDateFormat format){dateFormat = format;}
    
    
    
   @Override
   public String toString(){
       String str;
       str = "Nome: " + name 
               + "\nBirthday: " + birthday
               + "\nContact: " + contact;
       return str;
    }
   
   
   
   
}
