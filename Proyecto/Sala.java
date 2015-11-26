import greenfoot.*;

/**
 * Escribe una descrición de la clase Sala aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Sala extends World
{
    static private final int ROWS = 20;
    static private final int COLS = 15;
    static private int CELL_WIDTH=20;
    
    public Counter nivel;
    public Female mujer= new Female();
        
    private Habitacion muro=new Muro();
    private Habitacion piso=new Piso();
    
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
    

    /**
     * Constructor para objetos de clase Sala.
     * 
     */
    public Sala()
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(ROWS,COLS,CELL_WIDTH);
        crearSala();
    }
    
     
    private void crearSala()
    {
        int ren, posx=0;
        int col, posy=0;
        for(ren=0; ren <= ROWS ;ren++)
        {            
            for (col=0; col <= COLS ;col++)
            {
                addObject(piso,posy,posx);
                posy++;
            }
            posx++;
        }
        
        posx=0;
        posy=0;
        
        for(ren=0; ren >= ROWS ;ren++)
        {    
            addObject(muro,posy,posx);
            posx++;
        }
                
        addObject(escaleraarriba, COLS-4, ROWS-18);
        addObject(alfombra, 15, 11);
        addObject(tele1, 17,1);
        addObject(mesa, 3,ROWS/2);
        addObject(sillon2, 1,ROWS/2);
        
        addObject(sillon1, 14,11);
        addObject(sillon1, 15,11);
        addObject(sillon1, 16,11);
        
        addObject(ventana, 3,0);    
        
        addObject(arbolito, 0,13);
        addObject(arbolito, 19,13);
        
        addObject(tapete2, ROWS/2, 14);
        addObject(lavamanos, 1, 1);
        addObject(refri, 4, 1);
        addObject(barra, 1, 4);
        
        addObject(mujer, 13, 2);        
    }    
}
