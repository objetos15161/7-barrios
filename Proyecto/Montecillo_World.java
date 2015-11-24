import greenfoot.*;

/**
 * Write a description of class Montecillo_World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Montecillo_World extends World
{
    public Counter nivel;
    public Female mujer= new Female();
    public PuertaCerrada door= new  PuertaCerrada();
    /**
     * Constructor for objects of class Montecillo_World.
     * 
     */
    public Montecillo_World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        nivel = new Counter("Barrio Montecillo: ");
        nivel.setValue(2);
        addObject(nivel, 280, 10);
        addObject(mujer, 200, 100);
        addObject(door, 100,50);
    }
}
