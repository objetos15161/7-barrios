import greenfoot.*;

/**
 * Write a description of class Boton_Atras here.
 * 
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany) 
 * @version (a version number or a date)
 */
public class Boton_Atras extends Actor
{
    /**
     * Act - do whatever the Boton_Atras wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.getMouseInfo()!=null){
               if(Greenfoot.mousePressed(this))
               {
                  Greenfoot.setWorld(new Menu());                      
               }               
            }
    }    
}
