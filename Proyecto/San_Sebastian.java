import greenfoot.*;

/**
 * Write a description of class San_Sebastian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class San_Sebastian extends World
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
    static private int CELL_WIDTH=20;
  
  public Counter nivel;
  public Female mujer= new Female();
  public PuertaAbierta door= new  PuertaAbierta();
  
  private Casa casa1=new Casa1();
  public PuertaCasa door2= new  PuertaCasa();
    /**
     * Constructor for objects of class San_Sebastian.
     * 
     */
    public San_Sebastian()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(ROWS,COLS,CELL_WIDTH);
               
        nivel = new Counter("Barrio San Sebastian: ");
        nivel.setValue(1);        
        
        addObject(casa1, 12,0);
        addObject(door2, 12,4);
        addObject(door, 12,22);
        
        addObject(nivel, 5, 0);
        addObject(mujer, 12, 7);
        /*if(hombre.getX()==door.getX() || door.getY()== hombre.getY())
        {
           nivel.setValue(2); 
        }*/
        
       
    }
    
}
