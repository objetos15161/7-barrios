import greenfoot.*;

/**
 * Write a description of class Mujer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mujer extends Jugador
{
    /**
     * Se define hacia donde da los pasos y las imagenes se cambian para
     * simular que el personaje esta en movimiento
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void walkLeft(int distance)
    {
        walkL(distance, -1, "FemaleLeft1.png", "FemaleLeft2.png");
    }
    
    public void walkRight(int distance)
    {
        walkR(distance, 1, "FemaleRight1.png", "FemaleRight2.png");
    }
    
    public void walkUp(int distance)
    {
        walkUp(distance, -1, "FemaleUp1.png", "FemaleUp2.png");
    }
    
    public void walkDown(int distance)
    {
        walkDown(distance, 1, "FemaleDown1.png", "FemaleDown2.png");
    }
    
    private void walkL(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(4);
            setLocation(getX() + direction, getY());
            setImage(img2);
            wait(4);
            setLocation(getX() + direction, getY());
        }
        setImage("FemaleLeftStop.png");
    }
    
    private void walkR(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(4);
            setLocation(getX() + direction, getY());
            setImage(img2);
            wait(4);
            setLocation(getX() + direction, getY());
        }
        setImage("FemaleRightStop.png");
    }
    
    private void walkUp(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(4);
            setLocation(getX() , getY() + direction);
            setImage(img2);
            wait(4);
            setLocation(getX() , getY() + direction);
        }
        setImage("FemaleUpStop.png");
    }
    
    private void walkDown(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(4);
            setLocation(getX() , getY() + direction);
            setImage(img2);
            wait(4);
            setLocation(getX() , getY() + direction);
        }
        setImage("FemaleDownStop.png");
    }
}
