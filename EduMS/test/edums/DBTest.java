/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edums;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diogo
 */
public class DBTest {
    DB db;
    School sc;
    public DBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        db = new DB("teste.bin");
        sc = new School("school");
        db.exportData(sc);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of importData method, of class DB.
     */
    @Test
    public void testImportData() {
        System.out.println("Testing importData...");
        School expResult = sc;
        School result = db.importData();
        assertEquals(expResult, result);
    }

    /**
     * Test of exportData method, of class DB.
     */
    @Test
    public void testExportData() {
        System.out.println("Testing exportData...");
        db.exportData(sc);
        School expResult = sc;
        School result = db.importData();
        assertEquals(expResult, result);
    }
    
}
