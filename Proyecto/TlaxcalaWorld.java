import greenfoot.*;

/**
 * Write a description of class TlaxcalaWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TlaxcalaWorld extends World
{
    public Counter nivel;
    public Female mujer= new Female();
    /**
     * Constructor for objects of class TlaxcalaWorld.
     * 
     */
    public TlaxcalaWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
         nivel = new Counter("Barrio Tlaxcala: ");
        nivel.setValue(3);
        addObject(nivel, 280, 10);
        addObject(mujer, 200, 100);
    }
}
