import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Barrio here.
 * 
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany)
 * @version (11-10-15)
 */
public class Barrio extends World
{
   static private final int ROWS = 24;
   static private final int COLS = 24;
   static private int CELL_WIDTH=20;
   public Counter vidas = new Counter("Vidas: ");
       
    /**     
     */    
    public Barrio()
    {            
        super(ROWS,COLS,CELL_WIDTH); 
        
        vidas.setValue(3);
        Greenfoot.setWorld(new Menu());
        
        addObject(vidas, 2,23);      
   }
   
   public Counter dimeVidas()
   {
       return vidas;       
   }
   
   public void disminuyeVid()
   {
       vidas.add(-1);
    }
}
