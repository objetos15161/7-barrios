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
    private Counter lvl;
    private Counter vidas;
    public Hombre hombre;
    public Mujer mujer;
    public Perro perro;
    public Gato gato;
    public Male male;
    public int personaje;
    
    /**
     * Se define hacia donde da los pasos y las imagenes se cambian para
     * simular que el personaje esta en movimiento
     */
    public void act() 
    {
        World mundo = (Barrio)getWorld();      
        Actor mujer = getOneIntersectingObject(Mujer.class);
     if(Greenfoot.getMouseInfo()!=null)
        {
          if(Greenfoot.mousePressed(this))
           {
             /*creaNivel(lvl.getValue()); 
             lvl.add(1);*/
             //mundo.removeObject(this);
             //mundo.removeObject(mujer);
             personaje=1;
             //mundo.addObject(new SanSebastian(),300,300);
             Greenfoot.setWorld(new San_Sebastian()); 
             //mundo.addObject(new Male(), Greenfoot.getRandomNumber(mundo.getWidth()) ,Greenfoot.getRandomNumber(mundo.getHeight()));   
          }
           if(Greenfoot.mousePressed(mujer))
           {
              /*creaNivel(lvl.getValue()); 
              lvl.add(1);*/
              //mundo.removeObject(this);
              personaje=2;
              //mundo.addObject(new SanSebastian(),300,300);
              Greenfoot.setWorld(new San_Sebastian()); 
           }
        }     
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
            wait(3);
            setLocation(getX() + direction, getY());
            setImage(img2);
            wait(3);
            setLocation(getX() + direction, getY());
        }
        setImage("Personajes/MaleLeftStop.png");
    }
    
    private void walkR(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(3);
            setLocation(getX() + direction, getY());
            setImage(img2);
            wait(3);
            setLocation(getX() + direction, getY());
        }
        setImage("Personajes/MaleRightStop.png");
    }
    
    private void walkUp(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(3);
            setLocation(getX() , getY() + direction);
            setImage(img2);
            wait(3);
            setLocation(getX() , getY() + direction);
        }
        setImage("Personajes/MaleUpStop.png");
    }
    
    private void walkDown(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(3);
            setLocation(getX() , getY() + direction);
            setImage(img2);
            wait(3);
            setLocation(getX() , getY() + direction);
        }
        setImage("Personajes/MaleDownStop.png");
    }
    
}
