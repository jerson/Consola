/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import java.awt.Robot;
import java.io.*;

/**
 *
 * @author Gerson
 */
public class Consola {

    InputStream in;

    public Consola() {
        this.in = System.in;
    }

    public Consola(InputStream in) {
        this.in = in;
    }

    /**
     * retorna un numero entero que se ingresara por consola
     *
     * @return numero entero
     */
    public int getEntero() {
        return this.getEntero("");


    }

    /**
     * retorna un numero entero que se ingresara por consola
     *
     * @param mensaje mensaje para mostrar al usuario en consola
     * @return numero entero
     */
    public int getEntero(String mensaje) {
        return this.getEntero(mensaje, 0);
    }

    /**
     * retorna un numero entero que se ingresara por consola
     *
     * @param mensaje mensaje para mostrar al usuario en consola
     * @param defecto valor por defecto en caso no ingresara un valor valido
     * @return numero entero
     */
    public int getEntero(String mensaje, int defecto) {


        mensaje = mensaje.equals("") ? mensaje : mensaje + (defecto != 0 ? " [" + defecto + "]" : "");
        int numero = (int) this.getNumero(mensaje, defecto);


        return numero;
    }

    /**
     * retorna un numero que se ingresara por consola
     *
     * @return numero entero
     */
    public double getNumero() {
        return this.getNumero("");
    }

    /**
     * retorna true o false al ingresar por consola SI o NO respectivamente
     *
     * @return true/false
     */
    public boolean getBoolean() {
        return this.getBoolean("");
    }

    /**
     * retorna true o false al ingresar por consola SI o NO respectivamente
     *
     * @param mensaje mensaje para mostrar al usuario en consola
     * @return true/false
     */
    public boolean getBoolean(String mensaje) {
        return this.getBoolean(mensaje, true);
    }

    /**
     * retorna true o false al ingresar por consola SI o NO respectivamente
     *
     * @param mensaje mensaje para mostrar al usuario en consola
     * @param defecto valor por defecto en caso ingrese un valor incorrecto
     * @return true/false
     */
    public boolean getBoolean(String mensaje, boolean defecto) {
        boolean opcion;

        mensaje = mensaje.equals("") ? mensaje : mensaje + " SI/NO [" + (defecto ? "SI" : "NO") + "]";
        String respuesta = this.getCadena(mensaje).trim();

        if (respuesta.equalsIgnoreCase("SI")) {
            opcion = true;
        } else if (respuesta.equalsIgnoreCase("NO")) {
            opcion = false;
        } else {
            opcion = defecto;
        }



        return opcion;
    }

    /**
     * retorna un numero que se ingresara por consola
     *
     * @param mensaje mensaje para mostrar al usuario en consola
     * @return numero
     */
    public double getNumero(String mensaje) {
        return this.getNumero(mensaje, 0);
    }

    /**
     * retorna un numero que se ingresara por consola
     *
     * @param mensaje mensaje para mostrar al usuario en consola
     * @param defecto valor por defecto, debe ser diferente de cero
     * @return numero
     */
    public double getNumero(String mensaje, double defecto) {
        double numero;

        try {
            numero = Double.parseDouble(this.getCadena(mensaje));

        } catch (Exception ex) {


            if (defecto != 0) {
                return defecto;
            } else {
                System.out.println("**Error: Valor Incorrecto, Intente Nuevamente**");
                System.out.println("");
                return this.getNumero(mensaje, defecto);

            }
        }

        return numero;
    }

    /**
     * retorna una cadena que se ingresara por consola
     *
     * @return cadena
     */
    public String getCadena() {
        return this.getCadena("");
    }

    /**
     * retorna una cadena que se ingresara por consola
     *
     * @param mensaje mensaje para mostrar al usuario en consola
     * @return cadena
     */
    public String getCadena(String mensaje) {
        String cadena = "";
        if (!"".equals(mensaje)) {
            System.out.print(mensaje + ": ");
        }


        BufferedReader br = new BufferedReader(new InputStreamReader(this.in));

        try {
            cadena = br.readLine();
        } catch (IOException ex) {
        }

        // Scanner in = new Scanner(this.in);
        // cadena = in.next();

        return cadena;
    }

    /**
     * retorna una matriz bidimensional del mismo ancho y alto
     *
     * @param dimension ancho y alto para la matriz
     * @return matriz
     */
    public double[][] getMatriz(int dimension) {
        return this.getMatriz(dimension, dimension);

    }

    /**
     * retorna una matriz bidimensional del mismo ancho y alto
     *
     * @param ancho ancho de la matriz
     * @param alto alto de la matriz
     * @return matriz
     */
    public double[][] getMatriz(int ancho, int alto) {
        System.out.println("");

        double[][] matriz = new double[alto][ancho];

        for (int i = 0; i < alto; i++) {

            System.out.println("Ingresa datos para M[" + i + "]:");
            for (int j = 0; j < ancho; j++) {

                System.out.print("M[" + i + "][" + j + "]:");
                matriz[i][j] = this.getNumero();

            }


            System.out.println("");
        }

        return matriz;
    }

    /**
     * retorna una matriz con coordenadas X,Y
     *
     * @param cantidad cantidad de coordenadas
     * @return matriz
     */
    public double[][] getCoordenadas(int cantidad) {
        System.out.println("");

        double[][] matriz = new double[2][cantidad];

        for (int i = 0; i < cantidad; i++) {

            System.out.println("Los Los Datos para I[" + i + "]:");
            for (int j = 0; j < 2; j++) {

                System.out.print("I[" + i + "][" + ((j == 0) ? "X" : "Y") + "]:");
                matriz[j][i] = this.getNumero();

            }


            System.out.println("");
        }



        return matriz;
    }

    /**
     * limpia la pantalla en NetBeans y jCreator en windows
     *
     */
    public void limpiarPantalla() {
        try {
            Robot robbie = new Robot();
            robbie.keyPress(17);
            robbie.keyPress(76);
            robbie.keyRelease(17);
            robbie.keyRelease(76);

            Thread.sleep(100);

            // esto es para jcreator
            robbie.keyPress(17);
            robbie.keyPress(16);
            robbie.keyPress(82);
            robbie.keyRelease(17);
            robbie.keyRelease(16);
            robbie.keyRelease(82);



            Thread.sleep(100);

        } catch (Exception ex) {
        }

    }
}
