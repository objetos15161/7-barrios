import greenfoot.*;

/**
 * Write a description of class Reloj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reloj extends Actor
{
    private SimpleTimer timer;
    private Counter valor;
    
    public Reloj()
    {
        valor = new Counter("Tiempo: ");
        timer = new SimpleTimer();
    }
    
    protected void addedToWorld(World mundo)
    {
        mundo.addObject(valor, 550, 15);
    }
        
    public void act() 
    {
        if(timer.millisElapsed()>1000)
        {
            valor.add(1);
            timer.mark();
        }
    }    
}