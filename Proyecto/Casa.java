import greenfoot.*;

/**
 * Escribe una descrición de la clase Casa aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Casa extends Escenario
{
    //Metodo que verifica segun la variable que imagen se selecciona para el objeto
    public void creaCasa(int num)
    {
        if(num==1)
        {
          setImage("Residencia/Casa1.png");
        }
        if(num==2)
        {
          setImage("Residencia/Casa2.png");
        }
        if(num==3)
        {
           setImage("Residencia/Casa3.png");
        }
        if(num==4)
        {
           setImage("Residencia/Casa4.png");
        }
        if(num==5)
        {
           setImage("Residencia/Casa5.png");
        }
        if(num==6)
        {
           setImage("Residencia/Casa6.png");
        }
    }
}
