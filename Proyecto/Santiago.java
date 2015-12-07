import greenfoot.*;

/**
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany) 
 * @version (05/12/15)
 */
public class Santiago extends Barrio
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
    
    private Counter nivel;
    private Male hombre= new Male();
    private Casa casa5=new Casa();
    private Boton_Atras atras=new Boton_Atras();
        
    private Arbol arbol2=new Arbol();
    private Arbol arbol3=new Arbol();
    private Arbol arbol4=new Arbol();
    private Arbol arbol5=new Arbol();
    
    private Nivel letrero4=new Letrero4();
    
    private Fuera lampara1=new Fuera();   
    private Fuera lampara2=new Fuera(); 
    private Objetos carro=new Objetos();
    private Objetos carro1=new Objetos();

    /**
     * Constructor for objects of class Santiago.
     * Se crea el escenario del barrio Santiago
     */
    public Santiago()
    {
        nivel = new Counter("Barrio Santiago: ");
        
        nivel.setValue(4);
        hombre.escenario=4;

        casa5.creaCasa(6);
        addObject(casa5, 0, 2);
                            
        arbol2.creaArbol(2);
        addObject(arbol2, 11, 18);
        arbol3.creaArbol(3);
        addObject(arbol3, 20, 16); 
        
        addObject(letrero4, 5, 8);

        addObject(hombre, 11, 1);
        
        arbol4.creaArbol(4);
        addObject(arbol4, 20, 20);
        arbol5.creaArbol(5);
        addObject(arbol5, 3, 17);
        
        
        lampara1.creaAfuera(2);
        addObject(lampara1, 15, 7);
        lampara2.creaAfuera(1);
        addObject(lampara2, 8, 7);
        
        carro.creaObjetos(3);
        addObject(carro, 19,5); 
        carro.creaObjetos(3);
        addObject(carro1, 19,3); 

        addObject(nivel, 5, 0);
        addObject(atras, 20, 2); 
    }
}
