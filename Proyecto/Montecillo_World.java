import greenfoot.*;

/**
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany) 
 * @version (05/12/15)
 */
public class Montecillo_World extends Barrio
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
    static private int CELL_WIDTH=20;

    private Counter nivel;
    private Male hombre= new Male();
    private Boton_Atras atras=new Boton_Atras();

    private Nivel letrero2=new Letrero2();
    private Casa casa5=new Casa();
    
    private Arbol arbol2=new Arbol();
    private Arbol arbol3=new Arbol();
    private Arbol arbol4=new Arbol();
    private Arbol arbol5=new Arbol();

    private Fuera banco=new Fuera();
    private Fuera banco1=new Fuera();
    

    private Fuera lampara1=new Fuera();   
    private Fuera lampara2=new Fuera(); 

    private Fuera fuente1=new Fuera();
    private Objetos carro=new Objetos();

    /**
     * Constructor for objects of class Montecillo_World.
     * Se crea el escenario del barrio Montecillo
     */
    public Montecillo_World()
    {    
        nivel = new Counter("Barrio Montecillo: ");
        nivel.setValue(3);
        
        hombre.escenario=2;

        casa5.creaCasa(5);
        addObject(casa5, 2, 4);
        
        banco.creaAfuera(3);
        addObject(banco, 16, 12);
        banco1.creaAfuera(3);
        addObject(banco1, 16, 17);
        fuente1.creaAfuera(5);
        addObject(fuente1, 20, 10);
        
        arbol2.creaArbol(2);
        addObject(arbol2, 20, 3);
        arbol3.creaArbol(3);
        addObject(arbol3, 20, 16); 
        
        addObject(letrero2, 5, 8);

        addObject(hombre, 11, 1);
        
        arbol4.creaArbol(4);
        addObject(arbol4, 20, 20);
        arbol5.creaArbol(5);
        addObject(arbol5, 3, 17);
               
        lampara1.creaAfuera(2);
        addObject(lampara1, 8, 14);
        lampara2.creaAfuera(1);
        addObject(lampara2, 8, 7);
        
        carro.creaObjetos(3);
        addObject(carro, 16,22);       

        addObject(nivel, 5, 0);
        addObject(atras, 20, 2); 
       }
}
