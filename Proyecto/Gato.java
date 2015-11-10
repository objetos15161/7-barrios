import greenfoot.*;

/**
 * Permite el movimiento autonomo del personaje
 * 
 * @cesar4206 (Castro Pérez César) 
 * @version (10-11-15)
 */
public class Gato extends Animal
{
    /**
     * Genera numeros aleatorios para darle valores al movimiento y a la
     * direccion del movimiento, en diferente orden     
     */
    public void act()    
    {
       int num = Greenfoot.getRandomNumber(150);
       int aux = Greenfoot.getRandomNumber(10);
        
       if(num==0)
       {
           walkL(aux, -1, "Exterior/GatoLeft1.png", "Exterior/GatoLeft2.png");
       }
       if(num==25)
       {
            walkR(aux, 1, "Exterior/GatoRight1.png", "Exterior/GatoRight2.png");
       }
       if(num==50)
       {
            walkUp(aux, -1, "Exterior/GatoUp1.png", "Exterior/GatoUp2.png");
       }
       if(num==100)
       {
            walkDown(aux, 1, "Exterior/GatoDown1.png", "Exterior/GatoDown2.png");            
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
        setImage("Exterior/GatoLeftStop.png");
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
        setImage("Exterior/GatoRightStop.png");
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
        setImage("Exterior/GatoUpStop.png");
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
        setImage("Exterior/GatoDownStop.png");
        Greenfoot.playSound("Cat.wav");
    }    
}
