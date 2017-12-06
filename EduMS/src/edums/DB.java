/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edums;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diogo
 */
public class DB {
    final String nome;
    public DB(String nome){
        this.nome = nome;
        File f = new File(nome);
        try {
            f.createNewFile();
        } catch (IOException ex) {
            System.err.println("Error trying to create the file!"+ex);
        }
    }
    
    public School importData(){
        School sc = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(nome));
            sc = (School) in.readObject();
        } catch (IOException ex) {
            System.err.println("Error trying to open the file!"+ex);

        } catch (ClassNotFoundException ex) {
            System.err.println("Error trying to read the file!"+ex);
        }
        return sc;
    }
    
    public void exportData(School sc){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nome));
            out.writeObject(sc);
        } catch (FileNotFoundException ex) {
            System.err.println("Error trying to open the file!"+ex);
        } catch (IOException ex) {
            System.err.println("Error trying to read the file!"+ex);
        }
    }
}
