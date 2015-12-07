import greenfoot.*;

/**
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany) 
 * @version (05/12/15)
 */
public class San_Sebastian extends Barrio
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
    private Counter nivel;
    private Boton_Atras atras=new Boton_Atras();
    private Male hombre= new Male();

    private Casa casa6=new Casa();

    private Objetos num40i=new Objetos();
    private Objetos num40ab=new Objetos();

    private Nivel letrero1=new Letrero1();
        
    private Arbol arbol2=new Arbol();
    private Arbol arbol3=new Arbol();
    private Arbol arbol4=new Arbol();
    private Arbol arbol5=new Arbol();

    private Fuera banco=new Fuera();
    private Fuera banco1=new Fuera();
    private Fuera banco2=new Fuera();

    private Fuera lampara1=new Fuera();   
    private Fuera lampara2=new Fuera(); 

    private Fuera fuente2=new Fuera();
    private Objetos carro=new Objetos();

    /**
     * Constructor for objects of class San_Sebastian.
     * Se crea el escenario del barrio San Sebastian
     */
    public San_Sebastian()
    {        
        nivel = new Counter("Barrio San Sebastian: ");
        
        hombre.escenario=1;
        
        nivel.setValue(1);     
        
        casa6.creaCasa(6);
        addObject(casa6, 12,0);
        
        num40i.creaObjetos(1);
        addObject(num40i, 0, 11);
        num40ab.creaObjetos(4);
        addObject(num40ab, 12, 23); 
        
        addObject(letrero1, 8,7);     
        
        banco.creaAfuera(3);
        addObject(banco, 15, 12);
        banco1.creaAfuera(3);
        addObject(banco1, 15, 17);
        banco2.creaAfuera(3);
        addObject(banco2, 8, 19);
        
        fuente2.creaAfuera(6);
        addObject(fuente2, 20, 10);
        
        arbol2.creaArbol(2);
        addObject(arbol2, 2, 3);
        arbol3.creaArbol(3);
        addObject(arbol3, 20, 16);       

        addObject(hombre, 2, 11);
        
        arbol4.creaArbol(4);
        addObject(arbol4, 20, 20);
        arbol5.creaArbol(5);
        addObject(arbol5, 3, 18);
               
        lampara1.creaAfuera(2);
        addObject(lampara1, 8, 14);
        lampara2.creaAfuera(1);
        addObject(lampara2, 15, 7);  

        carro.creaObjetos(3);
        addObject(carro, 2,9);       

        addObject(nivel, 5, 0);
        addObject(atras, 20, 2); 
                
    }
}
