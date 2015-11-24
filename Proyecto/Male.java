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
        int pasos=1;
        if( Greenfoot.isKeyDown("left") )
        {
             walkLeft(pasos);            
        }
        if( Greenfoot.isKeyDown("right") )
        {
            walkRight(pasos);            
        }
         if( Greenfoot.isKeyDown("up") )
        {
            walkUp(pasos);
        }
        if( Greenfoot.isKeyDown("down") )
        {
             walkDown(pasos);
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
