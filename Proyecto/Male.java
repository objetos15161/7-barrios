import greenfoot.*;

/**
 * Write a description of class Male here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Male extends Hombre
{
   /**
     * Dependiendo la tecla que se oprima es el movimiento que le da al personaje
     */
    public void act() 
    {                 
        if( Greenfoot.isKeyDown("left") )
        {
             walkLeft(1);            
        }
        if( Greenfoot.isKeyDown("right") )
        {
            walkRight(1);            
        }
         if( Greenfoot.isKeyDown("up") )
        {
            walkUp(1);
        }
        if( Greenfoot.isKeyDown("down") )
        {
             walkDown(1);
        }    
    }    
}
