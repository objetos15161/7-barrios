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
        
        if(isTouching(Num50D.class))
        {
            Greenfoot.setWorld(new San_Sebastian());            
        }
        if(isTouching(Num50I.class))
        {
            Greenfoot.setWorld(new TlaxcalaWorld());            
        }
        if(isTouching(Num40I.class))
        {
            Greenfoot.setWorld(new Calle());            
        }
        if(isTouching(Num40D.class))
        {
            Greenfoot.setWorld(new Montecillo_World());            
        }
        
        if(isTouching(PuertaAbierta.class))
        {
            Greenfoot.setWorld(new Montecillo_World());            
        }
        if(isTouching(PuertaCerrada.class))
        {
            Greenfoot.setWorld(new TlaxcalaWorld());            
        }        
        if(isTouching(EscaleraAbajo.class))
        {
            Greenfoot.setWorld(new Sala());            
        }        
        if(isTouching(EscaleraArriba.class))
        {
            Greenfoot.setWorld(new Cuarto());            
        }        
        if(isTouching(Tapete2.class))
        {
            Greenfoot.setWorld(new Calle());            
        }
        if(isTouching(PuertaCasa.class))
        {
            Greenfoot.setWorld(new Sala());            
        }        
    }    
}
