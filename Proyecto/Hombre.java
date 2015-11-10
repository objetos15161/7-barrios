import greenfoot.*;

/**
 * Esta clase define la distancia que recorre el personaje
 * asi como las imagenes del personaje
 * 
 * @cesar4206 (Castro Pérez César) 
 * @version (10-11-15)
 */
public class Hombre extends Jugador
{
    /**
     * Se define hacia donde da los pasos y las imagenes se cambian para
     * simular que el personaje esta en movimiento dependiendo la tecla 
     * que se oprima
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void walkLeft(int distance)
    {
        walkL(distance, -1, "Personajes/MaleLeft1.png", "Personajes/MaleLeft2.png");
    }
    
    public void walkRight(int distance)
    {
        walkR(distance, 1, "Personajes/MaleRight1.png", "Personajes/MaleRight2.png");
    }
    
    public void walkUp(int distance)
    {
        walkUp(distance, -1, "Personajes/MaleUp1.png", "Personajes/MaleUp2.png");
    }
    
    public void walkDown(int distance)
    {
        walkDown(distance, 1, "Personajes/MaleDown1.png", "Personajes/MaleDown2.png");
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
        setImage("Personajes/MaleLeftStop.png");
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
        setImage("Personajes/MaleRightStop.png");
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
        setImage("Personajes/MaleUpStop.png");
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
        setImage("Personajes/MaleDownStop.png");
    }
    
}
