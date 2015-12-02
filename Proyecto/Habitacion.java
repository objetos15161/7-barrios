import greenfoot.*;

/**
 * Escribe una descrición de la clase Habitación aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Habitacion extends Actor
{
    /**
     * Act - hace lo que Habitación quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        
    }    
    
    public void creaHabitacion(int num)
    {
        if(num==1)
        {
          setImage("House/Sillon.png");//sillon1
        }
        if(num==2)
        {
          setImage("House/Sillon2.png");//sillon2
        }
        if(num==3)
        {
           setImage("House/Cama.png");//cama
        }
        if(num==4)
        {
           setImage("House/Ordenador.png");//ordenador
        }
        if(num==5)
        {
           setImage("House/Mesa.png");//mesa
        }
        if(num==6)
        {
           setImage("House/Ventana.png");//ventana
        }
        if(num==7)
        {
           setImage("House/Barra.png");//barra
        }
        if(num==8)
        {
           setImage("House/Tapete.png");//Tapete1
        }
        if(num==9)
        {
           setImage("House/Lavamanos.png");//lavamanos
        }
        if(num==10)
        {
           setImage("House/Arbolito.png");//planta
        }
        if(num==11)
        {
           setImage("House/Refri.png");//refri
        }
        if(num==12)
        {
           setImage("House/Consola.png");//consola
        }
        if(num==13)
        {
           setImage("House/Tele.png");//tele1
        }
        if(num==14)
        {
           setImage("House/TeleMueble.png");//tele
        }
        if(num==15)
        {
           setImage("House/Alfombra.png");//Alfombra
        }       
    }
    
}
