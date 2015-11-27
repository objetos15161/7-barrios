import greenfoot.*;

/**
 * Es el escenario Principal en donde aparecerá el personaje
 * 
 * @autor César Castro
 * @versión 25/11/15
 */
public class Cuarto extends World
{
    static private final int ROWS = 20;
    static private final int COLS = 15;
    static private int CELL_WIDTH=20;
    
    public Counter nivel;
    public Male hombre= new Male();
      
    private Habitacion tele=new Tele();
    private Habitacion ventana=new Ventana();
    private Habitacion cama=new Cama();
    private Habitacion consola=new Consola();
    private Habitacion alfombra=new Alfombra();
    private Habitacion escaleraabajo=new EscaleraAbajo();
    private Habitacion ordenador=new Ordenador();
    private Habitacion sillon1=new Sillon1();
    private Habitacion arbolito=new Planta();
    private Habitacion tapete1=new Tapete1();   

    /**
     *Crea el Cuarto donde aparecera el personaje
     *y añade los objetos necesarios para el ambiente.
     */
    public Cuarto()
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(ROWS,COLS,CELL_WIDTH);
        crearCuarto();
    }
    
    private void crearCuarto()
    {                       
        addObject(escaleraabajo, COLS-4, ROWS-18);
        addObject(alfombra, ROWS/2, COLS/2);
        addObject(tele, ROWS/2,COLS/3);
        addObject(consola, 12,COLS/3);
        addObject(ordenador, 1,1);
        addObject(sillon1, 1,2);
        addObject(ventana, ROWS/2,0);
        
        addObject(arbolito, 0,13);
        addObject(cama, 2, 7);
        addObject(tapete1, COLS-5,ROWS-18);
        
        addObject(hombre, ROWS/2, COLS/2);        
    }    
}
