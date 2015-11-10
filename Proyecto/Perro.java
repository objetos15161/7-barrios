import greenfoot.*;

/**
 * Permite el movimiento autonomo del personaje
 * 
 * @cesar4206 (Castro Pérez César) 
 * @version (10-11-15)
 */
public class Perro extends Animal
{
    /**
     * Genera numeros aleatorios para darle valores al movimiento y a la
     * direccion del movimiento, en diferente orden     
     */
    public void act() 
    {
       int num = Greenfoot.getRandomNumber(150);
       int aux = Greenfoot.getRandomNumber(5);
        
       if(num==0)
       {
           walkL(aux, -1, "Exterior/PerroLeft1.png", "Exterior/PerroLeft2.png");
       }
       if(num==25)
       {
            walkR(aux, 1, "Exterior/PerroRight1.png", "Exterior/PerroRight2.png");
       }
       if(num==50)
       {
            walkUp(aux, -1, "Exterior/PerroUp1.png", "Exterior/PerroUp2.png");
       }
       if(num==100)
       {
            walkDown(aux, 1, "Exterior/PerroDown1.png", "Exterior/PerroDown2.png");            
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
        setImage("Exterior/PerroLeftStop.png");
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
        setImage("Exterior/PerroRightStop.png");
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
        setImage("Exterior/PerroUpStop.png");
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
        setImage("Exterior/PerroDownStop.png");
        Greenfoot.playSound("Dog.wav");
    }    
}
