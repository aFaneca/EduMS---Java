/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edums;
import java.util.*;
/**
 *
 * @author Diogo
 */
public class Student {

    private final int id;

   
    private static int idTotal = 0;

    private String name;
    Date birthday;
    int contact;
        
    
    public Student(String name, Date birthday, int contact){
        this.id = idTotal++;
        this.name = name;
        this.birthday = birthday;
        this.contact = contact;
    }
    
   
    
    // GETTERS
    public static int getIdTotal() {return idTotal;}
    public String getName() {return name;}
    public Date getBirthday() {return birthday;}
    public int getContact() {return contact;}
    // SETTERS
    public void setContact(int contact) {this.contact = contact; }
    public void setBirthday(Date birthday) {this.birthday = birthday;}
    public void setName(String name) {this.name = name;}
    
    
    
   @Override
   public String toString(){
       String str;
       str = "Nome: " + name 
               + "\nBirthday: " + birthday
               + "\nContact: " + contact;
       return str;
    }
   
   
   
   
}
