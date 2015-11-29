import greenfoot.*;

/**
 * Se agregan objetos al escenario
 * 
 * @author César Castro
 * @version 27/11/15
 */
public class TlaxcalaWorld extends World
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
    static private int CELL_WIDTH=20;

    public Counter nivel;
    public Male hombre= new Male();
    
    public Casa casa6=new Casa6();
    public Arbol arbol1=new Arbol1();
    public Arbol arbol2=new Arbol2();
    public Arbol arbol3=new Arbol3();
    public Arbol arbol4=new Arbol4();
    public Arbol arbol5=new Arbol5();
    
    public Fuera banco=new Banco();
    public Fuera banco1=new Banco();
    public Fuera banco2=new Banco();
    
    public Fuera lampara1=new Lampara1();
    public Fuera lampara2=new Lampara2(); 
    
    public Nivel letrero3=new Letrero3();    
    
    /**
     * Constructor for objects of class TlaxcalaWorld.
     * 
     */
    public TlaxcalaWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(ROWS,COLS,CELL_WIDTH);
        nivel = new Counter("Barrio Tlaxcala: ");
        hombre.nivel=4;
        nivel.setValue(3);
        
        addObject(casa6, 7, 6);
        
        addObject(banco, 8, 16);
        addObject(banco1, 8, 21);
        addObject(banco2, 22, 17);
                
        addObject(arbol2, 18, 3);
        addObject(arbol3, 23, 2);
               
        addObject(hombre, 22, 11);
        addObject(arbol4, 20, 20);
        addObject(arbol5, 3, 13);
        addObject(arbol1, 3, 18);
        addObject(lampara1, 15, 20);
        addObject(lampara2, 15, 12);  
        
        addObject(letrero3, 11,13);  
        
        addObject(nivel, 5, 0);
        
    }
}
