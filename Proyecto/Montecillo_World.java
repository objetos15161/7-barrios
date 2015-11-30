import greenfoot.*;

/**
 * Write a description of class Montecillo_World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Montecillo_World extends World
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
    static private int CELL_WIDTH=20;

    public Counter nivel;
    public Male hombre= new Male();

    private Nivel letrero2=new Letrero2();
    public Casa casa5=new Casa5();
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

    public Fuera fuente1=new Fuente1();
    public Objetos carro=new Carro();

    /**
     * Constructor for objects of class Montecillo_World.
     * 
     */
    public Montecillo_World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(ROWS,COLS,CELL_WIDTH);
        nivel = new Counter("Barrio Montecillo: ");
        nivel.setValue(2);
        hombre.nivel=5;

        addObject(casa5, 2, 4);
        
        addObject(banco, 16, 12);
        addObject(banco1, 16, 17);
        addObject(banco2, 16, 7);

        addObject(fuente1, 20, 10);

        addObject(arbol2, 20, 3);
        addObject(arbol3, 20, 16);  
        addObject(letrero2, 5, 8);

        addObject(hombre, 11, 1);
        addObject(arbol4, 20, 20);
        addObject(arbol5, 3, 16);
        addObject(arbol1, 3, 19);
        addObject(lampara1, 8, 14);
        addObject(lampara2, 8, 7);
        addObject(carro, 16,22);       

        addObject(nivel, 5, 0);

    }
}
