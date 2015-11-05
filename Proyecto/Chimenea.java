import greenfoot.*;

/**
 * Write a description of class Chimenea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chimenea extends Escenario
{
    /**
     * Act - do whatever the Chimenea wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {      
       animar();    
    }    
    
    private void animar()
    {
        for (int i=0; i<100; i++) 
        {                 
            setImage("chimenea2.png");
            wait(5);
            setImage("chimenea3.png");
            wait(5);
            setImage("chimenea4.png");
            wait(5);
            setImage("chimenea5.png");
            wait(5);
            setImage("chimenea6.png");
            wait(5);
            setImage("chimenea7.png");
            wait(5);
            setImage("chimenea8.png");
            wait(5);
            setImage("chimenea9.png");
            wait(5);
            setImage("chimenea10.png");
            wait(5);
            setImage("chimenea11.png");
            wait(5);
            setImage("chimenea12.png");
            wait(5);  
        }
        setImage("chimenea1.png");
    }
    
   
    
}
