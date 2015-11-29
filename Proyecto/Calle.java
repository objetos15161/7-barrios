import greenfoot.*;

/**
 * Escribe una descrición de la clase Calle aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Calle extends World
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
    static private int CELL_WIDTH=20;

    public Counter nivel;
    public Male hombre= new Male();
    public PuertaAbierta door= new  PuertaAbierta();

    private Casa casa1=new Casa1();
    private Casa casa4=new Casa4();
    private Casa casa3=new Casa3();
    private Casa casa2=new Casa2();
    public PuertaCasa door2= new  PuertaCasa();
    
    private Fuera lampara1=new Lampara1();
    private Fuera lampara2=new Lampara2();
    
    private Arbol arbolote=new Arbolote(); 
    
    private Objetos carro=new Carro();
    private Objetos num50d=new Num50D();
    private Objetos num50i=new Num50I();
    
    public Arbol arbol5=new Arbol5();
    
    /**
     * Constructor for objects of class San_Sebastian.
     * 
     */
    public Calle()
    {
        super(ROWS,COLS,CELL_WIDTH);
        hombre.nivel=2;
        hombre.viene=1;

        nivel = new Counter("Casa: ");
        nivel.setValue(0);        

        addObject(casa1, 3,1);
        addObject(casa4, 21,0);
        addObject(casa3, 12,1);

        addObject(door2, 12,4);
        
        addObject(carro, 7, 9);
        addObject(num50d, 23, 11); 
        addObject(num50i, 0, 11); 
        
        addObject(nivel, 5, 0);
        addObject(hombre, 12, 7); 
        addObject(arbol5, 3,17);        
        addObject(casa2, 20,21);
        addObject(lampara1, 15, 13); 
        addObject(lampara2, 8, 13); 
    }
}
