/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import java.util.*;

/**
 *
 * @author Gerson
 */
public class Menu extends Consola {

    ArrayList<MenuItem> lista = new ArrayList<>();
    private String titulo = "";

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Menu() {
        super();
    }

    /**
     * agrega un item al menu
     * 
     * @param titulo titulo del item
     * @param callback funcion del item
     */
    public void agregar(String titulo, MenuCallback callback) {
        lista.add(new MenuItem(titulo, callback));
    }

    /**
     * agrega un submenu al menu
     * 
     * @param titulo titulo del submenu
     * @param menu menu
     */
    public void agregar(String titulo, final Menu menu) {
        final Menu padre = this;

        if (menu.getTitulo().equals("")) {
            menu.setTitulo(titulo);
        }



        menu.agregar("Regresar", new MenuCallback() {
            @Override
            public void ejecutar() {
                padre.mostrar();
            }
        });
        lista.add(new MenuItem(titulo, new MenuCallback() {
            @Override
            public void ejecutar() {

                menu.mostrar();
            }
        }).setMenu(true));
    }

    /**
     * muestra el menu
     */
    public void mostrar() {

        this.limpiarPantalla();
        int choosen = 0;
        int espaciado= 60;
        Scanner in = new Scanner(this.in);
        Cadena base = new Cadena();


        if (!this.getTitulo().equals("")) {
            int ancho_titulo = this.titulo.length();
            ancho_titulo = ancho_titulo < espaciado ? espaciado : ancho_titulo;
            System.out.println(base.repetir("-", ancho_titulo  ));
            System.out.println("-" + base.espaciar(this.titulo, ancho_titulo-2, true) + "-");
            System.out.println(base.repetir("-", ancho_titulo ));
        }
        int i = 0;
        for (i = 0; i < lista.size(); ++i) {
            MenuItem mi = lista.get(i);
            System.out.printf("[%d] %s \n", i + 1, mi.getTexto());
        }

        System.out.printf("[%d] %s \n", i + 1, "Salir");

        System.out.println();
        System.out.print("Selecciona una Opcion:");

        try {
            choosen = in.nextInt();
        } catch (Exception e1) {
        }


        if (choosen == lista.size() + 1) {

            System.out.println("");
            System.out.println(base.repetir("*", espaciado));
            System.out.println(base.espaciar("Adios, que tengas buen dia", espaciado, true));
            System.out.println(base.repetir("*", espaciado));


            System.exit(1);
        } else if (choosen > lista.size() || choosen < 1) {


            System.out.println("");
            System.out.println(base.repetir("*", espaciado));
            System.out.println(base.espaciar("Opcion invalida, presione ENTER para regresar al menu", espaciado, true));
            System.out.println(base.repetir("*", espaciado));
            in.nextLine();
            in.nextLine();
            this.mostrar();
        } else {

            MenuItem mi = lista.get(choosen - 1);
            MenuCallback mc = mi.getMenuCallback();

            this.limpiarPantalla();

            if (!mi.isMenu() && !mi.getTexto().equals("Regresar")) {

                System.out.println(base.repetir("-", espaciado));
                System.out.println(base.espaciar(mi.getTexto(), espaciado, true));
                System.out.println(base.repetir("-", espaciado));

                System.out.println("");
            }
            mc.ejecutar();


            System.out.println("");

            System.out.println(base.repetir("*", espaciado));
            System.out.println(base.espaciar("Presione ENTER para regresar al menu", espaciado, true));
            System.out.println(base.repetir("*", espaciado));

            in.nextLine();
            in.nextLine();
            this.mostrar();
        }
    }
}
