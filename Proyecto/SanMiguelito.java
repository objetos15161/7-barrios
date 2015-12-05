import greenfoot.*;

/**
 * Write a description of class SanMuguelito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SanMiguelito extends Barrio
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
    
    private Counter nivel;
    private Male hombre= new Male();
    private Casa casa5=new Casa();
    private Boton_Atras atras=new Boton_Atras();
    
    private Fuera banco=new Fuera();
    private Fuera banco1=new Fuera();
    private Fuera banco2=new Fuera();
    
    private Fuera fuente1=new Fuera();
    private Arbol arbol2=new Arbol();
    private Arbol arbol3=new Arbol();
    private Arbol arbol4=new Arbol();
    private Arbol arbol5=new Arbol();
    
    private Nivel letrero4=new Letrero1();
    
    private Fuera lampara1=new Fuera();   
    private Fuera lampara2=new Fuera(); 
    private Objetos carro=new Objetos();

    /**
     * Constructor for objects of class SanMiguelito.
     * 
     */
    public SanMiguelito()
    {
        nivel = new Counter("Barrio San Miguelito: ");
        nivel.setValue(2);
        hombre.escenario=3;

        casa5.creaCasa(5);
        addObject(casa5, 2, 4);
        
        banco.creaAfuera(3);
        addObject(banco, 16, 12);
        banco1.creaAfuera(3);
        addObject(banco1, 16, 17);
        banco.creaAfuera(3);
        addObject(banco2, 16, 7);
        fuente1.creaAfuera(5);
        addObject(fuente1, 20, 10);
        
        arbol2.creaArbol(2);
        addObject(arbol2, 20, 3);
        arbol3.creaArbol(3);
        addObject(arbol3, 20, 16); 
        
        addObject(letrero4, 5, 8);

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
