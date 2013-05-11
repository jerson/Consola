/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
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
public class ConsolaTest {

    public ConsolaTest() {
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
     * Test of getEntero method, of class Consola.
     */
    @Test
    public void testGetEntero_0args() throws UnsupportedEncodingException {
        String data = "233";
        InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));

        System.out.println("getEntero");
        Consola instance = new Consola(testInput);
        int expResult = 233;

        int result = instance.getEntero();
        assertEquals(expResult, result);




    }

    /**
     * Test of getEntero method, of class Consola.
     */
    @Test
    public void testGetEntero_String() throws UnsupportedEncodingException {
        String data = "564 ";
        InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));

        System.out.println("getEntero");
        String mensaje = "Ingrese un numero Entero";
        Consola instance = new Consola(testInput);
        int expResult = 564;
        int result = instance.getEntero(mensaje);
        assertEquals(expResult, result);

    }

    /**
     * Test of getEntero method, of class Consola.
     */
    @Test
    public void testGetEntero_String_int() throws UnsupportedEncodingException {

        String data = " 678 ";
        InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));

        System.out.println("getEntero");
        String mensaje = "Ingresa un numero entero";
        int defecto = 100;
        Consola instance = new Consola(testInput);
        int expResult = 678;
        int result = instance.getEntero(mensaje, defecto);
        assertEquals(expResult, result);

    }

    /**
     * Test of getEntero method, of class Consola.
     */
    @Test
    public void testGetEntero_String_intVacio() throws UnsupportedEncodingException {

        String data = " ";
        InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));

        System.out.println("getEntero");
        String mensaje = "Ingresa un numero entero";
        int defecto = 100;
        Consola instance = new Consola(testInput);
        int expResult = 100;
        int result = instance.getEntero(mensaje, defecto);
        assertEquals(expResult, result);

    }

    /**
     * Test of getNumero method, of class Consola.
     */
    @Test
    public void testGetNumero_0args() throws UnsupportedEncodingException {
        String data = " 40.20 ";
        InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));

        System.out.println("getNumero");
        Consola instance = new Consola(testInput);
        double expResult = 40.2;
        double result = instance.getNumero();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getBoolean method, of class Consola.
     */
    @Test
    public void testGetBoolean_0args() throws UnsupportedEncodingException {
        String data = " SI ";
        InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));

        System.out.println("getBoolean");
        Consola instance = new Consola(testInput);
        boolean expResult = true;
        boolean result = instance.getBoolean();
        assertEquals(expResult, result);

    }

    /**
     * Test of getBoolean method, of class Consola.
     */
    @Test
    public void testGetBoolean_String() throws UnsupportedEncodingException {
        String data = "NO ";
        InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));

        System.out.println("getBoolean");
        String mensaje = "Ingrese SI ó NO";
        Consola instance = new Consola(testInput);
        boolean expResult = false;
        boolean result = instance.getBoolean(mensaje);
        assertEquals(expResult, result);

    }

    /**
     * Test of getBoolean method, of class Consola.
     */
    @Test
    public void testGetBoolean_String_boolean() throws UnsupportedEncodingException {
        String data = " ";
        InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));

        System.out.println("getBoolean");
        String mensaje = "Ingrese SI ó NO";
        boolean defecto = true;
        Consola instance = new Consola(testInput);
        boolean expResult = true;
        boolean result = instance.getBoolean(mensaje, defecto);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumero method, of class Consola.
     */
    @Test
    public void testGetNumero_String() throws UnsupportedEncodingException {
        String data = " 45.4";
        InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));

        System.out.println("getNumero");
        String mensaje = "Ingresa un numero";
        Consola instance = new Consola(testInput);
        double expResult = 45.4;
        double result = instance.getNumero(mensaje);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getNumero method, of class Consola.
     */
    @Test
    public void testGetNumero_String_double() throws UnsupportedEncodingException {
        String data = " ";
        InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
        
        System.out.println("getNumero");
        String mensaje = "Ingresa un numero";
        double defecto = 78.12;
        Consola instance = new Consola(testInput);
        double expResult = 78.12;
        double result = instance.getNumero(mensaje, defecto);
        assertEquals(expResult, result, 0.0);
     
    }

    /**
     * Test of getCadena method, of class Consola.
     */
    @Test
    public void testGetCadena_0args() throws UnsupportedEncodingException {
        String data = "hola mundo test";
        InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
        
        System.out.println("getCadena");
        Consola instance = new Consola(testInput);
        String expResult = "hola mundo test";
        String result = instance.getCadena();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCadena method, of class Consola.
     */
    @Test
    public void testGetCadena_String() throws UnsupportedEncodingException {
        String data = "hola mundo test";
        InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
        
        System.out.println("getCadena");
        String mensaje = "Ingresa una Cadena";
        Consola instance = new Consola(testInput);
        String expResult = "hola mundo test";
        String result = instance.getCadena(mensaje);
        assertEquals(expResult, result);
    }

   
    /**
     * Test of limpiarPantalla method, of class Consola.
     */
    @Test
    public void testLimpiarPantalla() {
        System.out.println("limpiarPantalla");
        Consola instance = new Consola();
        instance.limpiarPantalla();
       
    }
}