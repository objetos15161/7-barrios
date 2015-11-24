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
        int pasos=1;
            if( Greenfoot.isKeyDown("left") )
        {
             walkLeft(pasos);
             //setLocation (getX()-5, getY());
        }
        if( Greenfoot.isKeyDown("right") )
        {
            walkRight(pasos);
            //setLocation (getX()+5, getY());
        }
         if( Greenfoot.isKeyDown("up") )
        {
            walkUp(pasos);
            //setLocation (getX(), getY()-5);            
        }
        if( Greenfoot.isKeyDown("down") )
        {
             walkDown(pasos);
             //setLocation (getX(), getY()+5);           
        }
        if(isTouching(PuertaAbierta.class))
        {
            Greenfoot.setWorld(new Montecillo_World());            
        }
        if(isTouching(PuertaCerrada.class))
        {
            Greenfoot.setWorld(new TlaxcalaWorld());            
        }
    }    
}
