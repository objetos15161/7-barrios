import greenfoot.*;

/**
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany) 
 * @version (05/12/15)
 */
public class SanJuan extends Barrio
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
    
    private Nivel letrero6=new Letrero6();
    
    private Fuera lampara1=new Fuera();   
    private Fuera lampara2=new Fuera(); 
    private Objetos carro=new Objetos();
    private Objetos carro1=new Objetos();
    private Objetos carro2=new Objetos();
    /**
     * Constructor for objects of class SanJuan.
     * Se crea el escenario del barrio SanJuan
     */
    public SanJuan()
    {
        nivel = new Counter("Barrio San Juan de Guadalupe: ");
        nivel.setValue(6);
        hombre.escenario=6;

        casa5.creaCasa(5);
        addObject(casa5, 2, 4);
               
        arbol2.creaArbol(2);
        addObject(arbol2, 20, 3);
        arbol3.creaArbol(3);
        addObject(arbol3, 20, 16); 
        
        addObject(letrero6, 5, 8);
        carro1.creaObjetos(3);
        addObject(carro1, 2,10);
        carro2.creaObjetos(3);
        addObject(carro2, 2,12);

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
        

        addObject(nivel, 7, 0);
        addObject(atras, 20, 2); 
    }
}
