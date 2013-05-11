/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daustinsac
 */
public class CadenaTest {
    
    public CadenaTest() {
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
     * Test of espaciar method, of class Cadena.
     */
    @Test
    public void testEspaciar() {
        System.out.println("espaciar");
        String cadena = "hola mundo";
        int ancho = 12;
        boolean centrado = false;
        Cadena instance = new Cadena();
        String expResult = "hola mundo  ";
        String result = instance.espaciar(cadena, ancho, centrado);
        assertEquals(expResult, result);
        
    }  
    
    /**
     * Test of espaciar method, of class Cadena.
     */
    @Test
    public void testEspaciarConMenos() {
        System.out.println("espaciar con menos espacio");
        String cadena = "hola mundo";
        int ancho = 5;
        boolean centrado = false;
        Cadena instance = new Cadena();
        String expResult = "hola mundo";
        String result = instance.espaciar(cadena, ancho, centrado);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of espaciar method, of class Cadena.
     */
    @Test
    public void testEspaciarCentrar() {
        System.out.println("espaciar centrando el texto");
        String cadena = "hola mundo";
        int ancho = 12;
        boolean centrado = true;
        Cadena instance = new Cadena();
        String expResult = " hola mundo ";
        String result = instance.espaciar(cadena, ancho, centrado);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of repetir method, of class Cadena.
     */
    @Test
    public void testRepetir() {
        System.out.println("repetir");
        String cadena = "-_-";
        int cantidad = 10;
        Cadena instance = new Cadena();
        String expResult = "-_--_--_--_--_--_--_--_--_--_-";
        String result = instance.repetir(cadena, cantidad);
        assertEquals(expResult, result);
        
    }
}