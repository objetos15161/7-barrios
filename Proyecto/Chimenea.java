import greenfoot.*;

/**
 * Write a description of class Chimenea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chimenea extends Habitacion
{
    /**
     * Act - do whatever the Chimenea wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {     
       setImage("Residencia/Chimenea1.png");
       animar();    
    }    
    
    private void animar()
    {
        for (int i=0; i<100; i++) 
        {                 
            setImage("Residencia/Chimenea2.png");
            wait(5);
            setImage("Residencia/Chimenea3.png");
            wait(5);
            setImage("Residencia/Chimenea4.png");
            wait(5);
            setImage("Residencia/Chimenea5.png");
            wait(5);
            setImage("Residencia/Chimenea6.png");
            wait(5);
            setImage("Residencia/Chimenea7.png");
            wait(5);
            setImage("Residencia/Chimenea8.png");
            wait(5);
            setImage("Residencia/Chimenea9.png");
            wait(5);
            setImage("Residencia/Chimenea10.png");
            wait(5);
            setImage("Residencia/Chimenea11.png");
            wait(5);
            setImage("Residencia/Chimenea12.png");
            wait(5);  
        }
        setImage("Residencia/Chimenea1.png");
    }
    
   
    
}
