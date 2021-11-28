/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Calculadora;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mike_
 */
public class ClaseCalculadoraTest {
    
    public ClaseCalculadoraTest() {
    }

    /**
     * Test of suma method, of class ClaseCalculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        double v1 = 1.0;
        double v2 = 1.0;
        ClaseCalculadora instance = new ClaseCalculadora();
        double expResult = 4.0;
        double result = instance.suma(v1, v2);
        //assertEquals(expResult, result);
        if(expResult==result){
        }
        else
            fail("The test case is a prototype.");
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of resta method, of class ClaseCalculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        double v1 = 10.0;
        double v2 = 5.0;
        ClaseCalculadora instance = new ClaseCalculadora();
        double expResult = 5.0;
        double result = instance.resta(v1, v2);
        //assertEquals(expResult, result, 5.0);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult==result){
        }
        else
            fail("The test case is a prototype.");
        
    }

    /**
     * Test of multiplicacion method, of class ClaseCalculadora.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        double v1 = 2.0;
        double v2 = 10.0;
        ClaseCalculadora instance = new ClaseCalculadora();
        double expResult = 20.0;
        double result = instance.multiplicacion(v1, v2);
        //assertEquals(expResult, result, 20.0);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult==result){
        }
        else
            fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class ClaseCalculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        double v1 = 20.0;
        double v2 = 10.0;
        ClaseCalculadora instance = new ClaseCalculadora();
        double expResult = 2.0;
        double result = instance.division(v1, v2);
        //assertEquals(expResult, result, .0);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult==result){
        }
        else
            fail("The test case is a prototype.");
    }

    
}
