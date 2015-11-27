import greenfoot.*;

/**
 * Write a description of class TlaxcalaWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TlaxcalaWorld extends World
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
    static private int CELL_WIDTH=20;

    public Counter nivel;
    public Male hombre= new Male();
    /**
     * Constructor for objects of class TlaxcalaWorld.
     * 
     */
    public TlaxcalaWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(ROWS,COLS,CELL_WIDTH);
        nivel = new Counter("Barrio Tlaxcala: ");
        nivel.setValue(3);
        addObject(nivel, 5, 0);
        addObject(hombre, 12, 12);
    }
}
