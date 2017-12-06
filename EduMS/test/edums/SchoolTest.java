/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edums;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class SchoolTest {
    School s;
    Date d1;
    Student st1, st2;
    Class c1, c2;
    List<Student> l1;
    List <Class> l2;
    
    public SchoolTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws ParseException {
        s = new School("A");
        d1 = Student.getDateFormat().parse("29/01/1997");
        st1 = new Student ("A",Student.getDateFormat().format(d1), 1);
        c1 = new Class("A", "B", "C", 1, 2);
        l1 = new ArrayList<>();
        l2 = new ArrayList<>();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class School.
     */
  /*
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        School.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of addStudent method, of class School.
     */
    @Test
    public void testAddStudent() {
        System.out.println("Testing addStudent...");
        s.addStudent(st1);
        int expected = 1;
        int result = s.getStudents().size();
        
        assertEquals(expected, result);
    }

    /**
     * Test of addClass method, of class School.
     */
    @Test
    public void testAddClass() {
        System.out.println("Testing addClass...");
        s.addClass(c1);
        int expected = 1;
        int result = s.getClasses().size();
        
        assertEquals(expected, result);
    }

    /**
     * Test of removeStudent method, of class School.
     */
    @Test
    public void testRemoveStudent() {
        System.out.println("Testing removeStudent...");
        s.removeStudent(st1);
        int expected = 0;
        int result = s.getStudents().size();
        assertEquals(expected, result);
    }

    /**
     * Test of removeClass method, of class School.
     */
    @Test
    public void testRemoveClass() {
        System.out.println("Testing removeClass...");
        s.removeClass(c1);
        int expected = 0;
        int result = s.getClasses().size();
        assertEquals(expected, result);
    }

    /**
     * Test of editStudent method, of class School.
     */
    @Test
    public void testEditStudent() {
        System.out.println("Testing editStudent...");
        st2 = st1;
        st2.setContact(8);
        s.editStudent(st2);
        int expected = 8;
        int result = st1.getContact();
        assertEquals(expected, result);
    }

    /**
     * Test of editClass method, of class School.
     */
    @Test
    public void testEditClass() {
        System.out.println("Testing editClass...");
        c2 = c1;
        c2.setUnitDenomination("TP1");
        s.editClass(c2);
        String expected = "TP1";
        String result = c1.getUnitDenomination();
        assertEquals(expected, result);
    }

    /**
     * Test of toString method, of class School.
     */
  /*  @Test
    public void testToString() {
        System.out.println("toString");
        School instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of getStudents method, of class School.
     */
    @Test
    public void testGetStudents() {
        System.out.println("Testing getStudents...");
        s.addStudent(st1);
        Object expected = st1;
        Object result = s.getStudents().get(0);

        assertEquals(expected, result);
    }

    /**
     * Test of setStudents method, of class School.
     */
    @Test
    public void testSetStudents() {
        System.out.println("Testing setStudents...");
        s.addStudent(st1);
        s.setStudents(l1);        
        int expected = 0;
        int result = s.getStudents().size();

        assertEquals(expected, result);
    }

    /**
     * Test of getClasses method, of class School.
     */
    @Test
    public void testGetClasses() {
        System.out.println("Testing getClasses...");
        s.addClass(c1);
        Object expected = c1;
        Object result = s.getClasses().get(0);

        assertEquals(expected, result);
    }

    /**
     * Test of setClasses method, of class School.
     */
    @Test
    public void testSetClasses() {
        System.out.println("Testing setClasses...");
        s.addClass(c1);
        s.setClasses(l2);        
        int expected = 0;
        int result = s.getClasses().size();

        assertEquals(expected, result);
    }
    
}
