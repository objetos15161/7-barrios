import greenfoot.*;

/**
 * Write a description of class San_Sebastian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class San_Sebastian extends World
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
    static private int CELL_WIDTH=20;

    public Counter nivel;
    public Male hombre= new Male();
    
    private Casa casa6=new Casa6();  
    
    private Objetos num40d=new Num40D();
    private Objetos num40i=new Num40I();
    private Objetos num40ab=new Num40Ab();
    
    /**
     * Constructor for objects of class San_Sebastian.
     * 
     */
    public San_Sebastian()
    {
        super(ROWS,COLS,CELL_WIDTH);

        nivel = new Counter("Barrio San Sebastian: ");
        nivel.setValue(1);        

        addObject(casa6, 12,0); 
        
        addObject(num40d, 23, 11); 
        addObject(num40i, 0, 11); 
        addObject(num40ab, 12, 23); 
        

        addObject(nivel, 5, 0);
        addObject(hombre, 2, 11);  
        
        
        
    }
}
