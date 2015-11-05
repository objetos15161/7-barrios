import greenfoot.*;

/**
 * Write a description of class Hombre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hombre extends Jugador
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
        walkL(distance, -1, "MaleLeft1.png", "MaleLeft2.png");
    }
    
    public void walkRight(int distance)
    {
        walkR(distance, 1, "MaleRight1.png", "MaleRight2.png");
    }
    
    public void walkUp(int distance)
    {
        walkUp(distance, -1, "MaleUp1.png", "MaleUp2.png");
    }
    
    public void walkDown(int distance)
    {
        walkDown(distance, 1, "MaleDown1.png", "MaleDown2.png");
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
        setImage("MaleLeftStop.png");
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
        setImage("MaleRightStop.png");
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
        setImage("MaleUpStop.png");
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
        setImage("MaleDownStop.png");
    }
    
}
