import greenfoot.*;

/**
 * Se agregan objetos al escenario
 * 
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany)
 * @version 27/11/15
 */
public class TlaxcalaWorld extends Barrio
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
    private Counter nivel;
    private Male hombre= new Male();
    private Boton_Atras atras=new Boton_Atras();
    
    private Casa casa6=new Casa();
    private Arbol arbol1=new Arbol();
    private Arbol arbol2=new Arbol();
    private Arbol arbol3=new Arbol();
    private Arbol arbol4=new Arbol();
    private Arbol arbol5=new Arbol();
    
    private Fuera banco=new Fuera();
    private Fuera banco1=new Fuera();
    private Fuera banco2=new Fuera();
    
    private Fuera lampara1=new Fuera();
    private Fuera lampara2=new Fuera(); 
    
    private Nivel letrero7=new Letrero7();    
    
    /**
     * Constructor for objects of class TlaxcalaWorld.
     * Se crea el escenario del barrio Tlaxcala
     */
    public TlaxcalaWorld()
    {    
        nivel = new Counter("Barrio Tlaxcala: ");
        
        hombre.escenario=7;
        nivel.setValue(7);
        
        casa6.creaCasa(6);
        addObject(casa6, 7, 6);
        
        banco.creaAfuera(3);
        addObject(banco, 8, 16);
        banco1.creaAfuera(3);
        addObject(banco1, 8, 21);
        banco2.creaAfuera(3);
        addObject(banco2, 22, 17);
        
        arbol2.creaArbol(2);
        addObject(arbol2, 18, 3);
        arbol3.creaArbol(3);
        addObject(arbol3, 23, 2);
               
        addObject(hombre, 22, 11);
        arbol4.creaArbol(4);
        addObject(arbol4, 20, 20);
        arbol5.creaArbol(5);
        addObject(arbol5, 3, 13);
        arbol1.creaArbol(1);
        addObject(arbol1, 3, 18);
        
        lampara1.creaAfuera(2);
        addObject(lampara1, 15, 20);
        lampara2.creaAfuera(1);
        addObject(lampara2, 15, 12);  
        
        addObject(letrero7, 11,13);  
        
        addObject(nivel, 5, 0);
        addObject(atras, 20, 2);  
            }
}
