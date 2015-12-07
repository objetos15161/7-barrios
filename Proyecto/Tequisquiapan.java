import greenfoot.*;

/**
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany) 
 * @version (05/12/15)
 */
public class Tequisquiapan extends Barrio
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
    
    private Counter nivel;
    private Male hombre= new Male();
    private Casa casa5=new Casa();
    private Boton_Atras atras=new Boton_Atras();
    
    private Fuera fuente1=new Fuera();
    private Arbol arbol2=new Arbol();
    private Arbol arbol3=new Arbol();
    private Arbol arbol4=new Arbol();
    private Arbol arbol5=new Arbol();
    
    private Nivel letrero5=new Letrero5();
    
    private Fuera lampara1=new Fuera();   
    private Fuera lampara2=new Fuera(); 
    
    private Fuera fuente2=new Fuera();
    
    /**
     * Constructor for objects of class Tequisquiapan.
     * Se crea el escenario del barrio Tequisquipan
     */
    public Tequisquiapan()
    {
        nivel = new Counter("Barrio Tequisquiapan: ");
        
        nivel.setValue(5);
        hombre.escenario=5;

        casa5.creaCasa(4);
        addObject(casa5, 2, 3);
        
        arbol2.creaArbol(2);
        addObject(arbol2, 20, 3);
        arbol3.creaArbol(3);
        addObject(arbol3, 20, 16); 
        
        addObject(letrero5, 15, 8);

        addObject(hombre, 11, 1);
        
        arbol4.creaArbol(4);
        addObject(arbol4, 20, 20);
        arbol5.creaArbol(5);
        addObject(arbol5, 3, 17);
        
        fuente2.creaAfuera(6);
        addObject(fuente2, 11, 19);
        
        lampara1.creaAfuera(2);
        addObject(lampara1, 8, 14);
        lampara2.creaAfuera(1);
        addObject(lampara2, 8, 7);
        
        addObject(nivel, 5, 0);
        addObject(atras, 20, 2); 
    }
}
