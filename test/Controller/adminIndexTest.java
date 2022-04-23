/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mahirul Islam Niloy
 */
public class adminIndexTest {
    
    public adminIndexTest() {
    }
    adminIndex AI;
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        AI = new adminIndex();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class adminIndex.
     */
    @Test
    public void checkUserNameTest() {
        assertSame("correct", AI.checkUserName("Admin"));
    }

    /**
     * Test of main method, of class adminIndex.
     */
    
    
}
