
Consola
========

metodos basicos de consola para obtener variables de manera simple y poder crear menus de manera facil y rapida.




###Ejemplos de Consola

- ####Obtener una Cadena
	
        Consola consola = new Consola(System.in);
        String texto = consola.getCadena(); 

- ####Obtener una Cadena con mensaje
	
        Consola consola = new Consola(System.in);
        String texto = consola.getCadena("Ingresa un Texto"); 
        //Ingresa un Texto:    
        
- ####Obtener un Numero
	
        Consola consola = new Consola(System.in);
        double numero = consola.getNumero();  
        
- ####Obtener un Numero con mensaje
	
        Consola consola = new Consola(System.in);
        double numero = consola.getNumero("Ingresa un Numero"); 
        //Ingresa un Numero:    
        
- ####Obtener un Numero con mensaje y valor por defecto
	
        Consola consola = new Consola(System.in);
        double defecto = 45;
        double numero = consola.getNumero("Ingresa un Numero",defecto);   
        //Ingresa un Numero [45]:   
        
- ####Obtener un Entero
	
        Consola consola = new Consola(System.in);
        int numero = consola.getEntero();  
        
- ####Obtener un Entero con mensaje
	
        Consola consola = new Consola(System.in);
        int numero = consola.getEntero("Ingresa un Numero Entero");  
        //Ingresa un Numero Entero: 
        
- ####Obtener un Entero con mensaje y valor por defecto
	
        Consola consola = new Consola(System.in);
        int defecto = 30;
        int numero = consola.getEntero("Ingresa un Numero Entero",defecto); 
        //Ingresa un Numero Entero [30]:   
        
- ####Obtener un Boolean
	
        Consola consola = new Consola(System.in);
        boolean valor = consola.getBoolean();  
        
- ####Obtener un Boolean con mensaje
	
        Consola consola = new Consola(System.in);
        boolean valor = consola.getBoolean("Deseas Continuar");  
        //Deseas Continuar SI/NO [SI]:         
        
- ####Obtener un Boolean con mensaje y valor por defecto
	
        Consola consola = new Consola(System.in);
        boolean defecto = false;
        boolean valor = consola.getBoolean("Deseas Continuar",defecto);   
        //Deseas Continuar SI/NO [NO]:      
        
- ####Obtener Coordenadas
	
        Consola consola = new Consola(System.in);
        double[][] coordenadas = consola.getCoordenadas(2);
        
        //Los Los Datos para I[0]:
		//I[0][X]:3
		//I[0][Y]:5
		//
		//Los Los Datos para I[1]:
		//I[1][X]:6
		//I[1][Y]:7    
        
- ####Obtener Matriz
	
        Consola consola = new Consola(System.in);
        double[][] matriz = consola.getMatriz(2,3); 
        //Ingresa datos para M[0]:
        //M[0][0]:1
        //M[0][1]:2
        //
        //Ingresa datos para M[1]:
        //M[1][0]:3
        //M[1][1]:4
        //
        //Ingresa datos para M[2]:
        //M[2][0]:5
        //M[2][1]:6
        
        
####Validación

en caso el campo sea incorrecto se mostrara un mensaje de error para que se ingrese el valor nuevamente 

	**Error: Valor Incorrecto, Intente Nuevamente**
	



###Ejemplos de Menu

- ####Crear un menu
      
       Menu menu = new Menu();
       
       menu.setTitulo("Titulo del Menu");
       menu.agregar("opcion 1", new MenuCallback() {

           @Override
           public void ejecutar() {
               System.out.println("tu codigo aqui");
           }
       });
       
       menu.agregar("opcion 2", new MenuCallback() {

           @Override
           public void ejecutar() {
               System.out.println("tu codigo aqui");
           }
       });
       
       menu.mostrar();
       
       
        //------------------------------------------------------------
        //-                      Titulo del Menu                     -
        //------------------------------------------------------------
        //[1] opcion 1 
        //[2] opcion 2 
        //[3] Salir 
        //
        //Selecciona una Opcion:2
        //------------------------------------------------------------
        //                          opcion 2                          
        //------------------------------------------------------------
        //
        //tu codigo aqui
        //
        //************************************************************
        //            Presione ENTER para regresar al menu            
        //************************************************************
        
        
        
- ####Crear sub menu

       Menu menu = new Menu();
       
       menu.setTitulo("Titulo del Menu");
       menu.agregar("opcion 1", new MenuCallback() {

           @Override
           public void ejecutar() {
               System.out.println("tu codigo aqui");
           }
       });
       
       menu.agregar("opcion 2", new MenuCallback() {

           @Override
           public void ejecutar() {
               System.out.println("tu codigo aqui");
           }
       });
       
       
       Menu submenu = new Menu();
       submenu.setTitulo("Titulo del Sub Menu");
       
       submenu.agregar("sub opcion", new MenuCallback() {

           @Override
           public void ejecutar() {
               System.out.println("tu codigo aqui");
           }
       });
       menu.agregar("Submenu", submenu);
       
       menu.mostrar();
       
        //------------------------------------------------------------
        //-                      Titulo del Menu                     -
        //------------------------------------------------------------
        //[1] opcion 1 
        //[2] opcion 2 
        //[3] Submenu 
        //[4] Salir 
        //
        //Selecciona una Opcion:3
        //------------------------------------------------------------
        //-                    Titulo del Sub Menu                   -
        //------------------------------------------------------------
        //[1] sub opcion 
        //[2] Regresar 
        //[3] Salir 
        //
        //Selecciona una Opcion:1
        //------------------------------------------------------------
        //                         sub opcion                         
        //------------------------------------------------------------
        //
        //tu codigo aqui
        //
        //************************************************************
        //            Presione ENTER para regresar al menu            
        //************************************************************

       