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
        d1 = new Date (29,11,2017);
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
        System.out.println("getIdTotal");
        int expResult = 0;
        int result = Student.getIdTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("Testing GetName...");
        String expected = "Jon";
        String result = std1.getName();
        
        assertEquals("Names don't match", expected, result);
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
        System.out.println("getContact");
        Student instance = null;
        int expResult = 0;
        int result = instance.getContact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContact method, of class Student.
     */
    @Test
    public void testSetContact() {
        System.out.println("setContact");
        int contact = 0;
        Student instance = null;
        instance.setContact(contact);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        System.out.println("setName");
        String name = "";
        Student instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
