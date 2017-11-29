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
 
    private String name;
    Date birthday;
    int contact;
        
    
    public Student(){
        
    }
    
    
    
   @Override
   public String toString(){
       String str;
       str = "Nome: " + name 
               + "\nBirthday: " + birthday
               + "\nContact: " + contact;
       return str;
    }
}
