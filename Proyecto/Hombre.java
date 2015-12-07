import greenfoot.*;

/**
 * Esta clase define la distancia que recorre el personaje
 * asi como las imagenes del personaje
 * 
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany) 
 * @version (10-11-15)
 */
public class Hombre extends Jugador
{
    int walk=1;
    int esp=7;

     public void walkLeft(int distance)
    {
        walkL(distance, -walk, "Personajes/MaleLeft1.png", "Personajes/MaleLeft2.png");
    }

    public void walkRight(int distance)
    {
        walkR(distance, walk, "Personajes/MaleRight1.png", "Personajes/MaleRight2.png");
    }

    public void walkUp(int distance)
    {
        walkUp(distance, -walk, "Personajes/MaleUp1.png", "Personajes/MaleUp2.png");
    }

    public void walkDown(int distance)
    {
        walkDown(distance, walk, "Personajes/MaleDown1.png", "Personajes/MaleDown2.png");
    }
    //Los siguientes metodos son para el giro de la imagen del personaje
    //Izquierda
    private void walkL(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(esp);
            setLocation(getX() + direction, getY());
            setImage(img2);
            wait(esp);
            setLocation(getX() + direction, getY());
        }
        setImage("Personajes/MaleLeftStop.png");
    }
    //Derecha
    private void walkR(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(esp);
            setLocation(getX() + direction, getY());
            setImage(img2);
            wait(esp);
            setLocation(getX() + direction, getY());
        }
        setImage("Personajes/MaleRightStop.png");
    }
    //Arriba
    private void walkUp(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(esp);
            setLocation(getX() , getY() + direction);
            setImage(img2);
            wait(esp);
            setLocation(getX() , getY() + direction);
        }
        setImage("Personajes/MaleUpStop.png");
    }
    //Abajo
    private void walkDown(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(esp);
            setLocation(getX() , getY() + direction);
            setImage(img2);
            wait(esp);
            setLocation(getX() , getY() + direction);
        }
        setImage("Personajes/MaleDownStop.png");
    }

}
