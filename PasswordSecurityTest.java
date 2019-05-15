/*
 * JUnit test 
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PasswordSecurityTest {

    public PasswordSecurityTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of character method, of class PasswordSecurity.
     */
    @Test
    public void testCharacter() {
        System.out.println("character");
        String password = "Password";
        PasswordSecurity instance = new PasswordSecurity();
        boolean expResult = true;
        boolean result = instance.character(password);
        assertEquals(expResult, result);

    }

    /**
     * Test of lower method, of class PasswordSecurity.
     */
    @Test
    public void testLower() {
        System.out.println("lower");
        String password = "PASSWORd";
        PasswordSecurity instance = new PasswordSecurity();
        boolean expResult = true;
        boolean result = instance.lower(password);
        assertEquals(expResult, result);
        
       
    }

    /**
     * Test of upper method, of class PasswordSecurity.
     */
    @Test
    public void testUpper() {
        System.out.println("upper");
        String password = "passWord";
        PasswordSecurity instance = new PasswordSecurity();
        boolean expResult = true;
        boolean result = instance.upper(password);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of digit method, of class PasswordSecurity.
     */
    @Test
    public void testDigit() {
        System.out.println("digit");
        String password = "Passw0rd";
        PasswordSecurity instance = new PasswordSecurity();
        boolean expResult = true;
        boolean result = instance.digit(password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of special method, of class PasswordSecurity.
     */
    @Test
    public void testSpecial() {
        System.out.println("special");
        String password = "Pa$sword";
        PasswordSecurity instance = new PasswordSecurity();
        boolean expResult = true;
        boolean result = instance.special(password);
        assertEquals(expResult, result);
        
    }

}
