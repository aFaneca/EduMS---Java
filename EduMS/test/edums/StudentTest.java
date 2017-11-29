/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edums;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author me
 */
public class StudentTest {
    Student std1;
    Date d1;
    public StudentTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        d1 = new Date (2017,11,29);
        std1 = new Student("Jon",d1, 0);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdTotal method, of class Student.
     */
    @Test
    public void testGetIdTotal() {
        System.out.println("Testing IdTotal...");
        int expected = std1.getIdTotal();
        int result = std1.getIdTotal();
        assertEquals(expected, result);
        
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("Testing GetName...");
        String expected = "Jon";
        String result = std1.getName();
        
        assertEquals(expected, result);
    }

    /**
     * Test of getBirthday method, of class Student.
     */
    @Test
    public void testGetBirthday() {
        System.out.println("getBirthday");
        Student instance = null;
        Date expResult = null;
        Date result = instance.getBirthday();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContact method, of class Student.
     */
    @Test
    public void testGetContact() {
        System.out.println("Testing getContact...");
        Student instance = null;
        int expected = 0;
        int result = std1.getContact();
        assertEquals(expected, result);
    }

    /**
     * Test of setContact method, of class Student.
     */
    @Test
    public void testSetContact() {
        System.out.println("Testing setContact...");
        std1.setContact(911909109);
        int expected = 911909109;
        int result = std1.getContact();
        assertEquals(expected, result);
    }

    /**
     * Test of setBirthday method, of class Student.
     */
    @Test
    public void testSetBirthday() {
        System.out.println("setBirthday");
        Date birthday = null;
        Student instance = null;
        instance.setBirthday(birthday);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("Testing setName...");
        std1.setName("Jesus");
        String expected = "Jesus";
        String result = std1.getName();
        assertEquals(expected, result);
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("Testing toString...");
        String str;
        str = "Nome: " + std1.getName() 
               + "\nBirthday: " + std1.getBirthday()
               + "\nContact: " + std1.getContact();
        String expected = str;
        String result = std1.toString();
        assertEquals(expected, result);
    }
    
}
