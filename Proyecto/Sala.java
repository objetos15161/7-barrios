import greenfoot.*;

/**
 * Es la planta baja de la habitación del personaje
 * 
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany)
 * @versión 25/11/15
 */
public class Sala extends World
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
    static private int CELL_WIDTH=20;
    
    
    private Male hombre= new Male();private Boton_Atras atras=new Boton_Atras();
        
    private Habitacion tele1=new Habitacion();
    private Habitacion ventana=new Habitacion();
    
    private Habitacion tapete2=new Tapete2();
    
    private Habitacion mesa=new Habitacion();
    private Habitacion alfombra=new Habitacion();
    
    private Habitacion escaleraarriba=new EscaleraArriba();
    
    private Habitacion sillon2=new Habitacion();
    private Habitacion sillon1=new Habitacion();
    private Habitacion arbolito=new Habitacion();
    private Habitacion lavamanos=new Habitacion();
    private Habitacion refri=new Habitacion();
    private Habitacion barra=new Habitacion();
    
    /**
     * Construye los objetos en la sala, para el ambiente
     * 
     */
    public Sala()
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(ROWS,COLS,CELL_WIDTH);
        hombre.escenario=1;
        crearSala();
    }    
    private void crearSala()
    {    
        addObject(escaleraarriba, COLS-4, ROWS-18);
        
        alfombra.creaHabitacion(15);
        addObject(alfombra, 19, 17);
        tele1.creaHabitacion(13);
        addObject(tele1, 19,11);
        mesa.creaHabitacion(5);
        addObject(mesa, 5,15);
        sillon2.creaHabitacion(2);
        addObject(sillon2, 3,15);
        sillon1.creaHabitacion(1);
        addObject(sillon1, 19,16);
        addObject(sillon1, 18,16);
        addObject(sillon1, 20,16);
        ventana.creaHabitacion(6);
        addObject(ventana, 3,2);    
        arbolito.creaHabitacion(10);
        addObject(arbolito, 0,22);
        addObject(arbolito, 19,22);
        
        addObject(tapete2, ROWS/2, COLS-1);
        
        lavamanos.creaHabitacion(9);
        addObject(lavamanos, 1, 5);
        refri.creaHabitacion(11);
        addObject(refri, 6, 5);
        barra.creaHabitacion(7);
        addObject(barra, 1, 9);
       
      
        addObject(hombre, 22, 6);
        addObject(atras, 20, 2);    
   
  }  
}
