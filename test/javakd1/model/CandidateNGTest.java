/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javakd1.model;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author Richs
 */
public class CandidateNGTest {
    
    public CandidateNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getNo method, of class Candidate.
     */
    @Test
    public void testGetNo() {
        System.out.println("getNo");
        Candidate instance = null;
        int expResult = 0;
        int result = instance.getNo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVotes method, of class Candidate.
     */
    @Test
    public void testGetVotes() {
        System.out.println("getVotes");
        Candidate instance = null;
        int expResult = 0;
        int result = instance.getVotes();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComment method, of class Candidate.
     */
    @Test
    public void testGetComment() {
        System.out.println("getComment");
        Candidate instance = null;
        String expResult = "";
        String result = instance.getComment();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVotes method, of class Candidate.
     */
    @Test
    public void testSetVotes() {
        System.out.println("setVotes");
        int votes = 0;
        Candidate instance = null;
        instance.setVotes(votes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CandidateImpl extends Candidate {

        public CandidateImpl() {
            super(0, 0, "", 0, "");
        }

        @Override
        public int getMyID() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
