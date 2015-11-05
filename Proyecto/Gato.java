import greenfoot.*;

/**
 * Write a description of class Gato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gato extends Animales
{
    /**
     * Act - do whatever the Gato wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()    
    {
       int num = Greenfoot.getRandomNumber(150);
       int aux = Greenfoot.getRandomNumber(10);
        
       if(num==0)
       {
           walkL(aux, -1, "GatoLeft1.png", "GatoLeft2.png");
       }
       if(num==25)
       {
            walkR(aux, 1, "GatoRight1.png", "GatoRight2.png");
       }
       if(num==50)
       {
            walkUp(aux, -1, "GatoUp1.png", "GatoUp2.png");
       }
       if(num==100)
       {
            walkDown(aux, 1, "GatoDown1.png", "GatoDown2.png");            
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
        setImage("GatoLeftStop.png");
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
        setImage("GatoRightStop.png");
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
        setImage("GatoUpStop.png");
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
        setImage("GatoDownStop.png");
        Greenfoot.playSound("Cat.wav");
    }    
}
