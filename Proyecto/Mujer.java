import greenfoot.*;

/**
 * Esta clase define la distancia que recorre el personaje
 * asi como las imagenes del personaje
 * 
 * @cesar4206 (Castro Pérez César) 
 * @version (10-11-15)
 */
public class Mujer extends Jugador
{
   public Female female;  
   public Mujer mujer;
   public Hombre hombre;
   public int personaje;
   private int p=6;
    /**
     * Se define hacia donde da los pasos y las imagenes se cambian para
     * simular que el personaje esta en movimiento
     */
    public void act() 
    {
         World mundo = (Barrio)getWorld();      
       
    if(Greenfoot.getMouseInfo()!=null)
       {
        if(Greenfoot.mousePressed(this))
          {
             /*creaNivel(lvl.getValue()); 
             lvl.add(1);*/      
             personaje=2;
             //mundo.addObject(new SanSebastian(),100,100);
             //mundo.removeObject(this);             
             //mundo.addObject(new Female(), Greenfoot.getRandomNumber(mundo.getWidth()) ,Greenfoot.getRandomNumber(mundo.getHeight()));
             Greenfoot.setWorld(new San_Sebastian()); 
             
        }
           if(Greenfoot.mousePressed(hombre))
           {
              /*creaNivel(lvl.getValue()); 
              lvl.add(1);
           } */
           personaje=1;
           //mundo.addObject(new SanSebastian(),100,100);          
           //mundo.removeObject(this);
           Greenfoot.setWorld(new San_Sebastian()); 
        }     
    }
   }
    
    public void walkLeft(int distance)
    {
        walkL(distance, -1, "Personajes/FemaleLeft1.png", "Personajes/FemaleLeft2.png");
    }
    
    public void walkRight(int distance)
    {
        walkR(distance, 1, "Personajes/FemaleRight1.png", "Personajes/FemaleRight2.png");
    }
    
    public void walkUp(int distance)
    {
        walkUp(distance, -1, "Personajes/FemaleUp1.png", "Personajes/FemaleUp2.png");
    }
    
    public void walkDown(int distance)
    {
        walkDown(distance, 1, "Personajes/FemaleDown1.png", "Personajes/FemaleDown2.png");
    }
    
    private void walkL(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(p);
            setLocation(getX() + direction, getY());
            setImage(img2);
            wait(p);
            setLocation(getX() + direction, getY());
        }
        setImage("Personajes/FemaleLeftStop.png");
    }
    
    private void walkR(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(p);
            setLocation(getX() + direction, getY());
            setImage(img2);
            wait(p);
            setLocation(getX() + direction, getY());
        }
        setImage("Personajes/FemaleRightStop.png");
    }
    
    private void walkUp(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(p);
            setLocation(getX() , getY() + direction);
            setImage(img2);
            wait(p);
            setLocation(getX() , getY() + direction);
        }
        setImage("Personajes/FemaleUpStop.png");
    }
    
    private void walkDown(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            wait(p);
            setLocation(getX() , getY() + direction);
            setImage(img2);
            wait(p);
            setLocation(getX() , getY() + direction);
        }
        setImage("Personajes/FemaleDownStop.png");
    }
}
