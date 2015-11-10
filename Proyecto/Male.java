import greenfoot.*;

/**
 * Verifica que tecla se oprime para darle movimiento
 * 
 * @cesar4206 (Castro Pérez César) 
 * @version (10-11-15)
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
