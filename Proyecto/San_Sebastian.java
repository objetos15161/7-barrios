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

    private Objetos num40i=new Num40I();
    private Objetos num40ab=new Num40Ab();

    private Nivel letrero1=new Letrero1();
    
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

    public Fuera fuente2=new Fuente2();
    public Objetos carro=new Carro();

    /**
     * Constructor for objects of class San_Sebastian.
     * 
     */
    public San_Sebastian()
    {
        super(ROWS,COLS,CELL_WIDTH);

        nivel = new Counter("Barrio San Sebastian: ");
        hombre.nivel=3;
        hombre.viene=3;
        nivel.setValue(1);        

        addObject(casa6, 12,0);         
        addObject(num40i, 0, 11); 
        addObject(num40ab, 12, 23); 
        addObject(letrero1, 8,7);     
        
        addObject(banco, 15, 12);
        addObject(banco1, 15, 17);
        addObject(banco2, 8, 19);

        addObject(fuente2, 20, 10);

        addObject(arbol2, 2, 3);
        addObject(arbol3, 20, 16);       

        addObject(hombre, 2, 11);
        addObject(arbol4, 20, 20);
        addObject(arbol5, 3, 16);
        addObject(arbol1, 3, 19);
        addObject(lampara1, 8, 14);
        addObject(lampara2, 15, 7);  

        addObject(carro, 2,9);       

        addObject(nivel, 5, 0);
    }
}
