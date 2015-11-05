import greenfoot.*;

/**
 * Write a description of class Female here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
