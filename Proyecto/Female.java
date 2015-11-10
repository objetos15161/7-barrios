import greenfoot.*;

/**
 * Verifica que tecla se oprime para darle movimiento
 * 
 * @cesar4206 (Castro Pérez César) 
 * @version (10-11-15)
 */
public class Female extends Mujer
{
    /**
     * Dependiendo la tecla que se oprima es el movimiento que le da al personaje
     */
    public void act() 
    {                 
            if( Greenfoot.isKeyDown("left") )
        {
             walkLeft(1);
             //setLocation (getX()-5, getY());
        }
        if( Greenfoot.isKeyDown("right") )
        {
            walkRight(1);
            //setLocation (getX()+5, getY());
        }
         if( Greenfoot.isKeyDown("up") )
        {
            walkUp(1);
            //setLocation (getX(), getY()-5);            
        }
        if( Greenfoot.isKeyDown("down") )
        {
             walkDown(1);
             //setLocation (getX(), getY()+5);           
        }
    
    }    
}
