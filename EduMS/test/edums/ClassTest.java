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
 * @author Diogo
 */
public class ClassTest {
    Class c;
    Student st;
    public ClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c = new Class("a","b","c",1,2);
        c.setMaxStudents(6);
        st = new Student("Ze","06/12/2017",123456789);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUnitDenomination method, of class Class.
     */
    @Test
    public void testGetUnitDenomination() {
        System.out.println("Testing Unit Denomination...");
        String expResult = "a";
        String result = c.getUnitDenomination();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTypeClass method, of class Class.
     */
    @Test
    public void testGetTypeClass() {
        System.out.println("Testing Type Class...");
        String expResult = "b";
        String result = c.getTypeClass();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCurricularUnit method, of class Class.
     */
    @Test
    public void testGetCurricularUnit() {
        System.out.println("Testing Curricular Unit...");
        String expResult = "c";
        String result = c.getCurricularUnit();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHoursPerClass method, of class Class.
     */
    @Test
    public void testGetHoursPerClass() {
        System.out.println("Testing Hours Per Class...");
        int expResult = 1;
        int result = c.getHoursPerClass();
        assertEquals(expResult, result);
    }

    /**
     * Test of getClassesPerWeek method, of class Class.
     */
    @Test
    public void testGetClassesPerWeek() {
        System.out.println("Testing Classes Per Week...");
        int expResult = 2;
        int result = c.getClassesPerWeek();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxStudents method, of class Class.
     */
    @Test
    public void testGetMaxStudents() {
        System.out.println("Testing Max Students...");
        int expResult = 6;
        int result = c.getMaxStudents();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUnitDenomination method, of class Class.
     */
    @Test
    public void testSetUnitDenomination() {
        System.out.println("Testing setUnitDenomination...");
        c.setUnitDenomination("teste");
        String expected = "teste";
        String result = c.getUnitDenomination();
        assertEquals(expected, result);
    }

    /**
     * Test of setTypeClass method, of class Class.
     */
    @Test
    public void testSetTypeClass() {
        System.out.println("Testing setTypeClass...");
        c.setTypeClass("P");
        String expected = "P";
        String result = c.getTypeClass();
        assertEquals(expected, result);
    }

    /**
     * Test of setCurricularUnit method, of class Class.
     */
    @Test
    public void testSetCurricularUnit() {
        System.out.println("Testing setCurricularUnit...");
        c.setCurricularUnit("teste");
        String expected = "teste";
        String result = c.getCurricularUnit();
        assertEquals(expected, result);
    }
    /**
     * Test of setHoursPerClass method, of class Class.
     */
    @Test
    public void testSetHoursPerClass() {
        System.out.println("Testing setHoursPerClass...");
        c.setHoursPerClass(6);
        int expected = 6;
        int result = c.getHoursPerClass();
        assertEquals(expected, result);
    }

    /**
     * Test of setClassesPerWeek method, of class Class.
     */
    @Test
    public void testSetClassesPerWeek() {
        System.out.println("Testing setClassesPerWeek...");
        c.setClassesPerWeek(6);
        int expected = 6;
        int result = c.getClassesPerWeek();
        assertEquals(expected, result);
    }

    /**
     * Test of setMaxStudents method, of class Class.
     */
    @Test
    public void testSetMaxStudents() {
        System.out.println("Testing setMaxStudents...");
        c.setMaxStudents(6);
        int expected = 6;
        int result = c.getMaxStudents();
        assertEquals(expected, result);
    }

    /**
     * Test of associateStudent method, of class Class.
     */
    @Test
    public void testAssociateStudent() {
        System.out.println("Testing associateStudent...");
        c.associateStudent(st);
        Student expected = st;
        Student result = c.getStudent(0);
        assertEquals(expected, result);
    }

    /**
     * Test of desassociateStudent method, of class Class.
     */
    @Test
    public void testDesassociateStudent() {
        System.out.println("Testing desassociateStudent...");
        c.desassociateStudent(st);
        int expected = 0;
        int result = 0;
        assertEquals(expected, result);
    }    
}
