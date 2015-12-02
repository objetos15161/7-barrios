import greenfoot.*;

/**
 * Escribe una descrición de la clase Fuera aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Fuera extends Escenario
{
    /**
     * Act - hace lo que Fuera quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        // Agrega tus códigos de acción aquí.
    }
    public void creaAfuera(int num)
    {
        if(num==1)
        {
          setImage("Exterior/LamparaPlantas.png");//Lampara2
        }
        if(num==2)
        {
          setImage("Exterior/Lampara.png");//Lampara1
        }
        if(num==3)
        {
           setImage("Exterior/Banco.png");//banco
        }
        if(num==4)
        {
           setImage("Exterior/Fuente3.1.png");//fuente3
        }
        if(num==5)
        {
          setImage("Exterior/Fuente1.png");//fuente1
        }
        if(num==6)
        {
          setImage("Exterior/Fuente2.png");//fuente2
        }
    }
}
