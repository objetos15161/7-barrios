import greenfoot.*;

/**
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany) 
 * @version (05/12/15)
 */
public class Centro extends Barrio
{  
    static private final int ROWS = 24;
    static private final int COLS = 24;
    
    private Counter nivel;
    private Male hombre= new Male();
    private Boton_Atras atras=new Boton_Atras();

    private Fuera fuente1=new Fuera();
    private Arbol arbol2=new Arbol();
    private Arbol arbol3=new Arbol();
    private Arbol arbol4=new Arbol();
    private Arbol arbol5=new Arbol();

    private Nivel letrero4=new Letrero1();

    private Fuera lampara1=new Fuera();   
    private Fuera lampara2=new Fuera(); 
   
    /**
     * Constructor for objects of class Centro.
     * 
     */
    public Centro()
    {
        nivel = new Counter("Centro: ");
        nivel.setValue(0);
        hombre.escenario=8;
        
        fuente1.creaAfuera(4);
        addObject(fuente1, 12, 11);

        arbol2.creaArbol(2);
        addObject(arbol2, 3, 2);
        arbol3.creaArbol(3);
        addObject(arbol3, 20, 2); 

        addObject(letrero4, 5, 8);

        addObject(hombre, 11, 1);

        arbol4.creaArbol(4);
        addObject(arbol4, 20, 17);
        arbol5.creaArbol(5);
        addObject(arbol5, 3, 17);

        lampara1.creaAfuera(2);
        addObject(lampara1, 8, 14);
        lampara2.creaAfuera(1);
        addObject(lampara2, 8, 7);
        
        lampara1.creaAfuera(2);
        addObject(lampara1, 15, 7);
        lampara2.creaAfuera(1);
        addObject(lampara2, 15, 14);

        addObject(nivel, 5, 0);
        addObject(atras, 20, 2); 
    }
}
