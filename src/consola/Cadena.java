/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;


/**
 *
 * @author Gerson
 */
public class Cadena {


    public String espaciar(String cadena, int ancho, boolean centrado) {

        String str = "";
        String str2 = "";
        if (cadena.length() < ancho) {

            if (centrado) {
                int repetir = ancho - cadena.length();

                int mitad = Integer.parseInt(repetir / 2 + "");
                str = this.repetir(" ", mitad);
                str2 = this.repetir(" ", repetir - mitad);
                cadena = str2 + cadena + str;
            } else {

                int repetir = ancho - cadena.length();
                str = this.repetir(" ", repetir);
                cadena = cadena + str;
            }

        }

        return cadena;
    }

    /**
     * 
     * @param cadena el texto que se repetira
     * @param cantidad la cantidad de veces que se repetira
     * @return el texto repetido la cantidad de veces indicado
     */
    public String repetir(String cadena, int cantidad) {
        String repetir = "";
        for (int i = 0; i < cantidad; i++) {
            repetir = repetir + cadena;
        }
        return repetir;
    }

   
}
