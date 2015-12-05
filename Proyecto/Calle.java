import greenfoot.*;

/**
 * Escribe una descrición de la clase Calle aquí.
 * 
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany) 
 * @versión (Un número de versión o una fecha)
 */
public class Calle extends Barrio
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
    private Counter nivel;
    private Male hombre= new Male();
    private Boton_Atras atras=new Boton_Atras();
   
    private Casa casa1=new Casa();
    private Casa casa4=new Casa();
    private Casa casa3=new Casa();
    private Casa casa2=new Casa();
    private PuertaCasa door2= new  PuertaCasa();
    
    private Fuera lampara1=new Fuera();
    private Fuera lampara2=new Fuera();
    
    
        
    private Objetos carro=new Objetos();
    private Objetos carro1=new Objetos();
    private Objetos carro2=new Objetos();
    
    private Objetos num50d=new Objetos();
    private Objetos num50i=new Objetos();
    
    
    private Arbol arbol5=new Arbol();
    
    /**
     * Constructor for objects of class San_Sebastian.
     * 
     */
    public Calle()
    {        
        hombre.escenario=0;
        

        nivel = new Counter("Calle: ");
        nivel.setValue(0);        

        casa1.creaCasa(1);
        addObject(casa1, 3,1);
        casa4.creaCasa(4);
        addObject(casa4, 21,0);
        casa3.creaCasa(3);
        addObject(casa3, 12,1);

        addObject(door2, 12,4);
        
        carro.creaObjetos(3);
        addObject(carro, 7, 9);
        carro1.creaObjetos(3);
        addObject(carro1, 15, 9);
        carro2.creaObjetos(3);
        addObject(carro2, 20, 9);
        num50d.creaObjetos(7);
        addObject(num50d, 23, 11); 
        num50i.creaObjetos(5);
        addObject(num50i, 0, 11); 
        
        addObject(nivel, 5, 0);
        addObject(hombre, 12, 7);
        
        arbol5.creaArbol(5);
        addObject(arbol5, 3,17);        
        
        casa2.creaCasa(2);
        addObject(casa2, 20,21);
        
        lampara1.creaAfuera(2);
        addObject(lampara1, 15, 13); 
        lampara2.creaAfuera(1);
        addObject(lampara2, 8, 13); 
        addObject(atras, 20, 2); 
    }
}
