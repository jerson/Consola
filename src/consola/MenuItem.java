/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

/**
 *
 * @author Gerson
 */
class MenuItem {

    private MenuCallback funcion;
    private String texto;
    private boolean menu = false;

    boolean isMenu() {
        return menu;
    }

    MenuItem setMenu(boolean menu) {
        this.menu = menu;
        return this;
    }

    /**
     * agrega un item al menu
     *
     * @param texto texto del menu
     * @param funcion funcion del menu
     */
    MenuItem(String texto, MenuCallback funcion) {
        this.funcion = funcion;
        this.texto = texto;
    }

    MenuCallback getMenuCallback() {
        return this.funcion;
    }

    String getTexto() {
        return this.texto;
    }
}
