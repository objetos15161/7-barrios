import greenfoot.*;

/**
 * Es el escenario Principal en donde aparecerá el personaje
 * 
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany)
 * @versión 25/11/15
 */
public class Cuarto extends World
{  
    static private int CELL_WIDTH=20;
    static private final int ROWS = 24;
    static private final int COLS = 24;
    private Male hombre= new Male();
    private Boton_Atras atras=new Boton_Atras();
      
    private Habitacion tele=new Habitacion();
    private Habitacion ventana= new Habitacion();
    private Habitacion cama=new Habitacion();
    private Habitacion consola=new Habitacion();
    private Habitacion alfombra=new Habitacion();
    private Habitacion escaleraabajo=new EscaleraAbajo();
    private Habitacion ordenador=new Habitacion();
    private Habitacion sillon1=new Habitacion();
    private Habitacion arbolito=new Habitacion();
    private Habitacion tapete1=new Habitacion();   

    /**
     *Crea el Cuarto donde aparecera el personaje
     *y añade los objetos necesarios para el ambiente.
     */
    public Cuarto()
    {    
        super(ROWS,COLS,CELL_WIDTH); 
        hombre.escenario=1;
        crearCuarto();
    }
    
    private void crearCuarto()
    {                       
        addObject(escaleraabajo, COLS-4, ROWS-18);
        
        alfombra.creaHabitacion(15);
        addObject(alfombra, ROWS/2, COLS/2);
        tele.creaHabitacion(14);
        addObject(tele, ROWS/2,COLS/3+1);
        consola.creaHabitacion(12);
        addObject(consola, 15,COLS/3+1);
        ordenador.creaHabitacion(4);
        addObject(ordenador, 1,5);
        sillon1.creaHabitacion(1);
        addObject(sillon1, 1,6);
        ventana.creaHabitacion(6);
        addObject(ventana, ROWS/2,2);
        arbolito.creaHabitacion(10);
        addObject(arbolito, 0,13);
        cama.creaHabitacion(3);
        addObject(cama, 4, COLS/2);
        tapete1.creaHabitacion(8);
        addObject(tapete1, COLS-5,ROWS-18);
        
        addObject(hombre, 18, 6); 
        addObject(atras, 20, 2); 
    }    
}
