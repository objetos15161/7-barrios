import greenfoot.*;

/**
 * Es el escenario Principal en donde aparecerá el personaje
 * 
 * @autor César Castro
 * @versión 25/11/15
 */
public class Cuarto extends World
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
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
        hombre.nivel=1;
        crearCuarto();
    }
    
    private void crearCuarto()
    {                       
        addObject(escaleraabajo, COLS-4, ROWS-18);
        addObject(alfombra, ROWS/2, COLS/2);
        addObject(tele, ROWS/2,COLS/3+1);
        addObject(consola, 15,COLS/3+1);
        addObject(ordenador, 1,5);
        addObject(sillon1, 1,6);
        addObject(ventana, ROWS/2,2);
        
        addObject(arbolito, 0,13);
        addObject(cama, 4, COLS/2);
        addObject(tapete1, COLS-5,ROWS-18);
        
        addObject(hombre, 18, 6);        
    }    
}
