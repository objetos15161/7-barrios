import greenfoot.*;

/**
 * Write a description of class San_Sebastian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class San_Sebastian extends World
{
  
  public Counter nivel;
  public Female mujer= new Female();
  public PuertaAbierta door= new  PuertaAbierta();
    /**
     * Constructor for objects of class San_Sebastian.
     * 
     */
    public San_Sebastian()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        
        nivel = new Counter("Barrio San Sebastian: ");
        nivel.setValue(1);
        addObject(nivel, 280, 10);
        addObject(mujer, 200, 100);
        addObject(door, 100,50);
        /*if(hombre.getX()==door.getX() || door.getY()== hombre.getY())
        {
           nivel.setValue(2); 
        }*/
        
       
    }
    
}
