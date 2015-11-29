import greenfoot.*;

/**
 * Es la planta baja de la habitación del personaje
 * 
 * @autor César Castro
 * @versión 25/11/15
 */
public class Sala extends World
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
    static private int CELL_WIDTH=20;
    
    public Counter nivel;
    public Male hombre= new Male();
        
    private Habitacion tele1=new Tele1();
    private Habitacion ventana=new Ventana();
    private Habitacion tapete2=new Tapete2();
    private Habitacion mesa=new Mesa();
    private Habitacion alfombra=new Alfombra();
    private Habitacion escaleraarriba=new EscaleraArriba();
    private Habitacion sillon2=new Sillon2();
    private Habitacion sillon1=new Sillon1();
    private Habitacion arbolito=new Planta();
    private Habitacion lavamanos=new Lavamanos();
    private Habitacion refri=new Refri();
    private Habitacion barra=new Barra();
    private Habitacion chimenea=new Chimenea();
    /**
     * Construye los objetos en la sala, para el ambiente
     * 
     */
    public Sala()
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(ROWS,COLS,CELL_WIDTH);
        hombre.nivel=1;
        hombre.viene=2;
        crearSala();
    }    
    private void crearSala()
    {    
        addObject(escaleraarriba, COLS-4, ROWS-18);
        addObject(alfombra, 19, 17);
        addObject(tele1, 19,11);
        addObject(mesa, 5,15);
        addObject(sillon2, 3,15);
        
        addObject(sillon1, 19,16);
        addObject(sillon1, 18,16);
        addObject(sillon1, 20,16);
        
        addObject(ventana, 3,2);    
        
        addObject(arbolito, 0,22);
        addObject(arbolito, 19,22);
        
        addObject(tapete2, ROWS/2, COLS-1);
        addObject(lavamanos, 1, 5);
        addObject(refri, 6, 5);
        addObject(barra, 1, 9);
       // addObject(chimenea, 7, 2);
      
         addObject(hombre, 22, 6);
   
  }  
}
