import greenfoot.*;

/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro extends Animales
{
    /**
     * Act - do whatever the Perro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       int num = Greenfoot.getRandomNumber(150);
       int aux = Greenfoot.getRandomNumber(5);
        
       if(num==0)
       {
           walkL(aux, -1, "PerroLeft1.png", "PerroLeft2.png");
       }
       if(num==25)
       {
            walkR(aux, 1, "PerroRight1.png", "PerroRight2.png");
       }
       if(num==50)
       {
            walkUp(aux, -1, "PerroUp1.png", "PerroUp2.png");
       }
       if(num==100)
       {
            walkDown(aux, 1, "PerroDown1.png", "PerroDown2.png");            
       }       
    }    
      
     private void walkL(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(6);
            setLocation(getX() + direction, getY());
            setImage(img2);
            wait(6);
            setLocation(getX() + direction, getY());
        }
        setImage("PerroLeftStop.png");
    }
    
    private void walkR(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(6);
            setLocation(getX() + direction, getY());
            setImage(img2);
            wait(6);
            setLocation(getX() + direction, getY());
        }
        setImage("PerroRightStop.png");
    }
    
    private void walkUp(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(6);
            setLocation(getX() , getY() + direction);
            setImage(img2);
            wait(6);
            setLocation(getX() , getY() + direction);
        }
        setImage("PerroUpStop.png");
    }
    
    private void walkDown(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(6);
            setLocation(getX() , getY() + direction);
            setImage(img2);
            wait(6);
            setLocation(getX() , getY() + direction);
        }
        setImage("PerroDownStop.png");
        Greenfoot.playSound("Dog.wav");
    }    
}
