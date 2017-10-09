/*
 * Description of licence.

 */
package atmProgram;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author makena
 */
public class AtmProgramTest {
    
    public AtmProgramTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class AtmProgram.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AtmProgram.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startProgram method, of class AtmProgram.
     */
    @Test
    public void testStartProgram() {
        System.out.println("startProgram");
        AtmProgram.startProgram();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class AtmProgram.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        int expResult = 0;
        int result = AtmProgram.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeposit method, of class AtmProgram.
     */
    @Test
    public void testSetDeposit() {
        System.out.println("setDeposit");
        int amount = 0;
        AtmProgram.setDeposit(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepositCount method, of class AtmProgram.
     */
    @Test
    public void testGetDepositCount() {
        System.out.println("getDepositCount");
        int expResult = 0;
        int result = AtmProgram.getDepositCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepositCount method, of class AtmProgram.
     */
    @Test
    public void testSetDepositCount() {
        System.out.println("setDepositCount");
        AtmProgram.setDepositCount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDailyDepositAmount method, of class AtmProgram.
     */
    @Test
    public void testSetDailyDepositAmount() {
        System.out.println("setDailyDepositAmount");
        int amount = 0;
        AtmProgram.setDailyDepositAmount(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDailyDepositAmount method, of class AtmProgram.
     */
    @Test
    public void testGetDailyDepositAmount() {
        System.out.println("getDailyDepositAmount");
        int expResult = 0;
        int result = AtmProgram.getDailyDepositAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDailyWithdrawalAmount method, of class AtmProgram.
     */
    @Test
    public void testGetDailyWithdrawalAmount() {
        System.out.println("getDailyWithdrawalAmount");
        int expResult = 0;
        int result = AtmProgram.getDailyWithdrawalAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDailyWithdrawalAmount method, of class AtmProgram.
     */
    @Test
    public void testSetDailyWithdrawalAmount() {
        System.out.println("setDailyWithdrawalAmount");
        int amount = 0;
        AtmProgram.setDailyWithdrawalAmount(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWithdrawalCount method, of class AtmProgram.
     */
    @Test
    public void testSetWithdrawalCount() {
        System.out.println("setWithdrawalCount");
        AtmProgram.setWithdrawalCount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWithdrawalCount method, of class AtmProgram.
     */
    @Test
    public void testGetWithdrawalCount() {
        System.out.println("getWithdrawalCount");
        int expResult = 0;
        int result = AtmProgram.getWithdrawalCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
